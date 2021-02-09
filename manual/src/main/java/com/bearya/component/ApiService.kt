package com.bearya.component

import com.bearya.data.bean.UpdateInfo
import library.HttpResult
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

internal interface ApiService {

    /**
     * 检查后台的版本更新
     */
    @POST("/v1/source/app/update")
    @FormUrlEncoded
    suspend fun checkAppUpdate(@Field("dtype") type: Int,
                       @Field("sn") sn: String,
                       @Field("version") version: String,
                       @Field("source_version") sourceVersion: Int): HttpResult<UpdateInfo>

    /**
     * 验证码激活
     */
    @POST("/v2/material/tvCode/active")
    @FormUrlEncoded
    suspend fun activateVerify(@Field("code") code: String): HttpResult<Int>

    /**
     * 启动日志上报
     */
    @POST("/v1/user/app_open/create")
    @FormUrlEncoded
    suspend fun reportOpenLog(@Field("user_id")  userId: String,
                              @Field("mac")  mac: String,
                              @Field("equip_model")  equipModel: String,
                              @Field("manufacturer")  manufacturer: String,
                              @Field("size")  size: String,
                              @Field("appid")  appId: String,
                              @Field("app_version")  appVersion: String,
                              @Field("system_version")  systemVersion: String,
                              @Field("action")  action: String) : HttpResult<Int>

}