package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object BatteryEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.lost_battery_begin_1,R.drawable.lost_battery_begin_2,R.drawable.lost_battery_begin_3,
            R.drawable.lost_battery_begin_4,R.drawable.lost_battery_begin_5,R.drawable.lost_battery_begin_6,
            R.drawable.lost_battery_begin_7,R.drawable.lost_battery_begin_8,R.drawable.lost_battery_begin_9,
            R.drawable.lost_battery_begin_10,R.drawable.lost_battery_begin_11,R.drawable.lost_battery_begin_12,
            R.drawable.lost_battery_begin_13,R.drawable.lost_battery_begin_14,R.drawable.lost_battery_begin_15,
            R.drawable.lost_battery_begin_16,R.drawable.lost_battery_begin_17,R.drawable.lost_battery_begin_18,
            R.drawable.lost_battery_begin_19,R.drawable.lost_battery_begin_20,R.drawable.lost_battery_begin_21,
            R.drawable.lost_battery_begin_22,R.drawable.lost_battery_begin_23,R.drawable.lost_battery_begin_24,
            R.drawable.lost_battery_begin_25,R.drawable.lost_battery_begin_26,R.drawable.lost_battery_begin_27,
            R.drawable.lost_battery_begin_28,R.drawable.lost_battery_begin_29,R.drawable.lost_battery_begin_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.lost_battery_end_1,R.drawable.lost_battery_end_2,R.drawable.lost_battery_end_3,
            R.drawable.lost_battery_end_4,R.drawable.lost_battery_end_5,R.drawable.lost_battery_end_6,
            R.drawable.lost_battery_end_7,R.drawable.lost_battery_end_8,R.drawable.lost_battery_end_9,
            R.drawable.lost_battery_end_10,R.drawable.lost_battery_end_11,R.drawable.lost_battery_end_12,
            R.drawable.lost_battery_end_13,R.drawable.lost_battery_end_14,R.drawable.lost_battery_end_15,
            R.drawable.lost_battery_end_16,R.drawable.lost_battery_end_17,R.drawable.lost_battery_end_18,
            R.drawable.lost_battery_end_19,R.drawable.lost_battery_end_20,R.drawable.lost_battery_end_21,
            R.drawable.lost_battery_end_22,R.drawable.lost_battery_end_23,R.drawable.lost_battery_end_24,
            R.drawable.lost_battery_end_25,R.drawable.lost_battery_end_26,R.drawable.lost_battery_end_27,
            R.drawable.lost_battery_end_28,R.drawable.lost_battery_end_29,R.drawable.lost_battery_end_30
    )

    override val leftImage: Int? = R.drawable.lost_battery_right
    override val rightImage: Int? = R.drawable.lost_battery_wrong

    override val beginMusic: String = "music/e_s1_begin.mp3"
    override val questionMusic: String? = "music/e_s1_quiz1.mp3"
    override val leftMusic: String? = "music/e_s1_quiz2.mp3"
    override val rightMusic: String? = "music/e_s1_quiz3.mp3"
    override val endMusic: String? = "music/e_s1_end.mp3"

}