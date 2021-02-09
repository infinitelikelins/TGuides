package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object SpitEventFrame : EventFrame {

    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.spitting_begin_1,R.drawable.spitting_begin_2,R.drawable.spitting_begin_3,
            R.drawable.spitting_begin_4,R.drawable.spitting_begin_5,R.drawable.spitting_begin_6,
            R.drawable.spitting_begin_7,R.drawable.spitting_begin_8,R.drawable.spitting_begin_9,
            R.drawable.spitting_begin_10,R.drawable.spitting_begin_11,R.drawable.spitting_begin_12,
            R.drawable.spitting_begin_13,R.drawable.spitting_begin_14,R.drawable.spitting_begin_15,
            R.drawable.spitting_begin_16,R.drawable.spitting_begin_17,R.drawable.spitting_begin_18,
            R.drawable.spitting_begin_19,R.drawable.spitting_begin_20,R.drawable.spitting_begin_21,
            R.drawable.spitting_begin_22,R.drawable.spitting_begin_23,R.drawable.spitting_begin_24,
            R.drawable.spitting_begin_25,R.drawable.spitting_begin_26,R.drawable.spitting_begin_27,
            R.drawable.spitting_begin_28,R.drawable.spitting_begin_29,R.drawable.spitting_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.spitting_end_1,R.drawable.spitting_end_2,R.drawable.spitting_end_3,
            R.drawable.spitting_end_4,R.drawable.spitting_end_5,R.drawable.spitting_end_6,
            R.drawable.spitting_end_7,R.drawable.spitting_end_8,R.drawable.spitting_end_9,
            R.drawable.spitting_end_10,R.drawable.spitting_end_11,R.drawable.spitting_end_12,
            R.drawable.spitting_end_13,R.drawable.spitting_end_14,R.drawable.spitting_end_15,
            R.drawable.spitting_end_16,R.drawable.spitting_end_17,R.drawable.spitting_end_18,
            R.drawable.spitting_end_19,R.drawable.spitting_end_20,R.drawable.spitting_end_21,
            R.drawable.spitting_end_22,R.drawable.spitting_end_23,R.drawable.spitting_end_24,
            R.drawable.spitting_end_25,R.drawable.spitting_end_26,R.drawable.spitting_end_27,
            R.drawable.spitting_end_28,R.drawable.spitting_end_29,R.drawable.spitting_end_30,
            R.drawable.spitting_end_31,R.drawable.spitting_end_32,R.drawable.spitting_end_33,
            R.drawable.spitting_end_34,R.drawable.spitting_end_35,R.drawable.spitting_end_36,
            R.drawable.spitting_end_37,R.drawable.spitting_end_38,R.drawable.spitting_end_39,
            R.drawable.spitting_end_40
    )

    override val leftImage: Int? = R.drawable.spitting_right
    override val rightImage: Int? = R.drawable.spitting_wrong

    override val beginMusic: String = "music/c_m2_begin.mp3"
    override val questionMusic:String? = "music/c_m2_quiz1.mp3"
    override val leftMusic: String? = "music/c_m2_quiz2.mp3"
    override val rightMusic: String? = "music/c_m2_quiz3.mp3"
    override val endMusic: String? = "music/c_m2_end.mp3"

}