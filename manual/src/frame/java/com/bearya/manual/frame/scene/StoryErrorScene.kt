package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneStoryErrorBinding
import com.bearya.manual.frame.ErrorTextFrame
import library.Music

class StoryErrorScene : Fragment() {

    companion object {
        fun build(data: ErrorTextFrame) = StoryErrorScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneStoryErrorBinding
    private var data: ErrorTextFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? ErrorTextFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneStoryErrorBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.errorText.text = data?.errorText

        Music.stopBgMusic()
        Music.playAssetsAudio(data?.errorMusic)
    }

}