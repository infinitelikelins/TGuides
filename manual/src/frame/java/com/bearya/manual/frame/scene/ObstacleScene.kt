package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneObstacleBinding
import com.bearya.manual.frame.ObstacleFrame
import library.Music

class ObstacleScene : Fragment() {

    companion object {
        fun build(data: ObstacleFrame) = ObstacleScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneObstacleBinding
    private var data: ObstacleFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? ObstacleFrame?
        Music.stopBgMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneObstacleBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.obstacleFrame.mIsRepeat = false
        bindView.obstacleFrame.mGapTime = data?.gapTime
        bindView.obstacleFrame.mBitmapResourceIds = data?.images

        bindView.obstacleFrame.start()
        Music.playAssetsAudio(data?.music)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.obstacleFrame.stop()
        bindView.unbind()
    }

}