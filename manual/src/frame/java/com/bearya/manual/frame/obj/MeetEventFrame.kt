package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object MeetEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.meet_grandpa_begin_1,R.drawable.meet_grandpa_begin_2,R.drawable.meet_grandpa_begin_3,
            R.drawable.meet_grandpa_begin_4,R.drawable.meet_grandpa_begin_5,R.drawable.meet_grandpa_begin_6,
            R.drawable.meet_grandpa_begin_7,R.drawable.meet_grandpa_begin_8,R.drawable.meet_grandpa_begin_9,
            R.drawable.meet_grandpa_begin_10,R.drawable.meet_grandpa_begin_11,R.drawable.meet_grandpa_begin_12,
            R.drawable.meet_grandpa_begin_13,R.drawable.meet_grandpa_begin_14,R.drawable.meet_grandpa_begin_15,
            R.drawable.meet_grandpa_begin_16,R.drawable.meet_grandpa_begin_17,R.drawable.meet_grandpa_begin_18,
            R.drawable.meet_grandpa_begin_19,R.drawable.meet_grandpa_begin_20,R.drawable.meet_grandpa_begin_21,
            R.drawable.meet_grandpa_begin_22,R.drawable.meet_grandpa_begin_23,R.drawable.meet_grandpa_begin_24,
            R.drawable.meet_grandpa_begin_25,R.drawable.meet_grandpa_begin_26,R.drawable.meet_grandpa_begin_27,
            R.drawable.meet_grandpa_begin_28,R.drawable.meet_grandpa_begin_29,R.drawable.meet_grandpa_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.meet_grandpa_end_1,R.drawable.meet_grandpa_end_2,R.drawable.meet_grandpa_end_3,
            R.drawable.meet_grandpa_end_4,R.drawable.meet_grandpa_end_5,R.drawable.meet_grandpa_end_6,
            R.drawable.meet_grandpa_end_7,R.drawable.meet_grandpa_end_8,R.drawable.meet_grandpa_end_9,
            R.drawable.meet_grandpa_end_10,R.drawable.meet_grandpa_end_11,R.drawable.meet_grandpa_end_12,
            R.drawable.meet_grandpa_end_13,R.drawable.meet_grandpa_end_14,R.drawable.meet_grandpa_end_15,
            R.drawable.meet_grandpa_end_16,R.drawable.meet_grandpa_end_17,R.drawable.meet_grandpa_end_18,
            R.drawable.meet_grandpa_end_19,R.drawable.meet_grandpa_end_20,R.drawable.meet_grandpa_end_21,
            R.drawable.meet_grandpa_end_22,R.drawable.meet_grandpa_end_23,R.drawable.meet_grandpa_end_24,
            R.drawable.meet_grandpa_end_25,R.drawable.meet_grandpa_end_26,R.drawable.meet_grandpa_end_27,
            R.drawable.meet_grandpa_end_28,R.drawable.meet_grandpa_end_29,R.drawable.meet_grandpa_end_30,
            R.drawable.meet_grandpa_end_31,R.drawable.meet_grandpa_end_32,R.drawable.meet_grandpa_end_33,
            R.drawable.meet_grandpa_end_34,R.drawable.meet_grandpa_end_35,R.drawable.meet_grandpa_end_36,
            R.drawable.meet_grandpa_end_37,R.drawable.meet_grandpa_end_38,R.drawable.meet_grandpa_end_39,
            R.drawable.meet_grandpa_end_40
    )

    override val leftImage: Int? = R.drawable.meet_grandpa_wrong
    override val rightImage: Int? = R.drawable.meet_grandpa_right

    override val beginMusic: String = "music/c_p1_begin.mp3"
    override val questionMusic: String? = "music/c_p1_quiz1.mp3"
    override val leftMusic: String? = "music/c_p1_quiz2.mp3"
    override val rightMusic: String? = "music/c_p1_quiz3.mp3"
    override val endMusic: String? = "music/c_p1_end.mp3"

}