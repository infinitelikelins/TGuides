package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object WalkEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.stranger_walked_begin_1,R.drawable.stranger_walked_begin_2,R.drawable.stranger_walked_begin_3,
            R.drawable.stranger_walked_begin_4,R.drawable.stranger_walked_begin_5,R.drawable.stranger_walked_begin_6,
            R.drawable.stranger_walked_begin_7,R.drawable.stranger_walked_begin_8,R.drawable.stranger_walked_begin_9,
            R.drawable.stranger_walked_begin_10,R.drawable.stranger_walked_begin_11,R.drawable.stranger_walked_begin_12,
            R.drawable.stranger_walked_begin_13,R.drawable.stranger_walked_begin_14,R.drawable.stranger_walked_begin_15,
            R.drawable.stranger_walked_begin_16,R.drawable.stranger_walked_begin_17,R.drawable.stranger_walked_begin_18,
            R.drawable.stranger_walked_begin_19,R.drawable.stranger_walked_begin_20,R.drawable.stranger_walked_begin_21,
            R.drawable.stranger_walked_begin_22,R.drawable.stranger_walked_begin_23,R.drawable.stranger_walked_begin_24,
            R.drawable.stranger_walked_begin_25,R.drawable.stranger_walked_begin_26,R.drawable.stranger_walked_begin_27,
            R.drawable.stranger_walked_begin_28,R.drawable.stranger_walked_begin_29,R.drawable.stranger_walked_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.stranger_walked_end_1,R.drawable.stranger_walked_end_2,R.drawable.stranger_walked_end_3,
            R.drawable.stranger_walked_end_4,R.drawable.stranger_walked_end_5,R.drawable.stranger_walked_end_6,
            R.drawable.stranger_walked_end_7,R.drawable.stranger_walked_end_8,R.drawable.stranger_walked_end_9,
            R.drawable.stranger_walked_end_10,R.drawable.stranger_walked_end_11,R.drawable.stranger_walked_end_12,
            R.drawable.stranger_walked_end_13,R.drawable.stranger_walked_end_14,R.drawable.stranger_walked_end_15,
            R.drawable.stranger_walked_end_16,R.drawable.stranger_walked_end_17,R.drawable.stranger_walked_end_18,
            R.drawable.stranger_walked_end_19,R.drawable.stranger_walked_end_20,R.drawable.stranger_walked_end_21,
            R.drawable.stranger_walked_end_22,R.drawable.stranger_walked_end_23,R.drawable.stranger_walked_end_24,
            R.drawable.stranger_walked_end_25,R.drawable.stranger_walked_end_26,R.drawable.stranger_walked_end_27,
            R.drawable.stranger_walked_end_28,R.drawable.stranger_walked_end_29,R.drawable.stranger_walked_end_30,
            R.drawable.stranger_walked_end_31,R.drawable.stranger_walked_end_32,R.drawable.stranger_walked_end_33,
            R.drawable.stranger_walked_end_34,R.drawable.stranger_walked_end_35,R.drawable.stranger_walked_end_36,
            R.drawable.stranger_walked_end_37,R.drawable.stranger_walked_end_38,R.drawable.stranger_walked_end_39,
            R.drawable.stranger_walked_end_40
    )

    override val leftImage: Int? = R.drawable.stranger_walked_wrong
    override val rightImage: Int? = R.drawable.stranger_walked_right

    override val beginMusic: String = "music/s_p3_begin.mp3"
    override val questionMusic: String? = "music/s_p3_quiz1.mp3"
    override val leftMusic: String? = "music/s_p3_quiz2.mp3"
    override val rightMusic: String? = "music/s_p3_quiz3.mp3"
    override val endMusic: String? = "music/s_p3_end.mp3"

}