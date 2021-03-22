package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.SummaryFrame

object PatriotismSummaryFrame : SummaryFrame {
    override val gapTime: Int = 50
    override val images: IntArray = intArrayOf(
            R.drawable.patriotism_end_1, R.drawable.patriotism_end_2, R.drawable.patriotism_end_3,
            R.drawable.patriotism_end_4, R.drawable.patriotism_end_5, R.drawable.patriotism_end_6,
    )
    override val music: String = "music/to_patriotism_end.mp3"
}