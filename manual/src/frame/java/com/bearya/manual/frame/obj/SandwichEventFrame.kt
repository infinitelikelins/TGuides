package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object SandwichEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.sandwich_begin_1, R.drawable.sandwich_begin_2, R.drawable.sandwich_begin_3,
            R.drawable.sandwich_begin_4, R.drawable.sandwich_begin_5, R.drawable.sandwich_begin_6,
            R.drawable.sandwich_begin_7, R.drawable.sandwich_begin_8, R.drawable.sandwich_begin_9,
            R.drawable.sandwich_begin_10, R.drawable.sandwich_begin_11, R.drawable.sandwich_begin_12,
            R.drawable.sandwich_begin_13, R.drawable.sandwich_begin_14, R.drawable.sandwich_begin_15,
            R.drawable.sandwich_begin_16, R.drawable.sandwich_begin_17, R.drawable.sandwich_begin_18,
            R.drawable.sandwich_begin_19, R.drawable.sandwich_begin_20, R.drawable.sandwich_begin_21,
            R.drawable.sandwich_begin_22, R.drawable.sandwich_begin_23, R.drawable.sandwich_begin_24,
            R.drawable.sandwich_begin_25, R.drawable.sandwich_begin_26, R.drawable.sandwich_begin_27,
            R.drawable.sandwich_begin_28, R.drawable.sandwich_begin_29, R.drawable.sandwich_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.sandwich_end_1, R.drawable.sandwich_end_2, R.drawable.sandwich_end_3,
            R.drawable.sandwich_end_4, R.drawable.sandwich_end_5, R.drawable.sandwich_end_6,
            R.drawable.sandwich_end_7, R.drawable.sandwich_end_8, R.drawable.sandwich_end_9,
            R.drawable.sandwich_end_10, R.drawable.sandwich_end_11, R.drawable.sandwich_end_12,
            R.drawable.sandwich_end_13, R.drawable.sandwich_end_14, R.drawable.sandwich_end_15,
            R.drawable.sandwich_end_16, R.drawable.sandwich_end_17, R.drawable.sandwich_end_18,
            R.drawable.sandwich_end_19, R.drawable.sandwich_end_20, R.drawable.sandwich_end_21,
            R.drawable.sandwich_end_22, R.drawable.sandwich_end_23, R.drawable.sandwich_end_24,
            R.drawable.sandwich_end_25, R.drawable.sandwich_end_26, R.drawable.sandwich_end_27,
            R.drawable.sandwich_end_28, R.drawable.sandwich_end_29, R.drawable.sandwich_end_30
    )

    override val leftImage: Int? = R.drawable.sandwich_wrong
    override val rightImage: Int? = R.drawable.sandwich_right

    override val beginMusic: String = "music/e_s3_begin.mp3"
    override val questionMusic: String? = "music/e_s3_quiz1.mp3"
    override val leftMusic: String? = "music/e_s3_quiz2.mp3"
    override val rightMusic: String? = "music/e_s3_quiz3.mp3"
    override val endMusic: String? = "music/e_s3_end.mp3"

}