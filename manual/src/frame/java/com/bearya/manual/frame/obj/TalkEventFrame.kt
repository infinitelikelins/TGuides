package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object TalkEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.stranger_talk_begin_1,R.drawable.stranger_talk_begin_2,R.drawable.stranger_talk_begin_3,
            R.drawable.stranger_talk_begin_4,R.drawable.stranger_talk_begin_5,R.drawable.stranger_talk_begin_6,
            R.drawable.stranger_talk_begin_7,R.drawable.stranger_talk_begin_8,R.drawable.stranger_talk_begin_9,
            R.drawable.stranger_talk_begin_10,R.drawable.stranger_talk_begin_11,R.drawable.stranger_talk_begin_12,
            R.drawable.stranger_talk_begin_13,R.drawable.stranger_talk_begin_14,R.drawable.stranger_talk_begin_15,
            R.drawable.stranger_talk_begin_16,R.drawable.stranger_talk_begin_17,R.drawable.stranger_talk_begin_18,
            R.drawable.stranger_talk_begin_19,R.drawable.stranger_talk_begin_20,R.drawable.stranger_talk_begin_21,
            R.drawable.stranger_talk_begin_22,R.drawable.stranger_talk_begin_23,R.drawable.stranger_talk_begin_24,
            R.drawable.stranger_talk_begin_25,R.drawable.stranger_talk_begin_26,R.drawable.stranger_talk_begin_27,
            R.drawable.stranger_talk_begin_28,R.drawable.stranger_talk_begin_29,R.drawable.stranger_talk_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.stranger_talk_end_1,R.drawable.stranger_talk_end_2,R.drawable.stranger_talk_end_3,
            R.drawable.stranger_talk_end_4,R.drawable.stranger_talk_end_5,R.drawable.stranger_talk_end_6,
            R.drawable.stranger_talk_end_7,R.drawable.stranger_talk_end_8,R.drawable.stranger_talk_end_9,
            R.drawable.stranger_talk_end_10,R.drawable.stranger_talk_end_11,R.drawable.stranger_talk_end_12,
            R.drawable.stranger_talk_end_13,R.drawable.stranger_talk_end_14,R.drawable.stranger_talk_end_15,
            R.drawable.stranger_talk_end_16,R.drawable.stranger_talk_end_17,R.drawable.stranger_talk_end_18,
            R.drawable.stranger_talk_end_19,R.drawable.stranger_talk_end_20,R.drawable.stranger_talk_end_21,
            R.drawable.stranger_talk_end_22,R.drawable.stranger_talk_end_23,R.drawable.stranger_talk_end_24,
            R.drawable.stranger_talk_end_25,R.drawable.stranger_talk_end_26,R.drawable.stranger_talk_end_27,
            R.drawable.stranger_talk_end_28,R.drawable.stranger_talk_end_29,R.drawable.stranger_talk_end_30,
            R.drawable.stranger_talk_end_31,R.drawable.stranger_talk_end_32,R.drawable.stranger_talk_end_33,
            R.drawable.stranger_talk_end_34,R.drawable.stranger_talk_end_35,R.drawable.stranger_talk_end_36,
            R.drawable.stranger_talk_end_37,R.drawable.stranger_talk_end_38,R.drawable.stranger_talk_end_39,
            R.drawable.stranger_talk_end_40
    )

    override val leftImage: Int? = R.drawable.stranger_talk_wrong
    override val rightImage: Int? = R.drawable.stranger_talk_right

    override val beginMusic: String = "music/s_s3_begin.mp3"
    override val questionMusic: String? = "music/s_s3_quiz1.mp3"
    override val leftMusic: String? = "music/s_s3_quiz2.mp3"
    override val rightMusic: String? = "music/s_s3_quiz3.mp3"
    override val endMusic: String? = "music/s_s3_end.mp3"

}