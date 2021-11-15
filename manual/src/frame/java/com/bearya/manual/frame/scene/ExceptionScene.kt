package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.bearya.manual.databinding.SceneExceptionBinding
import com.bearya.manual.frame.ExceptionFrame
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import library.Music

class ExceptionScene : Fragment() {

    companion object {
        fun build(data: ExceptionFrame?) = ExceptionScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneExceptionBinding
    private var exceptionState: ExceptionFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exceptionState = requireArguments().getSerializable("data") as? ExceptionFrame?
        Music.stopBgMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneExceptionBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exceptionState?.apply { bindView.exception.setImageResource(exceptionImage) }

        lifecycleScope.launch {
            repeat(Int.MAX_VALUE) {
                delay(40 * 1000L)
                Music.playAssetsAudio("music/retry_40s.mp3")
                delay(20 * 1000L)
                Music.playAssetsAudio("music/retry_60s.mp3")
            }
        }

        Music.playAssetsAudio(exceptionState?.music) {
            Music.playAssetsBgMusic("music/game_fail.mp3")
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        lifecycleScope.cancel()
        Music.stopBgMusic()
        bindView.unbind()
    }

}