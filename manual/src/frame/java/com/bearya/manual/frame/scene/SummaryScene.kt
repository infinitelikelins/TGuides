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
import com.bearya.manual.databinding.SceneSummaryBinding
import com.bearya.manual.frame.CityResult
import com.bearya.manual.frame.FrameViewModel
import com.bearya.manual.frame.SummaryFrame
import library.Music
import library.ext.withGone
import library.ext.withShow

class SummaryScene : Fragment() {

    companion object {
        fun build(data: SummaryFrame) = SummaryScene().apply {
            arguments = bundleOf("data" to data)
        }
    }

    private var goldCount: Int = 0
    private var stepCount: Int = 0
    private var doneCount: Int = 0
    private var stationCount: Int = 0
    private var flagCount: Int = 0
    private var knownCount: Int = 0
    private var data: SummaryFrame? = null
    private lateinit var bindView: SceneSummaryBinding
    private val viewModel: FrameViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = requireArguments().getSerializable("data") as? SummaryFrame?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = SceneSummaryBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        bindView.frameSurface.mIsRepeat = false
        bindView.frameSurface.mBitmapResourceIds = data?.images
        bindView.frameSurface.mGapTime = data?.gapTime

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.receiveCommand.observe(viewLifecycleOwner) {
            receive(it)
        }

        Music.stopBgMusic()
        withGone(bindView.icLight, bindView.resultCount)
        bindView.frameSurface.start()
        Music.playAssetsAudio(data?.music) {
            withShow(bindView.icLight, bindView.resultCount)
            Music.playAssetsAudio("music/gold_effect.mp3") {
                showCount()
            }
        }
    }

    override fun onStop() {
        super.onStop()
        bindView.frameSurface.stop()
        Music.stopMusic()
    }

    private fun receive(command: String?) {
        command?.split(";")?.takeIf { it.size >= 6 && it[0] == "city" && it[1] == CityResult }?.also {
            if (it.size > 6) {
                invokeParams(it[2], it[3], it[4], it[5], it[6], it[7])
            } else {
                invokeParams(it[2], it[3], it[4], it[5])
            }
        }
    }

    private fun showCount() {

        val constraintLayout: ConstraintLayout = bindView.root.findViewById(R.id.result_count_root)
        val transitionSet = TransitionSet().apply {
            addTransition(ChangeBounds().apply {
                addTarget(R.id.ic_light)
                duration = 500
                interpolator = AccelerateInterpolator()
            })
            addTransition(Fade(Fade.IN).apply {
                duration = 500
                interpolator = AccelerateInterpolator()
            })
            ordering = TransitionSet.ORDERING_TOGETHER
            interpolator = AccelerateInterpolator()
        }
        TransitionManager.beginDelayedTransition(constraintLayout, transitionSet)
        ConstraintSet().apply {
            clone(context, R.layout.scene_summary_end)
            applyTo(constraintLayout)
        }

        val audios = mutableListOf<String>()

        goldCount.takeIf { it > 0 }?.let {
            listOf(
                    "music/congratulations.mp3",
                    "music/${goldCount.takeIf { it < 50 } ?: 50}.mp3",
                    "music/coin.mp3"
            )
        }?.apply {
            audios.addAll(this)
        }

        stepCount.takeIf { it > 0 }?.let {
            listOf(
                    "music/had_gone.mp3",
                    "music/${stepCount.takeIf { it < 50 } ?: 50}.mp3",
                    "music/step.mp3"
            )
        }?.apply {
            audios.addAll(this)
        }

        doneCount.takeIf { it > 0 }?.let {
            listOf(
                    "music/had_done.mp3",
                    "music/${doneCount.takeIf { it < 50 } ?: 50}.mp3",
                    "music/good_deed.mp3"
            )
        }?.apply {
            audios.addAll(this)
        }

        flagCount.takeIf { it > 0 }?.let {
            "music/flag_$this.mp3"
        }?.apply {
            audios.add(this)
        }

        knownCount.takeIf { it > 0 }?.let {
            "music/known_$this.mp3"
        }?.apply {
            audios.add(this)
        }

        Music.playAssetsAudios(audios)
    }

    private fun invokeParams(goldCount: String? = "0", stepCount: String? = "0", doneCount: String? = "0",
                             stationCount: String? = "0", flagCount:String? = "0", knownCount:String? = "0") {
        this.goldCount = goldCount?.toIntOrNull() ?: 0
        this.stepCount = stepCount?.toIntOrNull() ?: 0
        this.doneCount = doneCount?.toIntOrNull() ?: 0
        this.stationCount = stationCount?.toIntOrNull() ?: 0
        this.flagCount = flagCount?.toIntOrNull() ?: 0
        this.knownCount = knownCount?.toIntOrNull() ?: 0

        bindView.goldCount.text = SpannableString("金        币：$goldCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 11, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 11, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.stepCount.text = SpannableString("步        数：$stepCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 11, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 11, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.doneCount.text = SpannableString("解决问题：$doneCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.stationCount.text = SpannableString("创想模块：$stationCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.flagCount.text = SpannableString("红旗模块：$flagCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
        bindView.knownCount.text = SpannableString("知识模块：$knownCount").apply {
            setSpan(ForegroundColorSpan(Color.parseColor("#9F5F18")), 0, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(ForegroundColorSpan(Color.parseColor("#FE6B1C")), 5, length, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        }
    }

}