package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object GrassEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.grass_begin_1, R.drawable.grass_begin_2, R.drawable.grass_begin_3,
            R.drawable.grass_begin_4, R.drawable.grass_begin_5, R.drawable.grass_begin_6,
            R.drawable.grass_begin_7, R.drawable.grass_begin_8, R.drawable.grass_begin_9,
            R.drawable.grass_begin_10, R.drawable.grass_begin_11, R.drawable.grass_begin_12,
            R.drawable.grass_begin_13, R.drawable.grass_begin_14, R.drawable.grass_begin_15,
            R.drawable.grass_begin_16, R.drawable.grass_begin_17, R.drawable.grass_begin_18,
            R.drawable.grass_begin_19, R.drawable.grass_begin_20, R.drawable.grass_begin_21,
            R.drawable.grass_begin_22, R.drawable.grass_begin_23, R.drawable.grass_begin_24,
            R.drawable.grass_begin_25, R.drawable.grass_begin_26, R.drawable.grass_begin_27,
            R.drawable.grass_begin_28, R.drawable.grass_begin_29, R.drawable.grass_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.grass_end_1, R.drawable.grass_end_2, R.drawable.grass_end_3,
            R.drawable.grass_end_4, R.drawable.grass_end_5, R.drawable.grass_end_6,
            R.drawable.grass_end_7, R.drawable.grass_end_8, R.drawable.grass_end_9,
            R.drawable.grass_end_10, R.drawable.grass_end_11, R.drawable.grass_end_12,
            R.drawable.grass_end_13, R.drawable.grass_end_14, R.drawable.grass_end_15,
            R.drawable.grass_end_16, R.drawable.grass_end_17, R.drawable.grass_end_18,
            R.drawable.grass_end_19, R.drawable.grass_end_20, R.drawable.grass_end_21,
            R.drawable.grass_end_22, R.drawable.grass_end_23, R.drawable.grass_end_24,
            R.drawable.grass_end_25, R.drawable.grass_end_26, R.drawable.grass_end_27,
            R.drawable.grass_end_28, R.drawable.grass_end_29, R.drawable.grass_end_30
    )

    override val leftImage: Int? = R.drawable.grass_right
    override val rightImage: Int? = R.drawable.grass_wrong

    override val beginMusic: String = "music/e_m3_begin.mp3"
    override val questionMusic: String? = "music/e_m3_quiz1.mp3"
    override val leftMusic: String? = "music/e_m3_quiz2.mp3"
    override val rightMusic: String? = "music/e_m3_quiz3.mp3"
    override val endMusic: String? = "music/e_m3_end.mp3"

}