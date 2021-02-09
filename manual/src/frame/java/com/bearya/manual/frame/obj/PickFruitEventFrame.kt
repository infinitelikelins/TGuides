package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object PickFruitEventFrame : EventFrame {

    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.l_civilization3_begin_1,R.drawable.l_civilization3_begin_2,R.drawable.l_civilization3_begin_3,
            R.drawable.l_civilization3_begin_4,R.drawable.l_civilization3_begin_5,R.drawable.l_civilization3_begin_6,
            R.drawable.l_civilization3_begin_7,R.drawable.l_civilization3_begin_8,R.drawable.l_civilization3_begin_9,
            R.drawable.l_civilization3_begin_10,R.drawable.l_civilization3_begin_11,R.drawable.l_civilization3_begin_12,
            R.drawable.l_civilization3_begin_13,R.drawable.l_civilization3_begin_14,R.drawable.l_civilization3_begin_15,
            R.drawable.l_civilization3_begin_16,R.drawable.l_civilization3_begin_17,R.drawable.l_civilization3_begin_18,
            R.drawable.l_civilization3_begin_19,R.drawable.l_civilization3_begin_20,R.drawable.l_civilization3_begin_21,
            R.drawable.l_civilization3_begin_22,R.drawable.l_civilization3_begin_23,R.drawable.l_civilization3_begin_24,
            R.drawable.l_civilization3_begin_25,R.drawable.l_civilization3_begin_26,R.drawable.l_civilization3_begin_27,
            R.drawable.l_civilization3_begin_28,R.drawable.l_civilization3_begin_29,R.drawable.l_civilization3_begin_30,
            R.drawable.l_civilization3_begin_31,R.drawable.l_civilization3_begin_32,R.drawable.l_civilization3_begin_33,
            R.drawable.l_civilization3_begin_34,R.drawable.l_civilization3_begin_35,R.drawable.l_civilization3_begin_36,
            R.drawable.l_civilization3_begin_37,R.drawable.l_civilization3_begin_38,R.drawable.l_civilization3_begin_39,
            R.drawable.l_civilization3_begin_40
    )
    override val endImages: IntArray? = intArrayOf(
            R.drawable.l_civilization3_end_1,R.drawable.l_civilization3_end_2,R.drawable.l_civilization3_end_3,
            R.drawable.l_civilization3_end_4,R.drawable.l_civilization3_end_5,R.drawable.l_civilization3_end_6,
            R.drawable.l_civilization3_end_7,R.drawable.l_civilization3_end_8,R.drawable.l_civilization3_end_9,
            R.drawable.l_civilization3_end_10,R.drawable.l_civilization3_end_11,R.drawable.l_civilization3_end_12,
            R.drawable.l_civilization3_end_13,R.drawable.l_civilization3_end_14,R.drawable.l_civilization3_end_15,
            R.drawable.l_civilization3_end_16,R.drawable.l_civilization3_end_17,R.drawable.l_civilization3_end_18,
            R.drawable.l_civilization3_end_19,R.drawable.l_civilization3_end_20,R.drawable.l_civilization3_end_21,
            R.drawable.l_civilization3_end_22,R.drawable.l_civilization3_end_23,R.drawable.l_civilization3_end_24,
            R.drawable.l_civilization3_end_25,R.drawable.l_civilization3_end_26,R.drawable.l_civilization3_end_27,
            R.drawable.l_civilization3_end_28,R.drawable.l_civilization3_end_29,R.drawable.l_civilization3_end_30,
            R.drawable.l_civilization3_end_31,R.drawable.l_civilization3_end_32,R.drawable.l_civilization3_end_33,
            R.drawable.l_civilization3_end_34,R.drawable.l_civilization3_end_35,R.drawable.l_civilization3_end_36,
            R.drawable.l_civilization3_end_37,R.drawable.l_civilization3_end_38,R.drawable.l_civilization3_end_39,
            R.drawable.l_civilization3_end_40
    )

    override val leftImage: Int? = R.drawable.l_civilization3_right
    override val rightImage: Int? =R.drawable.l_civilization3_wrong

    override val beginMusic: String = "music/c_s3_begin.mp3"
    override val questionMusic: String? = "music/c_s3_quiz1.mp3"
    override val leftMusic: String? = "music/c_s3_quiz2.mp3"
    override val rightMusic: String? = "music/c_s3_quiz3.mp3"
    override val endMusic: String? = "music/c_s3_end.mp3"

}