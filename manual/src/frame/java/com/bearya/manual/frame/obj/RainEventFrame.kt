package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object RainEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.rains_begin_1, R.drawable.rains_begin_2, R.drawable.rains_begin_3,
            R.drawable.rains_begin_4, R.drawable.rains_begin_5, R.drawable.rains_begin_6,
            R.drawable.rains_begin_7, R.drawable.rains_begin_8, R.drawable.rains_begin_9,
            R.drawable.rains_begin_10, R.drawable.rains_begin_11, R.drawable.rains_begin_12,
            R.drawable.rains_begin_13, R.drawable.rains_begin_14, R.drawable.rains_begin_15,
            R.drawable.rains_begin_16, R.drawable.rains_begin_17, R.drawable.rains_begin_18,
            R.drawable.rains_begin_19, R.drawable.rains_begin_20, R.drawable.rains_begin_21,
            R.drawable.rains_begin_22, R.drawable.rains_begin_23, R.drawable.rains_begin_24,
            R.drawable.rains_begin_25, R.drawable.rains_begin_26, R.drawable.rains_begin_27,
            R.drawable.rains_begin_28, R.drawable.rains_begin_29, R.drawable.rains_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.rains_end_1,R.drawable.rains_end_2,R.drawable.rains_end_3,
            R.drawable.rains_end_4,R.drawable.rains_end_5,R.drawable.rains_end_6,
            R.drawable.rains_end_7,R.drawable.rains_end_8,R.drawable.rains_end_9,
            R.drawable.rains_end_10,R.drawable.rains_end_11,R.drawable.rains_end_12,
            R.drawable.rains_end_13,R.drawable.rains_end_14,R.drawable.rains_end_15,
            R.drawable.rains_end_16,R.drawable.rains_end_17,R.drawable.rains_end_18,
            R.drawable.rains_end_19,R.drawable.rains_end_20,R.drawable.rains_end_21,
            R.drawable.rains_end_22,R.drawable.rains_end_23,R.drawable.rains_end_24,
            R.drawable.rains_end_25,R.drawable.rains_end_26,R.drawable.rains_end_27,
            R.drawable.rains_end_28,R.drawable.rains_end_29,R.drawable.rains_end_30
    )

    override val leftImage: Int? = R.drawable.rains_wrong
    override val rightImage: Int? = R.drawable.rains_right

    override val beginMusic: String = "music/c_m3_begin.mp3"
    override val questionMusic: String? = "music/c_m3_quiz1.mp3"
    override val leftMusic: String? = "music/c_m3_quiz2.mp3"
    override val rightMusic: String? = "music/c_m3_quiz3.mp3"
    override val endMusic: String? = "music/c_m3_end.mp3"

}