package com.bearya.data.bean

data class UpdateInfo(val apk: List<ApkInfo>?,
                      val info: Info?
)

data class ApkInfo(val appid: String? = null,
                   val version: Int = 0,
                   val version_code: Int = 0,
                   val min_version: Int = 0,
                   val tips: String? = null,
                   val url: String? = null,
                   val force_reboot: Int = 0,
                   val pack_size: Int = 0
)

data class Info(val version_code: Int = 0,
                val version: String? = null,
                val force_update: Int = -1,
                val tips: String? = null,
                val hardware_version: String? = null,
                val create_time: Long = 0L
)