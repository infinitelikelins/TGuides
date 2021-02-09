package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object SchoolSummaryFrame1 : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.game_success_school_1,R.drawable.game_success_school_2,R.drawable.game_success_school_3,
            R.drawable.game_success_school_4,R.drawable.game_success_school_5,R.drawable.game_success_school_6,
            R.drawable.game_success_school_7
    )
    override val music: String = "music/e_kindergarten1.mp3"
}