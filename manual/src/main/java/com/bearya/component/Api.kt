package com.bearya.component

import android.os.Build
import com.bearya.data.bean.UpdateInfo
import com.bearya.manual.BuildConfig
import library.HttpResult
import library.HttpRetrofit

object Api : HttpRetrofit() {

    private val api: ApiService? by lazy(mode = LazyThreadSafetyMode.NONE) {
        retrofit.create(ApiService::class.java)
    }

    /**
     * App检测更新信息
     */
    suspend fun checkAppUpdate(type: Int = 10, sn: String = ""): HttpResult<UpdateInfo>? =
            api?.checkAppUpdate(type, sn, BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)

    /**
     * 课件激活验证
     */
    suspend fun activateVerify(code: String = "0"): HttpResult<Int>? =
            api?.activateVerify(code)

    /**
     * 启动日志上报
     */
    suspend fun reportOpenLog(displayPixels: String = "1920*1080", action: String = "open"): HttpResult<Int>? =
            api?.reportOpenLog("TvUser", "null", Build.MODEL, Build.BRAND, displayPixels, BuildConfig.APPLICATION_ID,
                    "${BuildConfig.FLAVOR}.${BuildConfig.VERSION_NAME}.${BuildConfig.VERSION_CODE}",
                    Build.VERSION.RELEASE, action)

}