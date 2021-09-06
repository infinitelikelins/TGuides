package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bearya.manual.databinding.SceneHelpBinding
import com.bearya.manual.frame.*
import library.Music

class HelpScene : Fragment() {

    companion object {
        fun build(data: HelpFrame) = HelpScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneHelpBinding
    private var data: HelpFrame? = null
    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? HelpFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneHelpBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindView.frameSurface.mIsRepeat = false
        bindView.frameSurface.mGapTime = data?.gapTime
        bindView.frameSurface.mBitmapResourceIds = data?.beginImages

        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            handleCommandResult(it)
        }

        bindView.frameSurface.start()
        Music.playAssetsAudio(data?.beginMusic) {
            bindView.frameSurface.mBitmapResourceIds = data?.endImages
            bindView.frameSurface.mIsRepeat = true
            bindView.frameSurface.start()
            Music.playAssetsAudio(data?.endMusic)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.frameSurface.stop()
        bindView.unbind()
    }

    private fun handleCommandResult(command: String?) {

        command?.split(";")?.takeIf { it.size >= 2 && it[0] == "city" }?.also {
            when (it[1]) {
                CityTimeout -> Music.playAssetsAudio(data?.timeoutMusic)
                CitySuccess, CityFail -> Music.playAssetsAudio(it[2].replace("tts/zh", "music"))
            }
        }

    }

}