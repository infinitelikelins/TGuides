package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneGoldBinding
import com.bearya.manual.frame.obj.GoldPropFrame
import library.Music

class GoldScene : Fragment() {

    companion object {
        fun build(goldCount: String) = GoldScene().apply {
            arguments = bundleOf("goldCount" to goldCount)
        }
    }

    private lateinit var bindView: SceneGoldBinding
    private var goldCount: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        goldCount = requireArguments().getString("goldCount", "1")
        Music.stopBgMusic()
        Music.stopMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneGoldBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.frameSurface.mGapTime = GoldPropFrame.gapTime
        bindView.frameSurface.mIsRepeat = false
        bindView.frameSurface.mBitmapResourceIds = GoldPropFrame.images
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.frameSurface.start()
        Music.playAssetsAudios(listOf(
                "music/gold_effect.mp3",
                "music/pick_up_coin1.mp3",
                "music/${goldCount?.toIntOrNull()?.takeIf { it < 50 } ?: 50}.mp3",
                "music/pick_up_coin2.mp3"
        ))
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