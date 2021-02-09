package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.HelpFrame

object FirecrackerHelpFrame : HelpFrame {
    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.loving_heart4_begin_1,R.drawable.loving_heart4_begin_2,R.drawable.loving_heart4_begin_3,
            R.drawable.loving_heart4_begin_4,R.drawable.loving_heart4_begin_5,R.drawable.loving_heart4_begin_6,
            R.drawable.loving_heart4_begin_7,R.drawable.loving_heart4_begin_8,R.drawable.loving_heart4_begin_9,
            R.drawable.loving_heart4_begin_10,R.drawable.loving_heart4_begin_11,R.drawable.loving_heart4_begin_12,
            R.drawable.loving_heart4_begin_13,R.drawable.loving_heart4_begin_14,R.drawable.loving_heart4_begin_15,
            R.drawable.loving_heart4_begin_16,R.drawable.loving_heart4_begin_17,R.drawable.loving_heart4_begin_18,
            R.drawable.loving_heart4_begin_19,R.drawable.loving_heart4_begin_20,R.drawable.loving_heart4_begin_21,
            R.drawable.loving_heart4_begin_22,R.drawable.loving_heart4_begin_23,R.drawable.loving_heart4_begin_24,
            R.drawable.loving_heart4_begin_25,R.drawable.loving_heart4_begin_26,R.drawable.loving_heart4_begin_27,
            R.drawable.loving_heart4_begin_28,R.drawable.loving_heart4_begin_29,R.drawable.loving_heart4_begin_30
    )
    override val endImages: IntArray = intArrayOf(
            R.drawable.loving_heart4_end_1,R.drawable.loving_heart4_end_2,R.drawable.loving_heart4_end_3,
            R.drawable.loving_heart4_end_4,R.drawable.loving_heart4_end_5,R.drawable.loving_heart4_end_6,
            R.drawable.loving_heart4_end_7,R.drawable.loving_heart4_end_8,R.drawable.loving_heart4_end_9,
            R.drawable.loving_heart4_end_10,R.drawable.loving_heart4_end_11,R.drawable.loving_heart4_end_12,
            R.drawable.loving_heart4_end_13,R.drawable.loving_heart4_end_14,R.drawable.loving_heart4_end_15,
            R.drawable.loving_heart4_end_16,R.drawable.loving_heart4_end_17,R.drawable.loving_heart4_end_18,
            R.drawable.loving_heart4_end_19,R.drawable.loving_heart4_end_20,R.drawable.loving_heart4_end_21,
            R.drawable.loving_heart4_end_22,R.drawable.loving_heart4_end_23,R.drawable.loving_heart4_end_24,
            R.drawable.loving_heart4_end_25,R.drawable.loving_heart4_end_26,R.drawable.loving_heart4_end_27,
            R.drawable.loving_heart4_end_28,R.drawable.loving_heart4_end_29,R.drawable.loving_heart4_end_30,
            R.drawable.loving_heart4_end_31,R.drawable.loving_heart4_end_32,R.drawable.loving_heart4_end_33,
            R.drawable.loving_heart4_end_34,R.drawable.loving_heart4_end_35

    )
    override val beginMusic: String = "music/firecrackers_begin.mp3"
    override val endMusic: String = "music/firecrackers_guide.mp3"
    override val timeoutMusic: String = "music/firecrackers_delay.mp3"
    override val wrongMusic: String = "music/firecrackers_wrong.mp3"
    override val rightMusic: String = "music/firecrackers_right.mp3"
}