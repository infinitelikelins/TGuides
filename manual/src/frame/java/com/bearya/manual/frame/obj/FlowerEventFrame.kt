package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object FlowerEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.flowers_begin_1, R.drawable.flowers_begin_2, R.drawable.flowers_begin_3,
            R.drawable.flowers_begin_4, R.drawable.flowers_begin_5, R.drawable.flowers_begin_6,
            R.drawable.flowers_begin_7, R.drawable.flowers_begin_8, R.drawable.flowers_begin_9,
            R.drawable.flowers_begin_10, R.drawable.flowers_begin_11, R.drawable.flowers_begin_12,
            R.drawable.flowers_begin_13, R.drawable.flowers_begin_14, R.drawable.flowers_begin_15,
            R.drawable.flowers_begin_16, R.drawable.flowers_begin_17, R.drawable.flowers_begin_18,
            R.drawable.flowers_begin_19, R.drawable.flowers_begin_20, R.drawable.flowers_begin_21,
            R.drawable.flowers_begin_22, R.drawable.flowers_begin_23, R.drawable.flowers_begin_24,
            R.drawable.flowers_begin_25, R.drawable.flowers_begin_26, R.drawable.flowers_begin_27,
            R.drawable.flowers_begin_28, R.drawable.flowers_begin_29, R.drawable.flowers_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.flowers_end_1, R.drawable.flowers_end_2, R.drawable.flowers_end_3,
            R.drawable.flowers_end_4, R.drawable.flowers_end_5, R.drawable.flowers_end_6,
            R.drawable.flowers_end_7, R.drawable.flowers_end_8, R.drawable.flowers_end_9,
            R.drawable.flowers_end_10, R.drawable.flowers_end_11, R.drawable.flowers_end_12,
            R.drawable.flowers_end_13, R.drawable.flowers_end_14, R.drawable.flowers_end_15,
            R.drawable.flowers_end_16, R.drawable.flowers_end_17, R.drawable.flowers_end_18,
            R.drawable.flowers_end_19, R.drawable.flowers_end_20, R.drawable.flowers_end_21,
            R.drawable.flowers_end_22, R.drawable.flowers_end_23, R.drawable.flowers_end_24,
            R.drawable.flowers_end_25, R.drawable.flowers_end_26, R.drawable.flowers_end_27,
            R.drawable.flowers_end_28, R.drawable.flowers_end_29, R.drawable.flowers_end_30
    )

    override val leftImage: Int? = R.drawable.flowers_right
    override val rightImage: Int? = R.drawable.flowers_wrong

    override val beginMusic: String = "music/e_p1_begin.mp3"
    override val questionMusic: String? = "music/e_p1_quiz1.mp3"
    override val leftMusic: String? = "music/e_p1_quiz2.mp3"
    override val rightMusic: String? = "music/e_p1_quiz3.mp3"
    override val endMusic: String? = "music/e_p1_end.mp3"

}