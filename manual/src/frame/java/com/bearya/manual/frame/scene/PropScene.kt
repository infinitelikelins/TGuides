package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bearya.manual.databinding.ScenePropBinding
import com.bearya.manual.frame.PropFrame
import library.Music

class PropScene : Fragment() {

    companion object {
        fun build(data: PropFrame) = PropScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: ScenePropBinding
    private var data: PropFrame? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? PropFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = ScenePropBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.propFrame.mGapTime = data?.gapTime
        bindView.propFrame.mBitmapResourceIds = data?.images
        bindView.propFrame.mIsRepeat = false
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindView.propFrame.start()
        Music.stopBgMusic()
        Music.playAssetsAudio(data?.music)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.propFrame.stop()
        bindView.unbind()
    }

}