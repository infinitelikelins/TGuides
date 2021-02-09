package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object FireEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.fire_01, R.drawable.fire_02, R.drawable.fire_03,
            R.drawable.fire_04, R.drawable.fire_05
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.fire_06,
            R.drawable.fire_07, R.drawable.fire_08, R.drawable.fire_09,
            R.drawable.fire_10, R.drawable.fire_11, R.drawable.fire_12,
            R.drawable.fire_13, R.drawable.fire_14, R.drawable.fire_15,
            R.drawable.fire_16, R.drawable.fire_17, R.drawable.fire_18,
            R.drawable.fire_19, R.drawable.fire_20, R.drawable.fire_21,
            R.drawable.fire_22, R.drawable.fire_23, R.drawable.fire_24,
            R.drawable.fire_25, R.drawable.fire_26, R.drawable.fire_27,
            R.drawable.fire_28, R.drawable.fire_29, R.drawable.fire_30,
            R.drawable.fire_31, R.drawable.fire_32, R.drawable.fire_33,
            R.drawable.fire_34, R.drawable.fire_35
    )

    override val leftImage: Int? = R.drawable.choose_110
    override val rightImage: Int? = R.drawable.choose_119

    override val beginMusic: String = "music/s_m1_begin.mp3"
    override val questionMusic: String? = "music/s_m1_quiz1.mp3"
    override val leftMusic: String? = "music/s_m1_quiz2.mp3"
    override val rightMusic: String? = "music/s_m1_quiz3.mp3"
    override val endMusic: String? = "music/s_m1_end.mp3"

}