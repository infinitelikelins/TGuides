package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object MilkEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.milk_carton_begin_1,R.drawable.milk_carton_begin_2,R.drawable.milk_carton_begin_3,
            R.drawable.milk_carton_begin_4,R.drawable.milk_carton_begin_5,R.drawable.milk_carton_begin_6,
            R.drawable.milk_carton_begin_7,R.drawable.milk_carton_begin_8,R.drawable.milk_carton_begin_9,
            R.drawable.milk_carton_begin_10,R.drawable.milk_carton_begin_11,R.drawable.milk_carton_begin_12,
            R.drawable.milk_carton_begin_13,R.drawable.milk_carton_begin_14,R.drawable.milk_carton_begin_15,
            R.drawable.milk_carton_begin_16,R.drawable.milk_carton_begin_17,R.drawable.milk_carton_begin_18,
            R.drawable.milk_carton_begin_19,R.drawable.milk_carton_begin_20,R.drawable.milk_carton_begin_21,
            R.drawable.milk_carton_begin_22,R.drawable.milk_carton_begin_23,R.drawable.milk_carton_begin_24,
            R.drawable.milk_carton_begin_25,R.drawable.milk_carton_begin_26,R.drawable.milk_carton_begin_27,
            R.drawable.milk_carton_begin_28,R.drawable.milk_carton_begin_29,R.drawable.milk_carton_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.milk_carton_end_1,R.drawable.milk_carton_end_2,R.drawable.milk_carton_end_3,
            R.drawable.milk_carton_end_4,R.drawable.milk_carton_end_5,R.drawable.milk_carton_end_6,
            R.drawable.milk_carton_end_7,R.drawable.milk_carton_end_8,R.drawable.milk_carton_end_9,
            R.drawable.milk_carton_end_10,R.drawable.milk_carton_end_11,R.drawable.milk_carton_end_12,
            R.drawable.milk_carton_end_13,R.drawable.milk_carton_end_14,R.drawable.milk_carton_end_15,
            R.drawable.milk_carton_end_16,R.drawable.milk_carton_end_17,R.drawable.milk_carton_end_18,
            R.drawable.milk_carton_end_19,R.drawable.milk_carton_end_20,R.drawable.milk_carton_end_21,
            R.drawable.milk_carton_end_22,R.drawable.milk_carton_end_23,R.drawable.milk_carton_end_24,
            R.drawable.milk_carton_end_25,R.drawable.milk_carton_end_26,R.drawable.milk_carton_end_27,
            R.drawable.milk_carton_end_28,R.drawable.milk_carton_end_29,R.drawable.milk_carton_end_30,
            R.drawable.milk_carton_end_31,R.drawable.milk_carton_end_32,R.drawable.milk_carton_end_33,
            R.drawable.milk_carton_end_34,R.drawable.milk_carton_end_35
    )

    override val leftImage: Int? = R.drawable.milk_carton_wrong
    override val rightImage: Int? = R.drawable.milk_carton_right

    override val beginMusic: String = "music/e_p2_begin.mp3"
    override val questionMusic: String? = "music/e_p2_quiz1.mp3"
    override val leftMusic: String? = "music/e_p2_quiz2.mp3"
    override val rightMusic: String? = "music/e_p2_quiz3.mp3"
    override val endMusic: String? = "music/e_p2_end.mp3"

}