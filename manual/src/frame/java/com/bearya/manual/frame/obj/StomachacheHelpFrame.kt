package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.HelpFrame

object StomachacheHelpFrame : HelpFrame {
    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.loving_heart3_begin_1,R.drawable.loving_heart3_begin_2,R.drawable.loving_heart3_begin_3,
            R.drawable.loving_heart3_begin_4,R.drawable.loving_heart3_begin_5,R.drawable.loving_heart3_begin_6,
            R.drawable.loving_heart3_begin_7,R.drawable.loving_heart3_begin_8,R.drawable.loving_heart3_begin_9,
            R.drawable.loving_heart3_begin_10,R.drawable.loving_heart3_begin_11,R.drawable.loving_heart3_begin_12,
            R.drawable.loving_heart3_begin_13,R.drawable.loving_heart3_begin_14,R.drawable.loving_heart3_begin_15,
            R.drawable.loving_heart3_begin_16,R.drawable.loving_heart3_begin_17,R.drawable.loving_heart3_begin_18,
            R.drawable.loving_heart3_begin_19,R.drawable.loving_heart3_begin_20,R.drawable.loving_heart3_begin_21,
            R.drawable.loving_heart3_begin_22,R.drawable.loving_heart3_begin_23,R.drawable.loving_heart3_begin_24,
            R.drawable.loving_heart3_begin_25,R.drawable.loving_heart3_begin_26,R.drawable.loving_heart3_begin_27,
            R.drawable.loving_heart3_begin_28, R.drawable.loving_heart3_begin_29,R.drawable.loving_heart3_begin_30
    )
    override val endImages: IntArray = intArrayOf(
            R.drawable.loving_heart3_end_1,R.drawable.loving_heart3_end_2,R.drawable.loving_heart3_end_3,
            R.drawable.loving_heart3_end_4,R.drawable.loving_heart3_end_5,R.drawable.loving_heart3_end_6,
            R.drawable.loving_heart3_end_7,R.drawable.loving_heart3_end_8,R.drawable.loving_heart3_end_9,
            R.drawable.loving_heart3_end_10,R.drawable.loving_heart3_end_11,R.drawable.loving_heart3_end_12,
            R.drawable.loving_heart3_end_13,R.drawable.loving_heart3_end_14,R.drawable.loving_heart3_end_15,
            R.drawable.loving_heart3_end_16,R.drawable.loving_heart3_end_17,R.drawable.loving_heart3_end_18,
            R.drawable.loving_heart3_end_19,R.drawable.loving_heart3_end_20,R.drawable.loving_heart3_end_21,
            R.drawable.loving_heart3_end_22,R.drawable.loving_heart3_end_23,R.drawable.loving_heart3_end_24,
            R.drawable.loving_heart3_end_25,R.drawable.loving_heart3_end_26,R.drawable.loving_heart3_end_27,
            R.drawable.loving_heart3_end_28,R.drawable.loving_heart3_end_29,R.drawable.loving_heart3_end_30,
            R.drawable.loving_heart3_end_31,R.drawable.loving_heart3_end_32,R.drawable.loving_heart3_end_33,
            R.drawable.loving_heart3_end_34,R.drawable.loving_heart3_end_35
    )
    override val beginMusic: String = "music/ice_cream_begin.mp3"
    override val endMusic: String = "music/ice_cream_guide.mp3"
    override val timeoutMusic: String = "music/ice_cream_delay.mp3"
    override val wrongMusic: String = "music/ice_cream_wrong.mp3"
    override val rightMusic: String = "music/ice_cream_right.mp3"
}