package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EventFrame

object EarthquakeEventFrame : EventFrame {

    override val gapTime: Int = 100

    override val beginImages: IntArray = intArrayOf(
            R.drawable.earthquake1_1, R.drawable.earthquake1_2, R.drawable.earthquake1_3,
            R.drawable.earthquake1_4, R.drawable.earthquake1_5, R.drawable.earthquake1_6,
            R.drawable.earthquake1_7, R.drawable.earthquake1_8, R.drawable.earthquake1_9,
            R.drawable.earthquake1_10, R.drawable.earthquake1_11, R.drawable.earthquake1_12,
            R.drawable.earthquake1_13, R.drawable.earthquake1_14, R.drawable.earthquake1_15,
            R.drawable.earthquake1_16, R.drawable.earthquake1_17, R.drawable.earthquake1_18,
            R.drawable.earthquake1_19, R.drawable.earthquake1_20, R.drawable.earthquake1_21,
            R.drawable.earthquake1_22, R.drawable.earthquake1_23, R.drawable.earthquake1_24,
            R.drawable.earthquake1_25, R.drawable.earthquake1_26, R.drawable.earthquake1_27,
            R.drawable.earthquake1_28, R.drawable.earthquake1_29, R.drawable.earthquake1_30
    )

    override val endImages: IntArray? = intArrayOf(
            R.drawable.escape_1, R.drawable.escape_2, R.drawable.escape_3,
            R.drawable.escape_4, R.drawable.escape_5, R.drawable.escape_6,
            R.drawable.escape_7, R.drawable.escape_8, R.drawable.escape_9,
            R.drawable.escape_10, R.drawable.escape_11, R.drawable.escape_12,
            R.drawable.escape_13, R.drawable.escape_14, R.drawable.escape_15,
            R.drawable.escape_16, R.drawable.escape_17, R.drawable.escape_18,
            R.drawable.escape_19, R.drawable.escape_20, R.drawable.escape_21,
            R.drawable.escape_22, R.drawable.escape_23, R.drawable.escape_24,
            R.drawable.escape_25, R.drawable.escape_26, R.drawable.escape_27,
            R.drawable.escape_28, R.drawable.escape_29, R.drawable.escape_30
    )

    override val leftImage: Int? = R.drawable.choose_escape
    override val rightImage: Int? = R.drawable.choose_hiding

    override val beginMusic: String = "music/s_s2_begin.mp3"
    override val questionMusic: String? = "music/s_s2_quiz1.mp3"
    override val leftMusic: String? = "music/s_s2_quiz2.mp3"
    override val rightMusic: String? = "music/s_s2_quiz3.mp3"
    override val endMusic: String? = "music/s_s2_end.mp3"

}