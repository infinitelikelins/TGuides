package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object TreeEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.seedlings_begin_1,R.drawable.seedlings_begin_2,R.drawable.seedlings_begin_3,
            R.drawable.seedlings_begin_4,R.drawable.seedlings_begin_5,R.drawable.seedlings_begin_6,
            R.drawable.seedlings_begin_7,R.drawable.seedlings_begin_8,R.drawable.seedlings_begin_9,
            R.drawable.seedlings_begin_10,R.drawable.seedlings_begin_11,R.drawable.seedlings_begin_12,
            R.drawable.seedlings_begin_13,R.drawable.seedlings_begin_14,R.drawable.seedlings_begin_15,
            R.drawable.seedlings_begin_16,R.drawable.seedlings_begin_17,R.drawable.seedlings_begin_18,
            R.drawable.seedlings_begin_19,R.drawable.seedlings_begin_20,R.drawable.seedlings_begin_21,
            R.drawable.seedlings_begin_22,R.drawable.seedlings_begin_23,R.drawable.seedlings_begin_24,
            R.drawable.seedlings_begin_25,R.drawable.seedlings_begin_26,R.drawable.seedlings_begin_27,
            R.drawable.seedlings_begin_28,R.drawable.seedlings_begin_29,R.drawable.seedlings_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.seedlings_end_1,R.drawable.seedlings_end_2,R.drawable.seedlings_end_3,
            R.drawable.seedlings_end_4,R.drawable.seedlings_end_5,R.drawable.seedlings_end_6,
            R.drawable.seedlings_end_7,R.drawable.seedlings_end_8,R.drawable.seedlings_end_9,
            R.drawable.seedlings_end_10,R.drawable.seedlings_end_11,R.drawable.seedlings_end_12,
            R.drawable.seedlings_end_13,R.drawable.seedlings_end_14,R.drawable.seedlings_end_15,
            R.drawable.seedlings_end_16,R.drawable.seedlings_end_17,R.drawable.seedlings_end_18,
            R.drawable.seedlings_end_19,R.drawable.seedlings_end_20,R.drawable.seedlings_end_21,
            R.drawable.seedlings_end_22,R.drawable.seedlings_end_23,R.drawable.seedlings_end_24,
            R.drawable.seedlings_end_25,R.drawable.seedlings_end_26,R.drawable.seedlings_end_27,
            R.drawable.seedlings_end_28,R.drawable.seedlings_end_29,R.drawable.seedlings_end_30
    )

    override val leftImage: Int? = R.drawable.seedlings_wrong
    override val rightImage: Int? = R.drawable.seedlings_wrong

    override val beginMusic: String = "music/e_s2_begin.mp3"
    override val questionMusic: String? = "music/e_s2_quiz1.mp3"
    override val leftMusic: String? = "music/e_s2_quiz2.mp3"
    override val rightMusic: String? = "music/e_s2_quiz3.mp3"
    override val endMusic: String? = "music/e_s2_end.mp3"

}