package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.HelpFrame

object PoleHelpFrame : HelpFrame {
    override val gapTime: Int = 100
    override val beginImages: IntArray = intArrayOf(
            R.drawable.loving_heart5_begin_1,R.drawable.loving_heart5_begin_2,R.drawable.loving_heart5_begin_3,
            R.drawable.loving_heart5_begin_4,R.drawable.loving_heart5_begin_5,R.drawable.loving_heart5_begin_6,
            R.drawable.loving_heart5_begin_7,R.drawable.loving_heart5_begin_8,R.drawable.loving_heart5_begin_9,
            R.drawable.loving_heart5_begin_10,R.drawable.loving_heart5_begin_11,R.drawable.loving_heart5_begin_12,
            R.drawable.loving_heart5_begin_13,R.drawable.loving_heart5_begin_14,R.drawable.loving_heart5_begin_15,
            R.drawable.loving_heart5_begin_16,R.drawable.loving_heart5_begin_17,R.drawable.loving_heart5_begin_18,
            R.drawable.loving_heart5_begin_19,R.drawable.loving_heart5_begin_20,R.drawable.loving_heart5_begin_21,
            R.drawable.loving_heart5_begin_22,R.drawable.loving_heart5_begin_23,R.drawable.loving_heart5_begin_24,
            R.drawable.loving_heart5_begin_25,R.drawable.loving_heart5_begin_26,R.drawable.loving_heart5_begin_27,
            R.drawable.loving_heart5_begin_28,R.drawable.loving_heart5_begin_29,R.drawable.loving_heart5_begin_30,
            R.drawable.loving_heart5_begin_31,R.drawable.loving_heart5_begin_32,R.drawable.loving_heart5_begin_33,
            R.drawable.loving_heart5_begin_34,R.drawable.loving_heart5_begin_35,R.drawable.loving_heart5_begin_36,
            R.drawable.loving_heart5_begin_37,R.drawable.loving_heart5_begin_38,R.drawable.loving_heart5_begin_39,
            R.drawable.loving_heart5_begin_40,R.drawable.loving_heart5_begin_41,R.drawable.loving_heart5_begin_42,
            R.drawable.loving_heart5_begin_43,R.drawable.loving_heart5_begin_44,R.drawable.loving_heart5_begin_45,
            R.drawable.loving_heart5_begin_46,R.drawable.loving_heart5_begin_47,R.drawable.loving_heart5_begin_48,
            R.drawable.loving_heart5_begin_49,R.drawable.loving_heart5_begin_50,R.drawable.loving_heart5_begin_51,
            R.drawable.loving_heart5_begin_52,R.drawable.loving_heart5_begin_53,R.drawable.loving_heart5_begin_54,
            R.drawable.loving_heart5_begin_55,R.drawable.loving_heart5_begin_56,R.drawable.loving_heart5_begin_57,
            R.drawable.loving_heart5_begin_58,R.drawable.loving_heart5_begin_59,R.drawable.loving_heart5_begin_60,
            R.drawable.loving_heart5_begin_61,R.drawable.loving_heart5_begin_62,R.drawable.loving_heart5_begin_63,
            R.drawable.loving_heart5_begin_64,R.drawable.loving_heart5_begin_65,R.drawable.loving_heart5_begin_66,
            R.drawable.loving_heart5_begin_67,R.drawable.loving_heart5_begin_68,R.drawable.loving_heart5_begin_69,
            R.drawable.loving_heart5_begin_70,R.drawable.loving_heart5_begin_71,R.drawable.loving_heart5_begin_72,
            R.drawable.loving_heart5_begin_73,R.drawable.loving_heart5_begin_74,R.drawable.loving_heart5_begin_75,
            R.drawable.loving_heart5_begin_76,R.drawable.loving_heart5_begin_77,R.drawable.loving_heart5_begin_78,
            R.drawable.loving_heart5_begin_79,R.drawable.loving_heart5_begin_80
    )
    override val endImages: IntArray = intArrayOf(
            R.drawable.loving_heart5_end_1,R.drawable.loving_heart5_end_2,R.drawable.loving_heart5_end_3,
            R.drawable.loving_heart5_end_4,R.drawable.loving_heart5_end_5,R.drawable.loving_heart5_end_6,
            R.drawable.loving_heart5_end_7,R.drawable.loving_heart5_end_8,R.drawable.loving_heart5_end_9,
            R.drawable.loving_heart5_end_10,R.drawable.loving_heart5_end_11,R.drawable.loving_heart5_end_12,
            R.drawable.loving_heart5_end_13,R.drawable.loving_heart5_end_14,R.drawable.loving_heart5_end_15,
            R.drawable.loving_heart5_end_16,R.drawable.loving_heart5_end_17,R.drawable.loving_heart5_end_18,
            R.drawable.loving_heart5_end_19,R.drawable.loving_heart5_end_20,R.drawable.loving_heart5_end_21,
            R.drawable.loving_heart5_end_22,R.drawable.loving_heart5_end_23,R.drawable.loving_heart5_end_24,
            R.drawable.loving_heart5_end_25,R.drawable.loving_heart5_end_26,R.drawable.loving_heart5_end_27,
            R.drawable.loving_heart5_end_28,R.drawable.loving_heart5_end_29,R.drawable.loving_heart5_end_30,
            R.drawable.loving_heart5_end_31,R.drawable.loving_heart5_end_32,R.drawable.loving_heart5_end_33,
            R.drawable.loving_heart5_end_34,R.drawable.loving_heart5_end_35,R.drawable.loving_heart5_end_36,
            R.drawable.loving_heart5_end_37,R.drawable.loving_heart5_end_38,R.drawable.loving_heart5_end_39,
            R.drawable.loving_heart5_end_40,R.drawable.loving_heart5_end_41,R.drawable.loving_heart5_end_42,
            R.drawable.loving_heart5_end_43,R.drawable.loving_heart5_end_44,R.drawable.loving_heart5_end_45,
            R.drawable.loving_heart5_end_46,R.drawable.loving_heart5_end_47,R.drawable.loving_heart5_end_48,
            R.drawable.loving_heart5_end_49,R.drawable.loving_heart5_end_50,R.drawable.loving_heart5_end_51,
            R.drawable.loving_heart5_end_52,R.drawable.loving_heart5_end_53,R.drawable.loving_heart5_end_54,
            R.drawable.loving_heart5_end_55
    )
    override val beginMusic: String = "music/pole_begin.mp3"
    override val endMusic: String = "music/pole_guide.mp3"
    override val timeoutMusic: String = "music/pole_delay.mp3"
    override val wrongMusic: String = "music/pole_wrong.mp3"
    override val rightMusic: String = "music/pole_right.mp3"
}