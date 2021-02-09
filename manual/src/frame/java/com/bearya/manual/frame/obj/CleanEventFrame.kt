package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object CleanEventFrame :EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.l_civilization1_begin_1,R.drawable.l_civilization1_begin_2,R.drawable.l_civilization1_begin_3,
            R.drawable.l_civilization1_begin_4,R.drawable.l_civilization1_begin_5,R.drawable.l_civilization1_begin_6,
            R.drawable.l_civilization1_begin_7,R.drawable.l_civilization1_begin_8,R.drawable.l_civilization1_begin_9,
            R.drawable.l_civilization1_begin_10,R.drawable.l_civilization1_begin_11,R.drawable.l_civilization1_begin_12,
            R.drawable.l_civilization1_begin_13,R.drawable.l_civilization1_begin_14,R.drawable.l_civilization1_begin_15,
            R.drawable.l_civilization1_begin_16,R.drawable.l_civilization1_begin_17,R.drawable.l_civilization1_begin_18,
            R.drawable.l_civilization1_begin_19,R.drawable.l_civilization1_begin_20,R.drawable.l_civilization1_begin_21,
            R.drawable.l_civilization1_begin_22,R.drawable.l_civilization1_begin_23,R.drawable.l_civilization1_begin_24,
            R.drawable.l_civilization1_begin_25,R.drawable.l_civilization1_begin_26,R.drawable.l_civilization1_begin_27,
            R.drawable.l_civilization1_begin_28,R.drawable.l_civilization1_begin_29,R.drawable.l_civilization1_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.l_civilization1_end_1,R.drawable.l_civilization1_end_2,R.drawable.l_civilization1_end_3,
            R.drawable.l_civilization1_end_4,R.drawable.l_civilization1_end_5,R.drawable.l_civilization1_end_6,
            R.drawable.l_civilization1_end_7,R.drawable.l_civilization1_end_8,R.drawable.l_civilization1_end_9,
            R.drawable.l_civilization1_end_10,R.drawable.l_civilization1_end_11,R.drawable.l_civilization1_end_12,
            R.drawable.l_civilization1_end_13,R.drawable.l_civilization1_end_14,R.drawable.l_civilization1_end_15,
            R.drawable.l_civilization1_end_16,R.drawable.l_civilization1_end_17,R.drawable.l_civilization1_end_18,
            R.drawable.l_civilization1_end_19,R.drawable.l_civilization1_end_20,R.drawable.l_civilization1_end_21,
            R.drawable.l_civilization1_end_22,R.drawable.l_civilization1_end_23,R.drawable.l_civilization1_end_24,
            R.drawable.l_civilization1_end_25,R.drawable.l_civilization1_end_26,R.drawable.l_civilization1_end_27,
            R.drawable.l_civilization1_end_28,R.drawable.l_civilization1_end_29,R.drawable.l_civilization1_end_30
    )

    override val leftImage: Int? = R.drawable.l_civilization1_wrong
    override val rightImage: Int? = R.drawable.l_civilization1_right

    override val beginMusic: String = "music/c_s2_begin.mp3"
    override val questionMusic: String? = "music/c_s2_quiz1.mp3"
    override val leftMusic: String? = "music/c_s2_quiz2.mp3"
    override val rightMusic: String? = "music/c_s2_quiz3.mp3"
    override val endMusic: String? = "music/c_s2_end.mp3"

}