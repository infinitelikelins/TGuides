package com.bearya.manual.frame.scene

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bearya.manual.R
import com.bearya.manual.databinding.SceneNiceBinding
import com.bearya.manual.frame.*
import library.Music
import library.ext.showImageResource
import library.ext.startShake
import library.ext.withGone
import library.ext.withShow

class EventScene : Fragment() {

    companion object {
        fun build(data: EventFrame) = EventScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneNiceBinding

    private var data: EventFrame? = null

    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? EventFrame?
        Music.stopBgMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneNiceBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        data?.leftImage?.apply { bindView.left.setImageResource(this) }
        data?.rightImage?.apply { bindView.right.setImageResource(this) }

        bindView.option.isSelected = false

        bindView.frameSurface.mBitmapResourceIds = data?.beginImages
        bindView.frameSurface.mGapTime = data?.gapTime
        bindView.frameSurface.mIsRepeat = false

        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            handleEvent(it)
        }

        bindView.frameSurface.start()

        Music.playAssetsAudio(data?.beginMusic) {
            bindView.option.isSelected = true
            withShow(bindView.left, bindView.right)
            Music.playAssetsAudio(data?.questionMusic) {
                bindView.left.startShake()
                Music.playAssetsAudio(data?.leftMusic) {
                    bindView.right.startShake()
                    Music.playAssetsAudio(data?.rightMusic)
                }
            }
        }

    }

    override fun onStop() {
        super.onStop()
        bindView.frameSurface.stop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.unbind()
    }

    private fun handleEvent(data: String?) {
        data?.split(";")?.takeIf { it.size >= 2 && it[0] == "city" }?.also {
            when (it[1]) {
                CitySuccess1 -> "music/right1.mp3".also { withShow(bindView.masking); bindView.result.showImageResource(R.drawable.right_layer) }
                CitySuccess2 -> "music/right2.mp3".also { withShow(bindView.masking); bindView.result.showImageResource(R.drawable.right_layer) }
                CitySuccess3 -> "music/right3.mp3".also { withShow(bindView.masking); bindView.result.showImageResource(R.drawable.right_layer) }
                CityFail1 -> "music/wrong1.mp3".also { withShow(bindView.masking, bindView.leftEye, bindView.rightEye); bindView.result.showImageResource(R.drawable.do_error) }
                CityFail2 -> "music/wrong2.mp3".also { withShow(bindView.masking, bindView.leftEye, bindView.rightEye); bindView.result.showImageResource(R.drawable.do_error) }
                CityTimeout -> "music/delay_50s.mp3"
                CityWarning -> Music.playAssetsAudio("music/delay_30s.mp3").let { null }
                else -> null
            }?.apply { Music.playAssetsAudio(this) { showResult() } }
        }
    }

    private fun showResult() {
        withGone(bindView.right, bindView.left, bindView.option, bindView.result)
        bindView.frameSurface.mBitmapResourceIds = this@EventScene.data?.endImages
        bindView.frameSurface.start()
        Music.playAssetsAudio(this@EventScene.data?.endMusic)
    }

}