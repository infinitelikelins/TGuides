package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object GuardEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.guards_1,R.drawable.guards_2,R.drawable.guards_3,
            R.drawable.guards_4,R.drawable.guards_5,R.drawable.guards_6,
            R.drawable.guards_7,R.drawable.guards_8,R.drawable.guards_9,
            R.drawable.guards_10,R.drawable.guards_11
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.guards_12,
            R.drawable.guards_13,R.drawable.guards_14,R.drawable.guards_15,
            R.drawable.guards_16,R.drawable.guards_17,R.drawable.guards_18,
            R.drawable.guards_19,R.drawable.guards_20,R.drawable.guards_21,
            R.drawable.guards_22,R.drawable.guards_23,R.drawable.guards_24,
            R.drawable.guards_25,R.drawable.guards_26,R.drawable.guards_27,
            R.drawable.guards_28,R.drawable.guards_29,R.drawable.guards_30,
            R.drawable.guards_31,R.drawable.guards_32,R.drawable.guards_33,
            R.drawable.guards_34,R.drawable.guards_35,R.drawable.guards_36,
            R.drawable.guards_37,R.drawable.guards_38,R.drawable.guards_39
    )

    override val leftImage: Int? = R.drawable.choose_119
    override val rightImage: Int? = R.drawable.choose_120

    override val beginMusic: String = "music/s_m2_begin.mp3"
    override val questionMusic: String? = "music/s_m2_quiz1.mp3"
    override val leftMusic: String? = "music/s_m2_quiz2.mp3"
    override val rightMusic: String? = "music/s_m2_quiz3.mp3"
    override val endMusic: String? = "music/s_m2_end.mp3"

}