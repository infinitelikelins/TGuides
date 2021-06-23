package com.bearya.manual.section

import android.annotation.SuppressLint
import android.app.UiModeManager
import android.content.Context
import android.content.res.Configuration
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.view.*
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bearya.manual.R
import com.bearya.manual.databinding.FragmentSectionBinding
import com.bearya.manual.databinding.ItemImageBinding
import com.bumptech.glide.Glide
import com.tapadoo.alerter.Alerter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import library.ext.assetsPath
import library.ext.setData
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class SectionFragment : Fragment() {

    private lateinit var bindView: FragmentSectionBinding
    private val viewModel: SectionViewModel by viewModels()
    private val args: SectionFragmentArgs by navArgs()
    private var handler: Handler = RunnableHandler()

    private val handlerControllerGoneRunnable = Runnable {
        bindView.playList.visibility = View.GONE
        bindView.playListBg.visibility = View.GONE
    }

    private val handlerControllerVisibleRunnable = Runnable {
        bindView.playList.visibility = View.VISIBLE
        bindView.playListBg.visibility = View.VISIBLE
    }

    private val sectionPlayListAdapter by lazy {
        SectionAdapter().apply {
            onItemClickListener = { _, _, position ->
                viewModel.playIndex.setData(position)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = FragmentSectionBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView.playList.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = sectionPlayListAdapter
        }
        EventBus.getDefault().register(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.sectionDirPath.value = args.sectionDirPath
        viewModel.sectionDirFile.observe(viewLifecycleOwner) {
            sectionPlayListAdapter.setNewData(it)
        }
        viewModel.playIndex.observe(viewLifecycleOwner) {
            play(it)
            sectionPlayListAdapter.setSelectedIndex(it)
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onKeyEvents(event: KeyEvents) {
        when (event.keyCode) {
            KeyEvent.KEYCODE_MENU -> {
                if (bindView.playList.visibility == View.GONE) {
                    handler.removeCallbacks(handlerControllerGoneRunnable)
                    handler.post(handlerControllerVisibleRunnable)
                    handler.postDelayed(handlerControllerGoneRunnable, 3000)
                } else {
                    handler.removeCallbacks(handlerControllerVisibleRunnable)
                    handler.post(handlerControllerGoneRunnable)
                }
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> viewModel.playIndex.value?.takeIf { it < (sectionPlayListAdapter.data.size - 1) }?.plus(1)?.apply { viewModel.playIndex.setData(this) }
            KeyEvent.KEYCODE_DPAD_LEFT -> viewModel.playIndex.value?.takeIf { it > 0 }?.minus(1)?.apply { viewModel.playIndex.setData(this) }

        }
    }

    override fun onResume() {
        super.onResume()
        (context?.getSystemService(Context.UI_MODE_SERVICE) as? UiModeManager?)?.takeIf { it.currentModeType == Configuration.UI_MODE_TYPE_TELEVISION }?.also {
                    Alerter.create(requireActivity()).setTitle(R.string.guide_toast).setBackgroundColorRes(R.color.colorGray).setDuration(6 * 1000).show()
                }
        handler.postDelayed(handlerControllerGoneRunnable, 3000)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        EventBus.getDefault().unregister(this)
        if (Alerter.isShowing) {
            Alerter.hide()
        }
    }

    private fun play(index: Int) {
        if (sectionPlayListAdapter.data.size > index) {
            ImageFragment.create(sectionPlayListAdapter.data[index])
        } else {
            null
        }?.also {
            handler.removeCallbacks(handlerControllerGoneRunnable)
            childFragmentManager.beginTransaction().replace(R.id.player_layout, it, "$index").commit()
            handler.postDelayed(handlerControllerGoneRunnable, 3000)
        }
    }

    private class RunnableHandler : Handler()

}

class GestureListener : GestureDetector.SimpleOnGestureListener() {

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_MENU))
        return super.onSingleTapConfirmed(e)
    }

    override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        val t = (e1?.x ?: 0f) - (e2?.x ?: 0f)
        if (t < -50) {
            EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_DPAD_LEFT))
        } else if (t > 50) {
            EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_DPAD_RIGHT))
        }
        return super.onScroll(e1, e2, distanceX, distanceY)
    }

}

internal class ImageFragment : Fragment(), View.OnKeyListener {

    companion object {
        fun create(path: String): Fragment = ImageFragment().apply {
            arguments = bundleOf("image" to path)
        }
    }

    private lateinit var bindView: ItemImageBinding
    private val gesture by lazy { GestureDetector(requireContext(), GestureListener()) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = ItemImageBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView.imageView.isLongClickable = true
        bindView.imageView.setOnTouchListener { _, event -> gesture.onTouchEvent(event) }
        val image = requireArguments().getString("image", "")
        lifecycleScope.launch(Dispatchers.IO) {
            val factory = BitmapFactory.Options().apply {
                inJustDecodeBounds = true
            }
            BitmapFactory.decodeStream(requireContext().assets.open(image), null, factory)
            withContext(Dispatchers.Main) {
                //获取原图的宽高
                val width = factory.outWidth
                val height = factory.outHeight
                //获取imageView的宽
                val imageViewWidth = resources.displayMetrics.widthPixels
                if (imageViewWidth != width) {
                    // 计算缩放比例
                    val sy = (imageViewWidth * 0.1).toFloat() / (width * 0.1).toFloat()
                    // 计算图片等比例放大后的高
                    val imageViewHeight = (height * sy).toInt()
                    val params = bindView.imageView.layoutParams
                    params.height = imageViewHeight
                    bindView.imageView.layoutParams = params
                }

                Glide.with(view).load(image.assetsPath()).into(bindView.imageView)
                view.setOnKeyListener(this@ImageFragment)
                view.requestFocus()
            }

        }

    }

    override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean = false.also {
        if (event?.action == KeyEvent.ACTION_UP) {
            when (keyCode) {
                KeyEvent.KEYCODE_DPAD_UP -> bindView.scrollPicture.smoothScrollBy(0, -2)
                KeyEvent.KEYCODE_DPAD_DOWN -> bindView.scrollPicture.smoothScrollBy(0, 2)
                KeyEvent.KEYCODE_DPAD_LEFT -> EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_DPAD_LEFT))
                KeyEvent.KEYCODE_DPAD_RIGHT -> EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_DPAD_RIGHT))
                KeyEvent.KEYCODE_MENU, KeyEvent.KEYCODE_M -> EventBus.getDefault().post(KeyEvents(KeyEvent.KEYCODE_MENU))
            }
        }
    }

    override fun onPause() {
        super.onPause()
        bindView.root.setOnKeyListener(null)
    }

}

data class KeyEvents(val keyCode: Int)