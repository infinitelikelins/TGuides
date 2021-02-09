package com.bearya.manual.install

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.bearya.manual.BuildConfig
import library.ext.downloadPath
import java.io.File

class InstallBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_PACKAGE_REPLACED, Intent.ACTION_PACKAGE_REMOVED -> deleteApk(context)
        }
    }

    private fun deleteApk(context: Context?) {
        Thread {
            File(BuildConfig.APP_DOWNLOAD_NAME.downloadPath(context)).takeIf { it.exists() }?.delete()
            File("manual.apk".downloadPath(context)).takeIf { it.exists() }?.delete()
        }.start()
    }

}