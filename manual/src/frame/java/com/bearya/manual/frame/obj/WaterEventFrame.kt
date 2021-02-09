package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object WaterEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.e_p_faucet_start_1, R.drawable.e_p_faucet_start_2, R.drawable.e_p_faucet_start_3,
            R.drawable.e_p_faucet_start_4, R.drawable.e_p_faucet_start_5, R.drawable.e_p_faucet_start_6,
            R.drawable.e_p_faucet_start_7, R.drawable.e_p_faucet_start_8, R.drawable.e_p_faucet_start_9,
            R.drawable.e_p_faucet_start_10, R.drawable.e_p_faucet_start_11, R.drawable.e_p_faucet_start_12,
            R.drawable.e_p_faucet_start_13, R.drawable.e_p_faucet_start_14, R.drawable.e_p_faucet_start_15,
            R.drawable.e_p_faucet_start_16, R.drawable.e_p_faucet_start_17, R.drawable.e_p_faucet_start_18,
            R.drawable.e_p_faucet_start_19, R.drawable.e_p_faucet_start_20, R.drawable.e_p_faucet_start_21,
            R.drawable.e_p_faucet_start_22, R.drawable.e_p_faucet_start_23, R.drawable.e_p_faucet_start_24,
            R.drawable.e_p_faucet_start_25, R.drawable.e_p_faucet_start_26, R.drawable.e_p_faucet_start_27,
            R.drawable.e_p_faucet_start_28, R.drawable.e_p_faucet_start_29, R.drawable.e_p_faucet_start_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.e_p_faucet_end_01, R.drawable.e_p_faucet_end_02, R.drawable.e_p_faucet_end_03,
            R.drawable.e_p_faucet_end_04, R.drawable.e_p_faucet_end_05, R.drawable.e_p_faucet_end_06,
            R.drawable.e_p_faucet_end_07, R.drawable.e_p_faucet_end_08, R.drawable.e_p_faucet_end_09,
            R.drawable.e_p_faucet_end_10, R.drawable.e_p_faucet_end_11, R.drawable.e_p_faucet_end_12,
            R.drawable.e_p_faucet_end_13, R.drawable.e_p_faucet_end_14, R.drawable.e_p_faucet_end_15,
            R.drawable.e_p_faucet_end_16, R.drawable.e_p_faucet_end_17, R.drawable.e_p_faucet_end_18,
            R.drawable.e_p_faucet_end_19, R.drawable.e_p_faucet_end_20, R.drawable.e_p_faucet_end_21,
            R.drawable.e_p_faucet_end_22, R.drawable.e_p_faucet_end_23, R.drawable.e_p_faucet_end_24,
            R.drawable.e_p_faucet_end_25, R.drawable.e_p_faucet_end_26, R.drawable.e_p_faucet_end_27,
            R.drawable.e_p_faucet_end_28, R.drawable.e_p_faucet_end_29, R.drawable.e_p_faucet_end_30,
            R.drawable.e_p_faucet_end_31, R.drawable.e_p_faucet_end_32, R.drawable.e_p_faucet_end_33,
            R.drawable.e_p_faucet_end_34, R.drawable.e_p_faucet_end_35
    )

    override val leftImage: Int? = R.drawable.e_protection_choose1
    override val rightImage: Int? = R.drawable.e_protection_choose2

    override val beginMusic: String = "music/e_m1_begin.mp3"
    override val questionMusic: String? = "music/e_m1_quiz1.mp3"
    override val leftMusic: String? = "music/e_m1_quiz2.mp3"
    override val rightMusic: String? = "music/e_m1_quiz3.mp3"
    override val endMusic: String? = "music/e_m1_end.mp3"

}