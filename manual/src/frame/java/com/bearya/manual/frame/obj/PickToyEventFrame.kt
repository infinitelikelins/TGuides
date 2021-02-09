package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object PickToyEventFrame :EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.l_civilization2_begin_1,R.drawable.l_civilization2_begin_2,R.drawable.l_civilization2_begin_3,
            R.drawable.l_civilization2_begin_4,R.drawable.l_civilization2_begin_5,R.drawable.l_civilization2_begin_6,
            R.drawable.l_civilization2_begin_7,R.drawable.l_civilization2_begin_8,R.drawable.l_civilization2_begin_9,
            R.drawable.l_civilization2_begin_10,R.drawable.l_civilization2_begin_11,R.drawable.l_civilization2_begin_12,
            R.drawable.l_civilization2_begin_13,R.drawable.l_civilization2_begin_14,R.drawable.l_civilization2_begin_15,
            R.drawable.l_civilization2_begin_16,R.drawable.l_civilization2_begin_17,R.drawable.l_civilization2_begin_18,
            R.drawable.l_civilization2_begin_19,R.drawable.l_civilization2_begin_20,R.drawable.l_civilization2_begin_21,
            R.drawable.l_civilization2_begin_22,R.drawable.l_civilization2_begin_23,R.drawable.l_civilization2_begin_24,
            R.drawable.l_civilization2_begin_25,R.drawable.l_civilization2_begin_26,R.drawable.l_civilization2_begin_27,
            R.drawable.l_civilization2_begin_28,R.drawable.l_civilization2_begin_29,R.drawable.l_civilization2_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.l_civilization2_end_1,R.drawable.l_civilization2_end_2,R.drawable.l_civilization2_end_3,
            R.drawable.l_civilization2_end_4,R.drawable.l_civilization2_end_5,R.drawable.l_civilization2_end_6,
            R.drawable.l_civilization2_end_7,R.drawable.l_civilization2_end_8,R.drawable.l_civilization2_end_9,
            R.drawable.l_civilization2_end_10,R.drawable.l_civilization2_end_11,R.drawable.l_civilization2_end_12,
            R.drawable.l_civilization2_end_13,R.drawable.l_civilization2_end_14,R.drawable.l_civilization2_end_15,
            R.drawable.l_civilization2_end_16,R.drawable.l_civilization2_end_17,R.drawable.l_civilization2_end_18,
            R.drawable.l_civilization2_end_19,R.drawable.l_civilization2_end_20,R.drawable.l_civilization2_end_21,
            R.drawable.l_civilization2_end_22,R.drawable.l_civilization2_end_23,R.drawable.l_civilization2_end_24,
            R.drawable.l_civilization2_end_25,R.drawable.l_civilization2_end_26,R.drawable.l_civilization2_end_27,
            R.drawable.l_civilization2_end_28,R.drawable.l_civilization2_end_29,R.drawable.l_civilization2_end_30,
            R.drawable.l_civilization2_end_31,R.drawable.l_civilization2_end_32,R.drawable.l_civilization2_end_33,
            R.drawable.l_civilization2_end_34,R.drawable.l_civilization2_end_35
    )

    override val leftImage: Int? = R.drawable.l_civilization2_wrong
    override val rightImage: Int? = R.drawable.l_civilization2_right

    override val beginMusic: String = "music/c_s1_begin.mp3"
    override val questionMusic: String? = "music/c_s1_quiz1.mp3"
    override val leftMusic: String? = "music/c_s1_quiz2.mp3"
    override val rightMusic: String? = "music/c_s1_quiz3.mp3"
    override val endMusic: String? = "music/c_s1_end.mp3"

}