package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.HelpFrame

object SlipHelpFrame : HelpFrame {
    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.loving_heart_2_1, R.drawable.loving_heart_2_2, R.drawable.loving_heart_2_3,
            R.drawable.loving_heart_2_4, R.drawable.loving_heart_2_5, R.drawable.loving_heart_2_6,
            R.drawable.loving_heart_2_7, R.drawable.loving_heart_2_8, R.drawable.loving_heart_2_9,
            R.drawable.loving_heart_2_10, R.drawable.loving_heart_2_11, R.drawable.loving_heart_2_12,
            R.drawable.loving_heart_2_13, R.drawable.loving_heart_2_14, R.drawable.loving_heart_2_15,
            R.drawable.loving_heart_2_16, R.drawable.loving_heart_2_17, R.drawable.loving_heart_2_18,
            R.drawable.loving_heart_2_19, R.drawable.loving_heart_2_20, R.drawable.loving_heart_2_21,
            R.drawable.loving_heart_2_22, R.drawable.loving_heart_2_23, R.drawable.loving_heart_2_24,
            R.drawable.loving_heart_2_25, R.drawable.loving_heart_2_26, R.drawable.loving_heart_2_27,
            R.drawable.loving_heart_2_28, R.drawable.loving_heart_2_29, R.drawable.loving_heart_2_30
    )
    override val endImages: IntArray = intArrayOf(
            R.drawable.loving_heart_1_1, R.drawable.loving_heart_1_2, R.drawable.loving_heart_1_3,
            R.drawable.loving_heart_1_4, R.drawable.loving_heart_1_5, R.drawable.loving_heart_1_6,
            R.drawable.loving_heart_1_7, R.drawable.loving_heart_1_8, R.drawable.loving_heart_1_9,
            R.drawable.loving_heart_1_10, R.drawable.loving_heart_1_11, R.drawable.loving_heart_1_12,
            R.drawable.loving_heart_1_13, R.drawable.loving_heart_1_14, R.drawable.loving_heart_1_15,
            R.drawable.loving_heart_1_16, R.drawable.loving_heart_1_17, R.drawable.loving_heart_1_18,
            R.drawable.loving_heart_1_19, R.drawable.loving_heart_1_20, R.drawable.loving_heart_1_21,
            R.drawable.loving_heart_1_22, R.drawable.loving_heart_1_23, R.drawable.loving_heart_1_24,
            R.drawable.loving_heart_1_25, R.drawable.loving_heart_1_26, R.drawable.loving_heart_1_27,
            R.drawable.loving_heart_1_28, R.drawable.loving_heart_1_29, R.drawable.loving_heart_1_30
    )
    override val beginMusic: String = "music/slip_begin.mp3"
    override val endMusic: String = "music/slip_guide.mp3"
    override val timeoutMusic: String = "music/slip_delay.mp3"
    override val wrongMusic: String = "music/slip_wrong.mp3"
    override val rightMusic: String = "music/slip_right.mp3"
}