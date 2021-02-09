package com.bearya.manual.frame.obj

import com.bearya.manual.frame.EmotionFrame

object HeroEmotionFrame : EmotionFrame {
    override val emotion: String = "emotion/sq.json"
    override val bgm: String = "music/hero_walk.mp3"
    override val music: String? = null
}
