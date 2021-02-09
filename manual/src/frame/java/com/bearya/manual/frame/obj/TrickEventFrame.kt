package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object TrickEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.entrap_begin_1,R.drawable.entrap_begin_2,R.drawable.entrap_begin_3,
            R.drawable.entrap_begin_4,R.drawable.entrap_begin_5,R.drawable.entrap_begin_6,
            R.drawable.entrap_begin_7,R.drawable.entrap_begin_8,R.drawable.entrap_begin_9,
            R.drawable.entrap_begin_10,R.drawable.entrap_begin_11,R.drawable.entrap_begin_12,
            R.drawable.entrap_begin_13,R.drawable.entrap_begin_14,R.drawable.entrap_begin_15,
            R.drawable.entrap_begin_16,R.drawable.entrap_begin_17,R.drawable.entrap_begin_18,
            R.drawable.entrap_begin_19,R.drawable.entrap_begin_20,R.drawable.entrap_begin_21,
            R.drawable.entrap_begin_22,R.drawable.entrap_begin_23,R.drawable.entrap_begin_24,
            R.drawable.entrap_begin_25,R.drawable.entrap_begin_26,R.drawable.entrap_begin_27,
            R.drawable.entrap_begin_28,R.drawable.entrap_begin_29,R.drawable.entrap_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.entrap_end_1,R.drawable.entrap_end_2,R.drawable.entrap_end_3,
            R.drawable.entrap_end_4,R.drawable.entrap_end_5,R.drawable.entrap_end_6,
            R.drawable.entrap_end_7,R.drawable.entrap_end_8,R.drawable.entrap_end_9,
            R.drawable.entrap_end_10,R.drawable.entrap_end_11,R.drawable.entrap_end_12,
            R.drawable.entrap_end_13,R.drawable.entrap_end_14,R.drawable.entrap_end_15,
            R.drawable.entrap_end_16,R.drawable.entrap_end_17,R.drawable.entrap_end_18,
            R.drawable.entrap_end_19,R.drawable.entrap_end_20,R.drawable.entrap_end_21,
            R.drawable.entrap_end_22,R.drawable.entrap_end_23,R.drawable.entrap_end_24,
            R.drawable.entrap_end_25,R.drawable.entrap_end_26,R.drawable.entrap_end_27,
            R.drawable.entrap_end_28,R.drawable.entrap_end_29,R.drawable.entrap_end_30,
            R.drawable.entrap_end_31,R.drawable.entrap_end_32,R.drawable.entrap_end_33,
            R.drawable.entrap_end_34,R.drawable.entrap_end_35,R.drawable.entrap_end_36,
            R.drawable.entrap_end_37,R.drawable.entrap_end_38,R.drawable.entrap_end_39,
            R.drawable.entrap_end_40
    )

    override val leftImage: Int? = R.drawable.entrap_wrong
    override val rightImage: Int? = R.drawable.entrap_right

    override val beginMusic: String = "music/s_p2_begin.mp3"
    override val questionMusic: String? = "music/s_p2_quiz1.mp3"
    override val leftMusic: String? = "music/s_p2_quiz2.mp3"
    override val rightMusic: String? = "music/s_p2_quiz3.mp3"
    override val endMusic: String? = "music/s_p2_end.mp3"

}