package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object CrossroadEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.crossroads_begin_1,R.drawable.crossroads_begin_2,R.drawable.crossroads_begin_3,
            R.drawable.crossroads_begin_4,R.drawable.crossroads_begin_5,R.drawable.crossroads_begin_6,
            R.drawable.crossroads_begin_7,R.drawable.crossroads_begin_8
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.crossroads_end_1, R.drawable.crossroads_end_2, R.drawable.crossroads_end_3,
            R.drawable.crossroads_end_4, R.drawable.crossroads_end_5, R.drawable.crossroads_end_6,
            R.drawable.crossroads_end_7, R.drawable.crossroads_end_8, R.drawable.crossroads_end_9,
            R.drawable.crossroads_end_10, R.drawable.crossroads_end_11, R.drawable.crossroads_end_12,
            R.drawable.crossroads_end_13, R.drawable.crossroads_end_14, R.drawable.crossroads_end_15,
            R.drawable.crossroads_end_16, R.drawable.crossroads_end_17, R.drawable.crossroads_end_18,
            R.drawable.crossroads_end_19, R.drawable.crossroads_end_20, R.drawable.crossroads_end_21,
            R.drawable.crossroads_end_22, R.drawable.crossroads_end_23, R.drawable.crossroads_end_24,
            R.drawable.crossroads_end_25, R.drawable.crossroads_end_26, R.drawable.crossroads_end_27
    )

    override val leftImage: Int? = R.drawable.red_light
    override val rightImage: Int? = R.drawable.green_light

    override val beginMusic: String = "music/s_p1_begin.mp3"
    override val questionMusic: String? = "music/s_p1_quiz1.mp3"
    override val leftMusic: String? = "music/s_p1_quiz2.mp3"
    override val rightMusic: String? = "music/s_p1_quiz3.mp3"
    override val endMusic: String? = "music/s_p1_end.mp3"

}