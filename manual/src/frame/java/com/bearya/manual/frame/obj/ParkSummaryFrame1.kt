package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object ParkSummaryFrame1 : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.game_success_park_1, R.drawable.game_success_park_2, R.drawable.game_success_park_3,
            R.drawable.game_success_park_4, R.drawable.game_success_park_5, R.drawable.game_success_park_6,
            R.drawable.game_success_park_7, R.drawable.game_success_park_8, R.drawable.game_success_park_9,
            R.drawable.game_success_park_10, R.drawable.game_success_park_11
    )
    override val music: String = "music/e_amusement1.mp3"
}