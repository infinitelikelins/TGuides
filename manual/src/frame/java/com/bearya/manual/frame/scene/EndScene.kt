package com.bearya.manual.frame.scene

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.transition.ChangeBounds
import android.transition.Fade
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bearya.manual.R
import com.bearya.manual.databinding.SceneEndBinding
import com.bearya.manual.frame.EndFrame
import com.bearya.manual.frame.FrameViewModel
import com.bearya.manual.frame.StoryResult
import library.Music
import library.ext.withGone
import library.ext.withShow

class EndScene : Fragment() {

    companion object {
        fun build(data: EndFrame) = EndScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private lateinit var bindView: SceneEndBinding
    private var data: EndFrame? = null

    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? EndFrame?
        Music.stopBgMusic()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneEndBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            receive(it)
        }

        bindView.endFrame.mIsRepeat = false
        bindView.endFrame.mBitmapResourceIds = data?.images
        bindView.endFrame.mGapTime = data?.gapTime

        bindView.endFrame.start()

        withGone(bindView.background, bindView.icLight)

        Music.playAssetsAudio(data?.music) {
            withShow(bindView.background, bindView.icLight)
            Music.playAssetsAudio("music/gold_effect.mp3") {
                showCount()
            }
        }

    }

    private fun showCount() {
        val constraintLayout: ConstraintLayout = bindView.popupResultSuccessView
        val transitionSet = TransitionSet().apply {
            addTransition(Fade(Fade.IN).apply {
                duration = 500
                interpolator = AccelerateInterpolator()
            })
            addTransition(ChangeBounds().apply {
                addTarget(R.id.ic_light)
                duration = 500
                interpolator = AccelerateInterpolator()
            })
            ordering = TransitionSet.ORDERING_TOGETHER
            interpolator = AccelerateInterpolator()
        }
        TransitionManager.beginDelayedTransition(constraintLayout, transitionSet)
        ConstraintSet().apply {
            clone(context, R.layout.scene_story_result_end)
            applyTo(constraintLayout)
        }
    }

    override fun onPause() {
        super.onPause()
        bindView.endFrame.stop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.unbind()
    }

    private fun receive(command: String?) {
        val commandParams = command?.split(";")?.takeIf { it.size >= 3 }
        when (commandParams?.get(0)) {
            StoryResult -> invokeParams(commandParams[1], commandParams[2])
        }
    }

    private fun invokeParams(propCount: String, pathCount: String) {

        bindView.pathText.text = SpannableString("路径指令：$pathCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.propText.text = SpannableString("道具指令：$propCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }

    }

}