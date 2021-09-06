package com.bearya.manual

import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.multidex.MultiDex
import com.bearya.manual.install.InstallBroadcastReceiver
import com.liulishuo.filedownloader.FileDownloader
import com.liulishuo.filedownloader.connection.FileDownloadUrlConnection
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import com.tencent.bugly.crashreport.CrashReport
import library.DefaultBinding

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(DefaultBinding)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        Logger.addLogAdapter(object : AndroidLogAdapter(
            PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)
                .methodCount(5)
                .tag("LOGGER")
                .build()
        ) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })

        CrashReport.setIsDevelopmentDevice(applicationContext, BuildConfig.DEBUG)
        CrashReport.initCrashReport(applicationContext, BuildConfig.BuglyAppKey, BuildConfig.DEBUG,
            CrashReport.UserStrategy(applicationContext)
                .apply { appVersion = BuildConfig.VERSION_NAME })

        registerReceiver(InstallBroadcastReceiver(), IntentFilter(Intent.ACTION_PACKAGE_REPLACED).apply {
            addAction(Intent.ACTION_PACKAGE_ADDED)
            addAction(Intent.ACTION_PACKAGE_REMOVED)
            addDataScheme("package")
        })

        FileDownloader.setupOnApplicationOnCreate(this)
            .connectionCreator(
                FileDownloadUrlConnection.Creator(
                    FileDownloadUrlConnection.Configuration()
                        .connectTimeout(15000)
                        .readTimeout(15000)
                )
            ).commit()

    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }

}