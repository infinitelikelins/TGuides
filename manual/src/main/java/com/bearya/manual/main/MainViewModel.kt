package com.bearya.manual.main

import android.app.Application
import android.bluetooth.BluetoothAdapter
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.lifecycle.*
import androidx.startup.AppInitializer
import com.bearya.component.Api
import com.bearya.data.bean.UpdateInfo
import com.bearya.manual.App
import com.bearya.manual.AppDatabase
import com.bearya.manual.BuildConfig
import com.bearya.manual.DatabaseInitializer
import com.bearya.service.BluetoothMonitorService
import com.bearya.service.SocketConnectStatus
import kotlinx.coroutines.launch
import library.*

import library.ext.setData
import java.text.SimpleDateFormat
import java.util.*

class MainViewModel(application: Application) : AndroidViewModel(application) {

    init {
        AppDatabase.instance = AppInitializer.getInstance(application.applicationContext).initializeComponent(DatabaseInitializer::class.java)
        BluetoothMonitorService.start(application.applicationContext)
    }

    private val app: App by lazy { getApplication<App>() }

    val bluetoothState: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }

    val bluetoothName by lazy { BluetoothAdapter.getDefaultAdapter()?.name }

    private val updateInfo: MutableLiveData<UpdateInfo> by lazy { MutableLiveData<UpdateInfo>() }

    private val bluetoothStateBroadcastReceiver: BroadcastReceiver by lazy {
        object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                when (intent?.action) {
                    SocketConnectStatus.CONNECTED.value -> bluetoothState.setData(STATE_CONNECTED)
                    SocketConnectStatus.DISCONNECTED.value -> bluetoothState.setData(STATE_NONE)
                    SocketConnectStatus.CONNECT_FAIL.value -> bluetoothState.setData(STATE_NONE)
                    SocketConnectStatus.CONNECT_INIT.value -> bluetoothState.setData(STATE_INIT)
                    SocketConnectStatus.WAITING_CONNECT.value -> bluetoothState.setData(STATE_WAITING)
                }
            }
        }
    }

    fun startCommandListen() {

        val intentFilter = IntentFilter().apply {
            addAction(SocketConnectStatus.CONNECTED.value)
            addAction(SocketConnectStatus.DISCONNECTED.value)
            addAction(SocketConnectStatus.CONNECT_FAIL.value)
            addAction(SocketConnectStatus.CONNECT_INIT.value)
            addAction(SocketConnectStatus.WAITING_CONNECT.value)
        }

        app.registerReceiver(bluetoothStateBroadcastReceiver, intentFilter)

    }

    fun reportOpenLog() {
        val displayMetrics = app.resources.displayMetrics
        viewModelScope.launch {
            try {
                Api.reportOpenLog(
                    displayPixels = "${displayMetrics.widthPixels}*${displayMetrics.heightPixels}",
                    action = "open"
                )
            } catch (exception: Exception) {
                error("${exception.message}")
            }
        }
    }

    fun checkUpdate() = viewModelScope.launch {
        try {
            val response = Api.checkAppUpdate(BuildConfig.APP_TYPE)
            updateInfo.setData(response?.data)
        } catch (exception: Exception) {
            error("${exception.message}")
        }
    }

    val currentVersion = "${BuildConfig.VERSION_NAME}.${BuildConfig.VERSION_CODE}"

    val hasNewApk: LiveData<Boolean> = updateInfo.map { info ->
        info.apk?.takeIf { it.isNotEmpty() }?.get(0)
            ?.takeIf { it.version_code > BuildConfig.VERSION_CODE }?.let { true } ?: false
    }

    val newApkDescription: LiveData<String?> = updateInfo.map { it.info?.tips }

    val newApkVersionCode: LiveData<String?> = updateInfo.map { "最新版本 : ${it.info?.version}" }

    val newApkUrl: LiveData<String?> = updateInfo.map { it.apk?.get(0)?.url }

    val newApkSize: LiveData<String?> = updateInfo.map { "下载大小 : ${it.apk?.get(0)?.pack_size?.div(1048576)} Mb" }

    val newApkCreateTime: LiveData<String?> = updateInfo.map {
        "更新时间 : ${SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(Date(it.info?.create_time?.times(1000) ?: System.currentTimeMillis()))}"
    }

    override fun onCleared() {
        super.onCleared()
        AppDatabase.instance.close()
        app.sendBroadcast(Intent(ACTION_STOP_SERVICE))
        app.unregisterReceiver(bluetoothStateBroadcastReceiver)
    }

}