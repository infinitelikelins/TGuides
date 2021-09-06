package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneFlagBinding
import com.bearya.manual.frame.obj.FlagPropFrame
import library.Music

class FlagScene : Fragment() {

    companion object {
        fun build(flagSound: String) = FlagScene().apply {
            arguments = bundleOf("flagSound" to flagSound)
        }
    }

    private lateinit var bindView: SceneFlagBinding
    private var flagSound: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        flagSound = requireArguments().getString("flagSound", "flag_effect_1")
        Music.stopBgMusic()
        Music.stopMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneFlagBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.frameSurface.mGapTime = FlagPropFrame.gapTime
        bindView.frameSurface.mIsRepeat = false
        bindView.frameSurface.mBitmapResourceIds = FlagPropFrame.images

        bindView.frameSurface.start()
        Music.playAssetsAudio("music/$flagSound.mp3")
    }

    override fun onStop() {
        super.onStop()
        Music.stopMusic()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.frameSurface.stop()
        bindView.unbind()
    }

}