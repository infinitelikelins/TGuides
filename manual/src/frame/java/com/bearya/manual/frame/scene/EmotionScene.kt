package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneEmotionBinding
import com.bearya.manual.frame.EmotionFrame
import library.Music

class EmotionScene : Fragment() {

    companion object {
        fun build(data: EmotionFrame) = EmotionScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private var data: EmotionFrame? = null
    private lateinit var bindView: SceneEmotionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? EmotionFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneEmotionBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.lottieView.setAnimation(data?.emotion)
        bindView.lottieView.playAnimation()

        Music.playAssetsAudio(data?.music) {
            Music.playAssetsBgMusic(data?.bgm)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.lottieView.cancelAnimation()
        bindView.lottieView.setImageDrawable(null)
    }

}