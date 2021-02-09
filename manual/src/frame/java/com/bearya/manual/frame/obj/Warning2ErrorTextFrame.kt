package com.bearya.manual.frame.obj

import com.bearya.manual.frame.ErrorTextFrame

object Warning2ErrorTextFrame : ErrorTextFrame {
    override val errorText: String = "没有到达终点\n任务失败"
    override val errorMusic: String = "music/w_warning4.mp3"
}