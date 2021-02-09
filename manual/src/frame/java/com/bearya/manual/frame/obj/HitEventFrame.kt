package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object HitEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.hit_the_begin_1, R.drawable.hit_the_begin_2, R.drawable.hit_the_begin_3,
            R.drawable.hit_the_begin_4, R.drawable.hit_the_begin_5, R.drawable.hit_the_begin_6,
            R.drawable.hit_the_begin_7, R.drawable.hit_the_begin_8, R.drawable.hit_the_begin_9,
            R.drawable.hit_the_begin_10, R.drawable.hit_the_begin_11, R.drawable.hit_the_begin_12,
            R.drawable.hit_the_begin_13, R.drawable.hit_the_begin_14, R.drawable.hit_the_begin_15,
            R.drawable.hit_the_begin_16, R.drawable.hit_the_begin_17, R.drawable.hit_the_begin_18,
            R.drawable.hit_the_begin_19, R.drawable.hit_the_begin_20, R.drawable.hit_the_begin_21,
            R.drawable.hit_the_begin_22, R.drawable.hit_the_begin_23, R.drawable.hit_the_begin_24,
            R.drawable.hit_the_begin_25, R.drawable.hit_the_begin_26, R.drawable.hit_the_begin_27,
            R.drawable.hit_the_begin_28, R.drawable.hit_the_begin_29, R.drawable.hit_the_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.hit_the_end_1, R.drawable.hit_the_end_2, R.drawable.hit_the_end_3,
            R.drawable.hit_the_end_4, R.drawable.hit_the_end_5, R.drawable.hit_the_end_6,
            R.drawable.hit_the_end_7, R.drawable.hit_the_end_8, R.drawable.hit_the_end_9,
            R.drawable.hit_the_end_10, R.drawable.hit_the_end_11, R.drawable.hit_the_end_12,
            R.drawable.hit_the_end_13, R.drawable.hit_the_end_14, R.drawable.hit_the_end_15,
            R.drawable.hit_the_end_16, R.drawable.hit_the_end_17, R.drawable.hit_the_end_18,
            R.drawable.hit_the_end_19, R.drawable.hit_the_end_20, R.drawable.hit_the_end_21,
            R.drawable.hit_the_end_22, R.drawable.hit_the_end_23, R.drawable.hit_the_end_24,
            R.drawable.hit_the_end_25, R.drawable.hit_the_end_26, R.drawable.hit_the_end_27,
            R.drawable.hit_the_end_28, R.drawable.hit_the_end_29, R.drawable.hit_the_end_30
    )

    override val leftImage: Int? = R.drawable.hit_the_wrong
    override val rightImage: Int? = R.drawable.hit_the_right

    override val beginMusic: String = "music/c_p3_begin.mp3"
    override val questionMusic: String? = "music/c_p3_quiz1.mp3"
    override val leftMusic: String? = "music/c_p3_quiz2.mp3"
    override val rightMusic: String? = "music/c_p3_quiz3.mp3"
    override val endMusic: String? = "music/c_p3_end.mp3"

}