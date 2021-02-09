package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object BridgeEventFrame :EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.pacesetter1_1,R.drawable.pacesetter1_2,R.drawable.pacesetter1_3,
            R.drawable.pacesetter1_4,R.drawable.pacesetter1_5,R.drawable.pacesetter1_6,
            R.drawable.pacesetter1_7,R.drawable.pacesetter1_8,R.drawable.pacesetter1_9,
            R.drawable.pacesetter1_10,R.drawable.pacesetter1_11,R.drawable.pacesetter1_12,
            R.drawable.pacesetter1_13,R.drawable.pacesetter1_14,R.drawable.pacesetter1_15,
            R.drawable.pacesetter1_16,R.drawable.pacesetter1_17,R.drawable.pacesetter1_18,
            R.drawable.pacesetter1_19,R.drawable.pacesetter1_20,R.drawable.pacesetter1_21,
            R.drawable.pacesetter1_22,R.drawable.pacesetter1_23,R.drawable.pacesetter1_24,
            R.drawable.pacesetter1_25,R.drawable.pacesetter1_26,R.drawable.pacesetter1_27,
            R.drawable.pacesetter1_28,R.drawable.pacesetter1_29,R.drawable.pacesetter1_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.pacesetter2_01,R.drawable.pacesetter2_02,R.drawable.pacesetter2_03,
            R.drawable.pacesetter2_04,R.drawable.pacesetter2_05,R.drawable.pacesetter2_06,
            R.drawable.pacesetter2_07,R.drawable.pacesetter2_08,R.drawable.pacesetter2_09,
            R.drawable.pacesetter2_10,R.drawable.pacesetter2_11,R.drawable.pacesetter2_12,
            R.drawable.pacesetter2_13,R.drawable.pacesetter2_14,R.drawable.pacesetter2_15,
            R.drawable.pacesetter2_16,R.drawable.pacesetter2_17,R.drawable.pacesetter2_18,
            R.drawable.pacesetter2_19,R.drawable.pacesetter2_20,R.drawable.pacesetter2_21,
            R.drawable.pacesetter2_22,R.drawable.pacesetter2_23,R.drawable.pacesetter2_24,
            R.drawable.pacesetter2_25,R.drawable.pacesetter2_26,R.drawable.pacesetter2_27,
            R.drawable.pacesetter2_28,R.drawable.pacesetter2_29,R.drawable.pacesetter2_30,
            R.drawable.pacesetter2_31,R.drawable.pacesetter2_32,R.drawable.pacesetter2_33,
            R.drawable.pacesetter2_34,R.drawable.pacesetter2_35
    )

    override val leftImage: Int? = R.drawable.pacesetter_right
    override val rightImage: Int? = R.drawable.pacesetter_left
    override val beginMusic: String = "music/c_m1_begin.mp3"
    override val questionMusic: String? = "music/c_m1_quiz1.mp3"
    override val leftMusic: String? = "music/c_m1_quiz2.mp3"
    override val rightMusic: String? = "music/c_m1_quiz3.mp3"
    override val endMusic: String? = "music/c_m1_end.mp3"

}