package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.ExceptionFrame

object StopExceptionFrame:ExceptionFrame {
    override val exceptionImage: Int = R.drawable.no_entry
    override val music: String = "music/mission_fail_5.mp3"
}