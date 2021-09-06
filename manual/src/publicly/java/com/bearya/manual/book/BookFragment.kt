package com.bearya.manual.book

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import com.bearya.data.entity.Book
import com.bearya.manual.R
import com.bearya.manual.chapter.LicencePopupWindow
import com.bearya.manual.databinding.FragmentBookBinding
import com.bearya.manual.main.MainViewModel
import com.kaopiz.kprogresshud.KProgressHUD
import es.dmoral.toasty.Toasty
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import library.*

class BookFragment : Fragment(), View.OnFocusChangeListener, View.OnClickListener {

    private lateinit var bindView: FragmentBookBinding
    private val viewModel: BookViewModel by viewModels()
    private val mainViewModel: MainViewModel by activityViewModels()

    private val bookPagingAdapter: BookPagingAdapter by lazy {
        BookPagingAdapter().apply {
            onItemClickLister = { view: View, item: Book?, _: Int ->
                if (item?.lock == false) {
                    Navigation.findNavController(view).navigate(BookFragmentDirections.actionBookFragmentToChapterFragment(item.id
                            ?: 0, item.name))
                } else {
                    activateBooks()
                }
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = FragmentBookBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        bindView.navigationSettings.onFocusChangeListener = this
        bindView.navigationSettings.setOnClickListener(this)
        mainViewModel.hasNewApk.observe(viewLifecycleOwner) {
            if (it) { "设置(发现新版本)" } else { "设置" }.apply { bindView.navigationSettings.text = this }
        }
        bindView.bookRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        bindView.bookRecyclerView.itemAnimator = DefaultItemAnimator()
        bindView.bookRecyclerView.adapter = bookPagingAdapter

        bindView.bluetoothName = mainViewModel.bluetoothName

        viewModel.books.observe(viewLifecycleOwner) {
            bookPagingAdapter.submitData(lifecycle, it)
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
            R.id.navigation_settings -> Navigation.findNavController(v).navigate(R.id.action_bookFragment_to_settingsFragment)
        }
    }

    private fun activateBooks() {

        LicencePopupWindow(requireContext()).apply {
            onActivateClickListener = { data: String? ->
                val hud = KProgressHUD.create(requireContext(), KProgressHUD.Style.SPIN_INDETERMINATE)
                        .setLabel("正在验证中")
                        .setCancellable(false)
                        .setAutoDismiss(true)
                        .setAnimationSpeed(2)
                        .show()
                lifecycleScope.launch {
                    delay(1000)
                    viewModel.activateVerify(data).observe(viewLifecycleOwner) {
                        hud.dismiss()
                        when (it) {
                            Success -> Toasty.success(requireContext(), "开通成功啦", 6000).show().also { viewModel.unlockBooks(); dismiss() }
                            Invalid -> Toasty.warning(requireContext(), "该授权码已失效", 6000).show()
                            None -> Toasty.error(requireContext(), "该授权码不存在", 6000).show()
                            Empty -> Toasty.error(requireContext(), "请确认您输入的授权码", 6000).show()
                            NoNet -> Toasty.error(requireContext(), "请检查您是否已经联网", 6000).show()
                            Fail -> Toasty.error(requireContext(), "验证失败", 6000).show()
                        }
                    }
                }
            }
        }.also {
            it.showPopupWindow()
        }

    }

}