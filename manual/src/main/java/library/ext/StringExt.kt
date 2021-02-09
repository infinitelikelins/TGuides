package library.ext

import android.content.Context
import android.os.Environment
import java.io.File

fun String?.assetsPath(): String =  "file:///android_asset/$this"

fun String?.downloadPath(context: Context? = null): String = "${Environment.getExternalStorageDirectory()}${File.separator}$this"

fun emotion(emotion: String?): String? = emotion?.takeIf { it.isNotBlank() }?.let { "emotion/${emotion}.json"  }