package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object LostEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.lost_01, R.drawable.lost_02, R.drawable.lost_03,
            R.drawable.lost_04, R.drawable.lost_05
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.lost_06,
            R.drawable.lost_07, R.drawable.lost_08, R.drawable.lost_09,
            R.drawable.lost_10, R.drawable.lost_11, R.drawable.lost_12,
            R.drawable.lost_13, R.drawable.lost_14, R.drawable.lost_15,
            R.drawable.lost_16, R.drawable.lost_17, R.drawable.lost_18,
            R.drawable.lost_19, R.drawable.lost_20, R.drawable.lost_21,
            R.drawable.lost_22, R.drawable.lost_23, R.drawable.lost_24,
            R.drawable.lost_25, R.drawable.lost_26, R.drawable.lost_27,
            R.drawable.lost_28, R.drawable.lost_29, R.drawable.lost_30,
            R.drawable.lost_31, R.drawable.lost_32, R.drawable.lost_33,
            R.drawable.lost_34, R.drawable.lost_35, R.drawable.lost_36,
            R.drawable.lost_37, R.drawable.lost_38, R.drawable.lost_39,
            R.drawable.lost_40, R.drawable.lost_41, R.drawable.lost_42
    )

    override val leftImage: Int? = R.drawable.choose_110
    override val rightImage: Int? = R.drawable.choose_120

    override val beginMusic: String = "music/s_m3_begin.mp3"
    override val questionMusic: String? = "music/s_m3_quiz1.mp3"
    override val leftMusic: String? = "music/s_m3_quiz2.mp3"
    override val rightMusic: String? = "music/s_m3_quiz3.mp3"
    override val endMusic: String? = "music/s_m3_end.mp3"

}