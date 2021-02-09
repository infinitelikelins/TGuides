package com.bearya.manual.frame

import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.bearya.manual.R
import com.bearya.manual.databinding.ActivityFrameBinding
import es.dmoral.toasty.Toasty
import library.ACTION_BLUETOOTH_MESSAGE
import library.BLUETOOTH_MESSAGE
import library.Music

class FrameAppCompatActivity : AppCompatActivity() {

    private lateinit var bindView: ActivityFrameBinding
    private val viewModel: FrameViewModel by viewModels()

    private val broadcastReceiver: FrameReceiver = FrameReceiver()

    private inner class FrameReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (ACTION_BLUETOOTH_MESSAGE == intent?.action) {
                val command = intent.getStringExtra(BLUETOOTH_MESSAGE)
                viewModel.receive(command)
            } else if (BluetoothDevice.ACTION_ACL_DISCONNECTED == intent?.action) {
                finish()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindView = DataBindingUtil.setContentView(this, R.layout.activity_frame)
        bindView.lifecycleOwner = this

        Music.init(applicationContext)

        val intentFilter = IntentFilter(ACTION_BLUETOOTH_MESSAGE)
        intentFilter.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
        registerReceiver(broadcastReceiver, intentFilter)

    }

    override fun onStart() {
        super.onStart()
        viewModel.scene.observe(this) {
            updateUI(it)
        }
    }

    private fun updateUI(fragment: Fragment?) = fragment?.also {
        supportFragmentManager.commit {
            replace(R.id.scene, it)
        }
    }

    override fun onPause() {
        super.onPause()
        Music.stopBgMusic()
        Music.stopMusic()
    }

    override fun onDestroy() {
        super.onDestroy()
        Music.destroy()
        unregisterReceiver(broadcastReceiver)
    }

    override fun onBackPressed() {
        Toasty.warning(applicationContext, "连接未断开").show()
    }

}