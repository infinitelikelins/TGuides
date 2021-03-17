package com.bearya.manual.chapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bearya.data.entity.Chapter
import com.bearya.manual.databinding.FragmentChapterBinding
import library.ext.setData

class ChapterFragment : Fragment() {

    private lateinit var bindView: FragmentChapterBinding
    private val viewModel: ChapterViewModel by viewModels()
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
        bindView.bookName.text = args.bookName
        bindView.unitList.adapter = chapterAdapter

        viewModel.chapters.observe(viewLifecycleOwner) {
            chapterAdapter.submitData(lifecycle, it)
        }
    }

}