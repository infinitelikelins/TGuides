package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneStartBinding
import com.bearya.manual.frame.StartFrame
import library.Music

class StartScene : Fragment() {

    companion object {
        fun build(data: StartFrame) = StartScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneStartBinding
    private var data: StartFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? StartFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneStartBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        data?.image?.apply { bindView.startImage.setImageResource(this) }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Music.stopBgMusic()
        Music.playAssetsAudio(data?.music) {
            Music.playAssetsBgMusic(data?.bgm)
        }
    }

}