package com.bearya.manual.frame.obj

import com.bearya.manual.frame.ErrorTextFrame

object Warning4ErrorTextFrame : ErrorTextFrame {
    override val errorText: String = "没有可使用的道具\n任务失败"
    override val errorMusic: String = "music/w_warning5.mp3"
}