package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object NoseEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.nose_running_begin_1,R.drawable.nose_running_begin_2,R.drawable.nose_running_begin_3,
            R.drawable.nose_running_begin_4,R.drawable.nose_running_begin_5,R.drawable.nose_running_begin_6,
            R.drawable.nose_running_begin_7,R.drawable.nose_running_begin_8,R.drawable.nose_running_begin_9,
            R.drawable.nose_running_begin_10,R.drawable.nose_running_begin_11,R.drawable.nose_running_begin_12,
            R.drawable.nose_running_begin_13,R.drawable.nose_running_begin_14,R.drawable.nose_running_begin_15,
            R.drawable.nose_running_begin_16,R.drawable.nose_running_begin_17,R.drawable.nose_running_begin_18,
            R.drawable.nose_running_begin_19,R.drawable.nose_running_begin_20,R.drawable.nose_running_begin_21,
            R.drawable.nose_running_begin_22,R.drawable.nose_running_begin_23,R.drawable.nose_running_begin_24,
            R.drawable.nose_running_begin_25,R.drawable.nose_running_begin_26,R.drawable.nose_running_begin_27,
            R.drawable.nose_running_begin_28,R.drawable.nose_running_begin_29,R.drawable.nose_running_begin_30,
            R.drawable.nose_running_begin_31,R.drawable.nose_running_begin_32,R.drawable.nose_running_begin_33,
            R.drawable.nose_running_begin_34,R.drawable.nose_running_begin_35
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.nose_running_end_1,R.drawable.nose_running_end_2,R.drawable.nose_running_end_3,
            R.drawable.nose_running_end_4,R.drawable.nose_running_end_5,R.drawable.nose_running_end_6,
            R.drawable.nose_running_end_7,R.drawable.nose_running_end_8,R.drawable.nose_running_end_9,
            R.drawable.nose_running_end_10,R.drawable.nose_running_end_11,R.drawable.nose_running_end_12,
            R.drawable.nose_running_end_13,R.drawable.nose_running_end_14,R.drawable.nose_running_end_15,
            R.drawable.nose_running_end_16,R.drawable.nose_running_end_17,R.drawable.nose_running_end_18,
            R.drawable.nose_running_end_19,R.drawable.nose_running_end_20,R.drawable.nose_running_end_21,
            R.drawable.nose_running_end_22,R.drawable.nose_running_end_23,R.drawable.nose_running_end_24,
            R.drawable.nose_running_end_25,R.drawable.nose_running_end_26,R.drawable.nose_running_end_27,
            R.drawable.nose_running_end_28,R.drawable.nose_running_end_29,R.drawable.nose_running_end_30
    )

    override val leftImage: Int? = R.drawable.nose_running_right
    override val rightImage: Int? = R.drawable.nose_running_wrong

    override val beginMusic: String = "music/e_p3_begin.mp3"
    override val questionMusic: String? = "music/e_p3_quiz1.mp3"
    override val leftMusic: String? = "music/e_p3_quiz2.mp3"
    override val rightMusic: String? = "music/e_p3_quiz3.mp3"
    override val endMusic: String? = "music/e_p3_end.mp3"

}