package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bearya.manual.databinding.SceneWalkMoveBinding
import com.bearya.manual.frame.*
import library.Music
import library.ext.emotion

class WalkMoveScene : Fragment() {

    companion object {
        fun build(data: LoadFrame) = WalkMoveScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneWalkMoveBinding
    private var data: LoadFrame? = null
    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? LoadFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bindView = SceneWalkMoveBinding.inflate(inflater, container, false)
        bindView.lifecycleOwner = viewLifecycleOwner
        return bindView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        emotion(data?.emotion)?.apply { bindView.lottieView.setAnimation(this) }
        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            receive(it)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.lottieView.playAnimation()
        data?.tips?.apply {
            Music.playAssetsAudio(this) {
                Music.playAssetsBgMusic(data?.bgm)
            }
        } ?: Music.playAssetsBgMusic(data?.bgm)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Music.stopBgMusic()
        bindView.lottieView.cancelAnimation()
        bindView.lottieView.setImageDrawable(null)

        bindView.unbind()
    }

    private fun receive(command: String?) {
        command?.split(";")?.takeIf { it.size >= 2 && it[0] == "city" }?.also {
            when (it[1]) {
                CityWarning -> {
                    bindView.lottieView.cancelAnimation()
                    bindView.lottieView.setAnimation(emotion("zm"))
                    bindView.lottieView.playAnimation()
                    Music.playAssetsAudio("music/timeout_tip.mp3")
                }
                CityTimeout -> {
                    bindView.lottieView.cancelAnimation()
                    bindView.lottieView.setAnimation(emotion("axy"))
                    bindView.lottieView.playAnimation()
                    Music.playAssetsAudio("music/max_time_over.mp3")
                }
                CityGoAhead -> Music.playAssetsAudio(it[2].replace("tts", "music"))
                CityLose -> Music.playAssetsAudio(it[2].replace("tts", "music"))
            }
        }
    }

}