package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object PickBookEventFrame : EventFrame {

    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.pick_up_begin_1,R.drawable.pick_up_begin_2,R.drawable.pick_up_begin_3,
            R.drawable.pick_up_begin_4,R.drawable.pick_up_begin_5,R.drawable.pick_up_begin_6,
            R.drawable.pick_up_begin_7,R.drawable.pick_up_begin_8,R.drawable.pick_up_begin_9,
            R.drawable.pick_up_begin_10,R.drawable.pick_up_begin_11,R.drawable.pick_up_begin_12,
            R.drawable.pick_up_begin_13,R.drawable.pick_up_begin_14,R.drawable.pick_up_begin_15,
            R.drawable.pick_up_begin_16,R.drawable.pick_up_begin_17,R.drawable.pick_up_begin_18,
            R.drawable.pick_up_begin_19,R.drawable.pick_up_begin_20,R.drawable.pick_up_begin_21,
            R.drawable.pick_up_begin_22,R.drawable.pick_up_begin_23,R.drawable.pick_up_begin_24,
            R.drawable.pick_up_begin_25,R.drawable.pick_up_begin_26,R.drawable.pick_up_begin_27,
            R.drawable.pick_up_begin_28,R.drawable.pick_up_begin_29,R.drawable.pick_up_begin_30
    )
    override val endImages: IntArray? = intArrayOf(
            R.drawable.pick_up_end_1,R.drawable.pick_up_end_2,R.drawable.pick_up_end_3,
            R.drawable.pick_up_end_4,R.drawable.pick_up_end_5,R.drawable.pick_up_end_6,
            R.drawable.pick_up_end_7,R.drawable.pick_up_end_8,R.drawable.pick_up_end_9,
            R.drawable.pick_up_end_10,R.drawable.pick_up_end_11,R.drawable.pick_up_end_12,
            R.drawable.pick_up_end_13,R.drawable.pick_up_end_14,R.drawable.pick_up_end_15,
            R.drawable.pick_up_end_16,R.drawable.pick_up_end_17,R.drawable.pick_up_end_18,
            R.drawable.pick_up_end_19,R.drawable.pick_up_end_20,R.drawable.pick_up_end_21,
            R.drawable.pick_up_end_22,R.drawable.pick_up_end_23,R.drawable.pick_up_end_24,
            R.drawable.pick_up_end_25,R.drawable.pick_up_end_26,R.drawable.pick_up_end_27,
            R.drawable.pick_up_end_28,R.drawable.pick_up_end_29,R.drawable.pick_up_end_30
    )

    override val leftImage: Int? = R.drawable.pick_up_right
    override val rightImage: Int? =R.drawable.pick_up_wrong

    override val beginMusic: String = "music/c_p2_begin.mp3"
    override val questionMusic: String? = "music/c_p2_quiz1.mp3"
    override val leftMusic: String? = "music/c_p2_quiz2.mp3"
    override val rightMusic: String? = "music/c_p2_quiz3.mp3"
    override val endMusic: String? = "music/c_p2_end.mp3"

}