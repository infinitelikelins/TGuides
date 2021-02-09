package com.bearya.manual.frame.obj

import com.bearya.manual.R
import com.bearya.manual.frame.EndFailFrame

abstract class SeafloorEndFailFrame : EndFailFrame {

    override val gapTime: Int = 10
    override val prop1: Int = R.drawable.map
    override val prop2: Int = R.drawable.compass
    override val prop3: Int = R.drawable.key

    override val images: IntArray = intArrayOf(
            R.drawable.seafloor_un_end0018,
            R.drawable.seafloor_un_end0019, R.drawable.seafloor_un_end0020, R.drawable.seafloor_un_end0021,
            R.drawable.seafloor_un_end0022, R.drawable.seafloor_un_end0023, R.drawable.seafloor_un_end0024,
            R.drawable.seafloor_un_end0025, R.drawable.seafloor_un_end0026, R.drawable.seafloor_un_end0027,
            R.drawable.seafloor_un_end0028, R.drawable.seafloor_un_end0029, R.drawable.seafloor_un_end0030,
            R.drawable.seafloor_un_end0031, R.drawable.seafloor_un_end0032, R.drawable.seafloor_un_end0033,
            R.drawable.seafloor_un_end0034, R.drawable.seafloor_un_end0035, R.drawable.seafloor_un_end0036,
            R.drawable.seafloor_un_end0037, R.drawable.seafloor_un_end0038, R.drawable.seafloor_un_end0039,
            R.drawable.seafloor_un_end0040, R.drawable.seafloor_un_end0041, R.drawable.seafloor_un_end0042,
            R.drawable.seafloor_un_end0043, R.drawable.seafloor_un_end0044, R.drawable.seafloor_un_end0045,
            R.drawable.seafloor_un_end0046, R.drawable.seafloor_un_end0047, R.drawable.seafloor_un_end0048,
            R.drawable.seafloor_un_end0049, R.drawable.seafloor_un_end0050, R.drawable.seafloor_un_end0051,
            R.drawable.seafloor_un_end0052, R.drawable.seafloor_un_end0053, R.drawable.seafloor_un_end0054,
            R.drawable.seafloor_un_end0055, R.drawable.seafloor_un_end0056, R.drawable.seafloor_un_end0057,
            R.drawable.seafloor_un_end0058, R.drawable.seafloor_un_end0059, R.drawable.seafloor_un_end0060,
            R.drawable.seafloor_un_end0061, R.drawable.seafloor_un_end0062, R.drawable.seafloor_un_end0063,
            R.drawable.seafloor_un_end0064, R.drawable.seafloor_un_end0065, R.drawable.seafloor_un_end0066,
            R.drawable.seafloor_un_end0067, R.drawable.seafloor_un_end0068, R.drawable.seafloor_un_end0069,
            R.drawable.seafloor_un_end0070, R.drawable.seafloor_un_end0071, R.drawable.seafloor_un_end0072,
            R.drawable.seafloor_un_end0073, R.drawable.seafloor_un_end0074, R.drawable.seafloor_un_end0075,
            R.drawable.seafloor_un_end0076, R.drawable.seafloor_un_end0077, R.drawable.seafloor_un_end0078,
            R.drawable.seafloor_un_end0079, R.drawable.seafloor_un_end0080, R.drawable.seafloor_un_end0081,
            R.drawable.seafloor_un_end0082, R.drawable.seafloor_un_end0083, R.drawable.seafloor_un_end0084,
            R.drawable.seafloor_un_end0085, R.drawable.seafloor_un_end0086, R.drawable.seafloor_un_end0087,
            R.drawable.seafloor_un_end0088, R.drawable.seafloor_un_end0089, R.drawable.seafloor_un_end0090,
            R.drawable.seafloor_un_end0091, R.drawable.seafloor_un_end0092, R.drawable.seafloor_un_end0093,
            R.drawable.seafloor_un_end0094, R.drawable.seafloor_un_end0095, R.drawable.seafloor_un_end0096,
            R.drawable.seafloor_un_end0097, R.drawable.seafloor_un_end0098, R.drawable.seafloor_un_end0099,
            R.drawable.seafloor_un_end0100, R.drawable.seafloor_un_end0101, R.drawable.seafloor_un_end0102,
            R.drawable.seafloor_un_end0103, R.drawable.seafloor_un_end0104, R.drawable.seafloor_un_end0105,
            R.drawable.seafloor_un_end0106, R.drawable.seafloor_un_end0107, R.drawable.seafloor_un_end0108,
            R.drawable.seafloor_un_end0109, R.drawable.seafloor_un_end0110, R.drawable.seafloor_un_end0111,
            R.drawable.seafloor_un_end0112, R.drawable.seafloor_un_end0113, R.drawable.seafloor_un_end0114,
            R.drawable.seafloor_un_end0115, R.drawable.seafloor_un_end0116, R.drawable.seafloor_un_end0117,
            R.drawable.seafloor_un_end0118, R.drawable.seafloor_un_end0119, R.drawable.seafloor_un_end0120,
            R.drawable.seafloor_un_end0121, R.drawable.seafloor_un_end0122, R.drawable.seafloor_un_end0123,
            R.drawable.seafloor_un_end0124, R.drawable.seafloor_un_end0125, R.drawable.seafloor_un_end0126,
            R.drawable.seafloor_un_end0127, R.drawable.seafloor_un_end0128, R.drawable.seafloor_un_end0129,
            R.drawable.seafloor_un_end0130, R.drawable.seafloor_un_end0131, R.drawable.seafloor_un_end0132,
            R.drawable.seafloor_un_end0133, R.drawable.seafloor_un_end0134, R.drawable.seafloor_un_end0135,
            R.drawable.seafloor_un_end0136, R.drawable.seafloor_un_end0137, R.drawable.seafloor_un_end0138,
            R.drawable.seafloor_un_end0139, R.drawable.seafloor_un_end0140, R.drawable.seafloor_un_end0141,
            R.drawable.seafloor_un_end0142, R.drawable.seafloor_un_end0143, R.drawable.seafloor_un_end0144,
            R.drawable.seafloor_un_end0145, R.drawable.seafloor_un_end0146, R.drawable.seafloor_un_end0147,
            R.drawable.seafloor_un_end0148, R.drawable.seafloor_un_end0149, R.drawable.seafloor_un_end0150,
            R.drawable.seafloor_un_end0151, R.drawable.seafloor_un_end0152, R.drawable.seafloor_un_end0153,
            R.drawable.seafloor_un_end0154, R.drawable.seafloor_un_end0155, R.drawable.seafloor_un_end0156,
            R.drawable.seafloor_un_end0157, R.drawable.seafloor_un_end0158, R.drawable.seafloor_un_end0159,
            R.drawable.seafloor_un_end0160, R.drawable.seafloor_un_end0161, R.drawable.seafloor_un_end0162,
            R.drawable.seafloor_un_end0163, R.drawable.seafloor_un_end0164, R.drawable.seafloor_un_end0165,
            R.drawable.seafloor_un_end0166, R.drawable.seafloor_un_end0167, R.drawable.seafloor_un_end0168,
            R.drawable.seafloor_un_end0169, R.drawable.seafloor_un_end0170, R.drawable.seafloor_un_end0171,
            R.drawable.seafloor_un_end0172, R.drawable.seafloor_un_end0173, R.drawable.seafloor_un_end0174,
            R.drawable.seafloor_un_end0175, R.drawable.seafloor_un_end0176, R.drawable.seafloor_un_end0177,
            R.drawable.seafloor_un_end0178, R.drawable.seafloor_un_end0179, R.drawable.seafloor_un_end0180,
            R.drawable.seafloor_un_end0181, R.drawable.seafloor_un_end0182, R.drawable.seafloor_un_end0183,
            R.drawable.seafloor_un_end0184, R.drawable.seafloor_un_end0185, R.drawable.seafloor_un_end0186,
            R.drawable.seafloor_un_end0187, R.drawable.seafloor_un_end0188, R.drawable.seafloor_un_end0189,
            R.drawable.seafloor_un_end0190, R.drawable.seafloor_un_end0191, R.drawable.seafloor_un_end0192,
            R.drawable.seafloor_un_end0193, R.drawable.seafloor_un_end0194, R.drawable.seafloor_un_end0195,
            R.drawable.seafloor_un_end0196, R.drawable.seafloor_un_end0197, R.drawable.seafloor_un_end0198,
            R.drawable.seafloor_un_end0199, R.drawable.seafloor_un_end0200
    )
}