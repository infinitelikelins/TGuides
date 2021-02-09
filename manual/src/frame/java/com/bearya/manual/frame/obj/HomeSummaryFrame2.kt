package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object HomeSummaryFrame2 : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.game_success_home_1,R.drawable.game_success_home_2,R.drawable.game_success_home_3,
            R.drawable.game_success_home_4,R.drawable.game_success_home_5,R.drawable.game_success_home_6
    )
    override val music: String = "music/e_home2.mp3"
}