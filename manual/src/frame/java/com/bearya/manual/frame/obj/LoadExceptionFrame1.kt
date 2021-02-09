package com.bearya.manual.frame.obj

import android.os.Build
import com.bearya.manual.R
import com.bearya.manual.frame.ExceptionFrame

object LoadExceptionFrame1:ExceptionFrame {
    override val exceptionImage: Int = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) R.drawable.do_exception else  R.drawable.do_exception_pic
    override val music: String="music/mission_error_5.mp3"
}