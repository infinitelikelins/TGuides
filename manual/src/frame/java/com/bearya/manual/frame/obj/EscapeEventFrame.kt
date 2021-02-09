package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object EscapeEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.fire_escape_begin_1,R.drawable.fire_escape_begin_2,R.drawable.fire_escape_begin_3,
            R.drawable.fire_escape_begin_4,R.drawable.fire_escape_begin_5,R.drawable.fire_escape_begin_6,
            R.drawable.fire_escape_begin_7,R.drawable.fire_escape_begin_8,R.drawable.fire_escape_begin_9,
            R.drawable.fire_escape_begin_10,R.drawable.fire_escape_begin_11,R.drawable.fire_escape_begin_12,
            R.drawable.fire_escape_begin_13,R.drawable.fire_escape_begin_14,R.drawable.fire_escape_begin_15,
            R.drawable.fire_escape_begin_16,R.drawable.fire_escape_begin_17,R.drawable.fire_escape_begin_18,
            R.drawable.fire_escape_begin_19,R.drawable.fire_escape_begin_20,R.drawable.fire_escape_begin_21,
            R.drawable.fire_escape_begin_22,R.drawable.fire_escape_begin_23,R.drawable.fire_escape_begin_24,
            R.drawable.fire_escape_begin_25,R.drawable.fire_escape_begin_26,R.drawable.fire_escape_begin_27,
            R.drawable.fire_escape_begin_28,R.drawable.fire_escape_begin_29,R.drawable.fire_escape_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.fire_escape_end_1,R.drawable.fire_escape_end_2,R.drawable.fire_escape_end_3,
            R.drawable.fire_escape_end_4,R.drawable.fire_escape_end_5,R.drawable.fire_escape_end_6,
            R.drawable.fire_escape_end_7,R.drawable.fire_escape_end_8,R.drawable.fire_escape_end_9,
            R.drawable.fire_escape_end_10,R.drawable.fire_escape_end_11,R.drawable.fire_escape_end_12,
            R.drawable.fire_escape_end_13,R.drawable.fire_escape_end_14,R.drawable.fire_escape_end_15,
            R.drawable.fire_escape_end_16,R.drawable.fire_escape_end_17,R.drawable.fire_escape_end_18,
            R.drawable.fire_escape_end_19,R.drawable.fire_escape_end_20,R.drawable.fire_escape_end_21,
            R.drawable.fire_escape_end_22,R.drawable.fire_escape_end_23,R.drawable.fire_escape_end_24,
            R.drawable.fire_escape_end_25,R.drawable.fire_escape_end_26,R.drawable.fire_escape_end_27,
            R.drawable.fire_escape_end_28,R.drawable.fire_escape_end_29,R.drawable.fire_escape_end_30,
            R.drawable.fire_escape_end_31,R.drawable.fire_escape_end_32,R.drawable.fire_escape_end_33,
            R.drawable.fire_escape_end_34,R.drawable.fire_escape_end_35
    )

    override val leftImage: Int? = R.drawable.fire_escape_right
    override val rightImage: Int? = R.drawable.fire_escape_wrong

    override val beginMusic: String = "music/s_s1_begin.mp3"
    override val questionMusic: String? = "music/s_s1_quiz1.mp3"
    override val leftMusic: String? = "music/s_s1_quiz2.mp3"
    override val rightMusic: String? = "music/s_s1_quiz3.mp3"
    override val endMusic: String? = "music/s_s1_end.mp3"

}