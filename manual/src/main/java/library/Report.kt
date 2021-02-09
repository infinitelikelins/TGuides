package library

import com.tencent.bugly.crashreport.CrashReport
import kotlin.concurrent.thread

/**
 * 错误日志
 */
fun error(message: String?) = thread { CrashReport.postCatchedException(Exception(message ?: "捕捉到异常")) }