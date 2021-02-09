package com.bearya.service

import android.bluetooth.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.lifecycleScope
import com.orhanobut.logger.Logger
import kotlinx.coroutines.*
import library.*
import java.io.InputStream
import java.nio.charset.StandardCharsets
import kotlin.concurrent.thread

class BluetoothMonitorService : LifecycleService() {

    companion object {
        fun start(context: Context?) {
            if (BluetoothAdapter.getDefaultAdapter().isEnabled) {
                context?.startService(Intent(context, BluetoothMonitorService::class.java))
            }
        }
    }

    private val bluetoothAdapter: BluetoothAdapter? by lazy {
        (getSystemService(Context.BLUETOOTH_SERVICE) as? BluetoothManager?)?.adapter
            ?: BluetoothAdapter.getDefaultAdapter()
    }

    @Volatile
    private var serviceActive = false

    @Volatile
    private var isLive = false

    @Volatile
    private var inputStream: InputStream? = null

    @Volatile
    private var bluetoothSocket: BluetoothSocket? = null

    @Volatile
    private var bluetoothServerSocket: BluetoothServerSocket? = null

    private var socketConnectStatusReceiver: BroadcastReceiver? = null

    private var connectStatus: SocketConnectStatus? = null
        set(updateNewStatus) {
            Logger.t("SERVER").d("${updateNewStatus?.value}")
            if (updateNewStatus?.value != field?.value) {
                val updateBeforeStatus = field
                if (updateNewStatus != null) sendBroadcast(Intent(updateNewStatus.value))
                field = updateNewStatus
                if ((field == SocketConnectStatus.DISCONNECTED && updateBeforeStatus != SocketConnectStatus.CONNECT_FAIL)
                    || (field == SocketConnectStatus.CONNECT_FAIL && updateBeforeStatus != SocketConnectStatus.DISCONNECTED)) {
                    stopThread()
                    lifecycleScope.launch {
                        delay(2000)
                        withContext(Dispatchers.Main) {
                            if (serviceActive) {
                                start(this@BluetoothMonitorService)
                            }
                        }
                    }
                }
            }
        }

    @Volatile
    private var thread: Thread? = null

    override fun onCreate() {
        super.onCreate()

        serviceActive = true

        val intentFilter = IntentFilter().apply {
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
            addAction(BluetoothDevice.ACTION_ACL_CONNECTED)
            addAction(ACTION_STOP_SERVICE)
        }

        socketConnectStatusReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    ACTION_STOP_SERVICE -> stopSelf().also { Logger.d("BroadcastReceiver ACTION_STOP_SERVICE stopSelf") }
                    BluetoothDevice.ACTION_ACL_CONNECTED -> connectStatus = SocketConnectStatus.CONNECTED
                    BluetoothDevice.ACTION_ACL_DISCONNECTED -> connectStatus = SocketConnectStatus.DISCONNECTED
                }
            }
        }

        registerReceiver(socketConnectStatusReceiver, intentFilter)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        thread = thread {

            connectStatus = SocketConnectStatus.CONNECT_INIT

            bluetoothServerSocket = try {
                bluetoothAdapter?.listenUsingInsecureRfcommWithServiceRecord(APP_ID, bluetoothUUID)
            } catch (ex: Exception) {
                null
            }

            connectStatus = SocketConnectStatus.WAITING_CONNECT

            var isAccepted: Boolean

            if (bluetoothServerSocket == null) {
                isAccepted = false
            } else {
                try {
                    bluetoothSocket = bluetoothServerSocket!!.accept()
                    isAccepted = true
                } catch (e: Exception) {
                    error("${e.message}")
                    isAccepted = false
                } finally {
                    bluetoothServerSocket?.close()
                    bluetoothServerSocket = null
                }
            }

            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                error("${e.message}")
            }

            if (!isAccepted) {
                if (serviceActive) {
                    connectStatus = SocketConnectStatus.CONNECT_FAIL
                }
            } else {
                try {
                    isLive = true
                    inputStream = bluetoothSocket!!.inputStream
                    while (isLive) {
                        if (inputStream == null) {
                            isLive = false
                            connectStatus = SocketConnectStatus.CONNECT_FAIL
                        } else {
                            val count = inputStream!!.available()
                            if (count > 0) {
                                val buf = ByteArray(count)
                                val read = inputStream!!.read(buf)
                                read.takeIf { it > 0 }?.apply {
                                    val message = String(buf, StandardCharsets.UTF_8)
                                    sendBroadcast(
                                        Intent(ACTION_BLUETOOTH_MESSAGE).putExtra(
                                            BLUETOOTH_MESSAGE,
                                            message
                                        )
                                    )
                                }
                            }
                        }
                    }
                } catch (e: Exception) {
                    error("${e.message}")
                    connectStatus = SocketConnectStatus.CONNECT_FAIL
                }
            }
        }

        return START_NOT_STICKY
    }

    private fun stopThread() {
        isLive = false
        inputStream?.close()
        inputStream = null
        bluetoothSocket?.close()
        bluetoothSocket = null
        bluetoothServerSocket?.close()
        bluetoothServerSocket = null
        thread?.interrupt()
        thread = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.d("BluetoothMonitorService onDestroy")
        serviceActive = false
        lifecycleScope.cancel()
        unregisterReceiver(socketConnectStatusReceiver)
        socketConnectStatusReceiver = null
        stopThread()
    }

}

enum class SocketConnectStatus(val value: String) {
    CONNECT_INIT("连接初始化"),
    WAITING_CONNECT("等待连接"),
    CONNECTED("已连接"),
    CONNECT_FAIL("连接失败"),
    DISCONNECTED("已断开");
}