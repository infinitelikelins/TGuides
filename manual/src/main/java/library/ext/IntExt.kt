package library.ext

import android.content.Context

fun Int?.dp2px(context: Context): Int? = this?.times(context.resources.displayMetrics.density)?.plus(0.5f)?.toInt()