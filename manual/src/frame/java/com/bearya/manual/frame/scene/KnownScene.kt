package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.SceneKnownBinding
import com.bumptech.glide.Glide
import library.Music
import library.ext.assetsPath

class KnownScene : Fragment() {

    companion object {
        fun build(knownName: String) = KnownScene().apply {
            arguments = bundleOf("knownName" to knownName)
        }
    }

    private lateinit var bindView: SceneKnownBinding
    private var knownName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        knownName = requireArguments().getString("knownName", "chang5_1")
        Music.stopBgMusic()
        Music.stopMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneKnownBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this).load("patriotism/$knownName.webp".assetsPath()).into(bindView.knownIntro)

        Music.playAssetsAudio("patriotism/$knownName.mp3")
    }

    override fun onStop() {
        super.onStop()
        Music.stopMusic()
    }

}