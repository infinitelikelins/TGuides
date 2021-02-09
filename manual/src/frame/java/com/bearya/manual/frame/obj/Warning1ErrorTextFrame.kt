package com.bearya.manual.frame.obj

import com.bearya.manual.frame.ErrorTextFrame

object Warning1ErrorTextFrame : ErrorTextFrame {
    override val errorText: String
        get() = "前方没有路了\n任务失败"
    override val errorMusic: String
        get() = "music/w_warning1.mp3"
}