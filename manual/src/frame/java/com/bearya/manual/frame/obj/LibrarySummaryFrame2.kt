package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object LibrarySummaryFrame2 : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.game_success_library_1, R.drawable.game_success_library_2, R.drawable.game_success_library_3,
            R.drawable.game_success_library_4, R.drawable.game_success_library_5, R.drawable.game_success_library_6
    )
    override val music: String = "music/e_library2.mp3"
}