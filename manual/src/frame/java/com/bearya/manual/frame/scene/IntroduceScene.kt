package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneIntroduceBinding
import com.bearya.manual.frame.IntroduceFrame
import library.Music

class IntroduceScene : Fragment() {

    companion object {
        fun build(data: IntroduceFrame) = IntroduceScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneIntroduceBinding
    private var data: IntroduceFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as IntroduceFrame
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneIntroduceBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView.introduceFrame.mIsRepeat = false
        bindView.introduceFrame.mBitmapResourceIds = data?.images
        bindView.introduceFrame.mGapTime = data?.gapTime
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.introduceFrame.start()
        Music.stopBgMusic()
        Music.playAssetsAudio(data?.music)
    }

}