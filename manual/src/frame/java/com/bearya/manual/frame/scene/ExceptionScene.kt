package com.bearya.manual.frame.scene

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneExceptionBinding
import com.bearya.manual.frame.ExceptionFrame
import library.Music

class ExceptionScene : Fragment() {

    companion object {
        fun build(data: ExceptionFrame?) = ExceptionScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneExceptionBinding
    private var exceptionState: ExceptionFrame? = null
    private val handler:TimeoutHandler by lazy { TimeoutHandler() }

    private val timeoutHalfRunnable: Runnable by lazy {
        Runnable {
            Music.playAssetsAudio("music/retry_40s.mp3")
        }
    }

    private val timeoutMaxRunnable: Runnable by lazy {
        Runnable {
            Music.playAssetsAudio("music/retry_60s.mp3")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        exceptionState = requireArguments().getSerializable("data") as? ExceptionFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneExceptionBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exceptionState?.apply { bindView.exception.setImageResource(exceptionImage) }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        handler.postDelayed(timeoutHalfRunnable, 40 * 1000)
        handler.postDelayed(timeoutMaxRunnable, 60 * 1000)
        Music.stopBgMusic()
        Music.playAssetsAudio(exceptionState?.music) {
            Music.playAssetsBgMusic("music/game_fail.mp3")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacks(timeoutHalfRunnable)
        handler.removeCallbacks(timeoutMaxRunnable)
        Music.stopBgMusic()
        Music.stopMusic()
        bindView.unbind()
    }

    private class TimeoutHandler : Handler()

}