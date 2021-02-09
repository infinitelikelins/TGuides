package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object HomeSummaryFrame1 : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.game_success_home1_1,R.drawable.game_success_home1_2,R.drawable.game_success_home1_3,
            R.drawable.game_success_home1_4,R.drawable.game_success_home1_5,R.drawable.game_success_home1_6,
            R.drawable.game_success_home1_7,R.drawable.game_success_home1_8,R.drawable.game_success_home1_9,
            R.drawable.game_success_home1_10,R.drawable.game_success_home1_11,R.drawable.game_success_home1_12,
            R.drawable.game_success_home1_13,R.drawable.game_success_home1_14
    )
    override val music: String = "music/e_home1.mp3"
}