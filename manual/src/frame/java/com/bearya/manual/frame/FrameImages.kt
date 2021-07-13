package com.bearya.manual.frame

import java.io.Serializable

/**
 * 基础场景
 */
interface Frame : Serializable

/**
 * 表情场景
 */
interface EmotionFrame : Frame {
    val emotion: String
    val bgm: String
    val music: String?
}

/**
 * 状态场景
 */
interface StateFrame : Frame {
    val image: Int
}

/**
 * 启动场景
 */
interface StartFrame : Frame {
    val image: Int
    val bgm: String
    val music: String
}

/**
 * 主题场景
 */
interface ThemeFrame : Frame {
    val gapTime: Int
    val images: IntArray
    val bgm: String
    val music: MutableList<String>
    val repeatMusic:String?
}

/**
 * 介绍场景
 */
interface IntroduceFrame : Frame {
    val music: String
    val gapTime: Int
    val images: IntArray
}

/**
 * 道具场景
 */
interface PropFrame : Frame {
    val gapTime: Int
    val music: String
    val images: IntArray
}

/**
 * 障碍场景
 */
interface ObstacleFrame : Frame {
    val gapTime: Int
    val music: String
    val images: IntArray
}

/**
 * 终点场景
 */
interface EndFrame : Frame {
    val gapTime: Int
    val music: String
    val images: IntArray
}

/**
 * 终点没有收集完道具场景
 */
interface EndFailFrame : EndFrame {
    val prop1: Int
    val prop2: Int
    val prop3: Int
}

/**
 * 错误提示
 */
interface ErrorTextFrame : Frame {
    val errorText: String
    val errorMusic: String
}

/**
 * 游戏选项场景
 */
interface EventFrame : Frame {
    val gapTime: Int
    val beginImages: IntArray
    val endImages: IntArray?
    val leftImage: Int?
    val rightImage: Int?
    val beginMusic: String
    val questionMusic: String?
    val leftMusic: String?
    val rightMusic: String?
    val endMusic: String?
}

/**
 * 帮扶场景（爱心小天使专属）
 */
interface HelpFrame : Frame {
    val gapTime: Int
    val beginMusic: String
    val beginImages: IntArray
    val endMusic: String
    val endImages: IntArray
    val timeoutMusic: String
    val wrongMusic: String
    val rightMusic: String
}

/**
 * 终点场景
 */
interface SummaryFrame : Frame {
    val gapTime: Int
    val images: IntArray
    val music: String
}

/**
 * 出现了异常错误
 */
interface ExceptionFrame : Frame {
    val exceptionImage: Int
    val music: String
}

/**
 * 道路方向选择
 */
interface LoadFrame : Frame {
    val emotion: String?
    val bgm: String?
    val tips: String?
}