package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object ShelterEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.shelter_begin_1,R.drawable.shelter_begin_2,R.drawable.shelter_begin_3,
            R.drawable.shelter_begin_4,R.drawable.shelter_begin_5,R.drawable.shelter_begin_6,
            R.drawable.shelter_begin_7,R.drawable.shelter_begin_8,R.drawable.shelter_begin_9,
            R.drawable.shelter_begin_10,R.drawable.shelter_begin_11,R.drawable.shelter_begin_12,
            R.drawable.shelter_begin_13,R.drawable.shelter_begin_14,R.drawable.shelter_begin_15,
            R.drawable.shelter_begin_16,R.drawable.shelter_begin_17,R.drawable.shelter_begin_18,
            R.drawable.shelter_begin_19,R.drawable.shelter_begin_20,R.drawable.shelter_begin_21,
            R.drawable.shelter_begin_22,R.drawable.shelter_begin_23,R.drawable.shelter_begin_24,
            R.drawable.shelter_begin_25,R.drawable.shelter_begin_26,R.drawable.shelter_begin_27,
            R.drawable.shelter_begin_28,R.drawable.shelter_begin_29,R.drawable.shelter_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.shelter_end_1, R.drawable.shelter_end_2, R.drawable.shelter_end_3,
            R.drawable.shelter_end_4, R.drawable.shelter_end_5, R.drawable.shelter_end_6,
            R.drawable.shelter_end_7, R.drawable.shelter_end_8, R.drawable.shelter_end_9,
            R.drawable.shelter_end_10, R.drawable.shelter_end_11, R.drawable.shelter_end_12,
            R.drawable.shelter_end_13, R.drawable.shelter_end_14, R.drawable.shelter_end_15,
            R.drawable.shelter_end_16, R.drawable.shelter_end_17, R.drawable.shelter_end_18,
            R.drawable.shelter_end_19, R.drawable.shelter_end_20, R.drawable.shelter_end_21,
            R.drawable.shelter_end_22, R.drawable.shelter_end_23, R.drawable.shelter_end_24,
            R.drawable.shelter_end_25, R.drawable.shelter_end_26, R.drawable.shelter_end_27,
            R.drawable.shelter_end_28, R.drawable.shelter_end_29, R.drawable.shelter_end_30
    )

    override val leftImage: Int? = R.drawable.shelter_wrong
    override val rightImage: Int? = R.drawable.shelter_right

    override val beginMusic: String = "music/s_s4_begin.mp3"
    override val questionMusic: String? = "music/s_s4_quiz1.mp3"
    override val leftMusic: String? = "music/s_s4_quiz2.mp3"
    override val rightMusic: String? = "music/s_s4_quiz3.mp3"
    override val endMusic: String? = "music/s_s4_end.mp3"

}