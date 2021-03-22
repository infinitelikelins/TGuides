package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.bearya.manual.databinding.SceneThemeBinding
import com.bearya.manual.frame.*
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import library.Music

class ThemeScene : Fragment() {

    companion object {
        fun build(data: ThemeFrame) = ThemeScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneThemeBinding
    private var data: ThemeFrame? = null

    private var launch: Job? = null
    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? ThemeFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneThemeBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.themeFrame.mIsRepeat = true
        bindView.themeFrame.mBitmapResourceIds = data?.images
        bindView.themeFrame.mGapTime = data?.gapTime

        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            receive(it)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.themeFrame.start()
        Music.stopBgMusic()
        Music.playAssetsAudios(data?.music) {
            Music.playAssetsBgMusic(data?.bgm)
        }

        launch = lifecycleScope.launch {
            repeat(100000) {
                delay(20 * 1000)
                Music.playAssetsAudio(data?.repeatMusic)
            }
        }
    }

    private fun receive(command: String?) {
        command?.split(";")?.takeIf { it.size >= 3 && it[0] == "city" && it[1] == CityGo }?.also {
            launch?.cancel()
            Music.stopBgMusic()
            Music.playAssetsAudio("music/${it[2]}.mp3")
        } ?: command?.also {
            launch?.cancel()
            when (it) {
                StoryHeroAudio -> Music.playAssetsAudio("music/s_hero.mp3")
                StoryTreasureAudio -> Music.playAssetsAudio("music/s_treasure.mp3")
                StoryBallAudio -> Music.playAssetsAudio("music/s_ball.mp3")
            }
        }
    }

}