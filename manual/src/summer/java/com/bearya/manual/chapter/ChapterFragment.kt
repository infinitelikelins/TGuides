package com.bearya.manual.chapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.bearya.data.entity.Chapter
import com.bearya.manual.R
import com.bearya.manual.databinding.FragmentChapterBinding
import com.bearya.manual.main.MainViewModel
import library.STATE_CONNECTED
import library.STATE_INIT
import library.STATE_NONE
import library.STATE_WAITING
import library.ext.setData

class ChapterFragment : Fragment(), View.OnFocusChangeListener, View.OnClickListener {

    private lateinit var bindView: FragmentChapterBinding
    private val viewModel: ChapterViewModel by viewModels()
    private val mainViewModel: MainViewModel by activityViewModels()
    private val args: ChapterFragmentArgs by navArgs()

    private val chapterAdapter: ChapterAdapter by lazy {
        ChapterAdapter().apply {
            onItemSelectedListener = { view: View, chapter: Chapter?, _: Int ->
                val dir = "chapter/${chapter?.name}/resource"
                val directions = ChapterFragmentDirections.actionChapterFragmentToSectionFragment(dir)
                Navigation.findNavController(view).navigate(directions)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.bookId.setData(args.bookId)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = FragmentChapterBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        bindView.navigationSettings.onFocusChangeListener = this
        bindView.navigationSettings.setOnClickListener(this)
        mainViewModel.hasNewApk.observe(viewLifecycleOwner) {
            if (it) { "设置(发现新版本)" } else { "设置" }.apply { bindView.navigationSettings.text = this }
        }
        bindView.bluetoothName = mainViewModel.bluetoothName
        bindView.bookName.text = args.bookName
        bindView.unitList.adapter = chapterAdapter

        viewModel.chapters.observe(viewLifecycleOwner) {
            chapterAdapter.submitData(lifecycle, it)
        }

        mainViewModel.bluetoothState.observe(viewLifecycleOwner) {
            when (it) {
                STATE_INIT -> {
                    bindView.navigationAnimation.isSelected = false
                    bindView.navigationAnimation.isActivated = false
                }
                STATE_WAITING -> {
                    bindView.navigationAnimation.isSelected = false
                    bindView.navigationAnimation.isActivated = true
                }
                STATE_CONNECTED -> {
                    bindView.navigationAnimation.isSelected = true
                    bindView.navigationAnimation.isActivated = true
                    Navigation.findNavController(bindView.root).navigate(R.id.action_to_activityFrame)
                }
                STATE_NONE -> {
                    bindView.navigationAnimation.isSelected = false
                    bindView.navigationAnimation.isActivated = false
                }
            }
        }
    }

    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        val scaleSize = if (hasFocus) 1.1f else 1.0f
        v?.animate()?.scaleX(scaleSize)?.scaleY(scaleSize)?.start()

        (v as? AppCompatTextView?)?.compoundDrawables?.forEachIndexed { _, drawable ->
            (drawable as? AnimatedVectorDrawableCompat?)?.apply {
                if (hasFocus) start() else stop()
            }
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.navigation_settings -> Navigation.findNavController(v).navigate(R.id.action_chapterFragment_to_settingsFragment)
        }
    }

}