package com.bearya.manual.chapter

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bearya.data.entity.Chapter
import com.bearya.manual.databinding.ItemChapterBinding
import library.OnItemSelectedListener
import library.ext.assetsPath

class ChapterAdapter : PagingDataAdapter<Chapter, UnitViewHolder>(object : DiffUtil.ItemCallback<Chapter>() {

    override fun areItemsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Chapter, newItem: Chapter): Boolean {
        return TextUtils.equals(oldItem.name, newItem.name)
    }

}) {

    // 焦点记忆的位置
    private var lastPosition = 0
    private var recyclerView: RecyclerView? = null
    var onItemSelectedListener: OnItemSelectedListener<Chapter>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder = UnitViewHolder(
            ItemChapterBinding.inflate(LayoutInflater.from(parent.context), parent, false).root
    )

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {

        val chapter = getItem(position)

        holder.bindView?.name = chapter?.name
                ?.replace("(小)", "")
                ?.replace("(中)", "")
                ?.replace("(大)", "")
        holder.bindView?.cover = "chapter/${chapter?.name}/cover.webp".assetsPath()

        holder.itemView.apply {

            setOnClickListener {
                onItemSelectedListener?.invoke(it, chapter, position)
            }
            onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
                if (hasFocus) {
                    lastPosition = position
                }
                val scale = if (hasFocus) 1.18f else 1.0f
                ViewCompat.animate(v).scaleX(scale).scaleY(scale).start()
            }
            // 焦点的判断
            if (lastPosition == position) {
                recyclerView?.smoothScrollToPosition(lastPosition)
                post { requestFocus() }
            }
        }
    }

    override fun onDetachedFromRecyclerView(rv: RecyclerView) {
        super.onDetachedFromRecyclerView(rv)
        recyclerView = null
    }

    override fun onAttachedToRecyclerView(rv: RecyclerView) {
        super.onAttachedToRecyclerView(rv)
        recyclerView = rv
    }

}

class UnitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val bindView: ItemChapterBinding? = DataBindingUtil.bind(itemView)

}