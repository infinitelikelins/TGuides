package com.bearya.manual.section

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bearya.manual.R
import com.bearya.manual.databinding.ItemPlaylistBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import library.OnItemClickListener
import library.ext.assetsPath

class SectionAdapter : RecyclerView.Adapter<PlayListViewHolder>() {

    var onItemClickListener: OnItemClickListener<String>? = null
    val data: MutableList<String> by lazy { mutableListOf<String>() }

    private var currentFocusItemIndex = 0
    private var recyclerView: RecyclerView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListViewHolder = PlayListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_playlist, parent, false)
    )

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: PlayListViewHolder, position: Int) {

        val section = data[position]

        val context = holder.itemView.context

        holder.bindView.name.text = section.substringAfterLast("/").substringBefore(".")

        holder.bindView.cover.apply {
            setBorderColor(ResourcesCompat.getColor(context.resources,
                    if (position == currentFocusItemIndex) {
                        R.color.colorWhite
                    } else {
                        R.color.colorBlue
                    }, null))
            setBorderWidth(if (position == currentFocusItemIndex) 4 else 0)
        }

        Glide.with(holder.itemView).load(section.assetsPath())
                .thumbnail(0.2f)
                .apply(RequestOptions().also {
                    it.centerCrop()
                    it.priority(Priority.HIGH)//优先级
                    it.diskCacheStrategy(DiskCacheStrategy.NONE)//缓存策略
                    it.error(R.drawable.launcher)
                }).into(holder.bindView.cover)

        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(it, section, position)
        }

    }

    fun setNewData(newData: List<String>?) {
        if (newData != null) {
            data.clear()
            data.addAll(newData)
            notifyDataSetChanged()
        }
    }

    fun setSelectedIndex(position: Int) {
        notifyItemChanged(currentFocusItemIndex)
        currentFocusItemIndex = position
        notifyItemChanged(currentFocusItemIndex)
        recyclerView?.smoothScrollToPosition(currentFocusItemIndex)
    }

    override fun onAttachedToRecyclerView(rv: RecyclerView) {
        super.onAttachedToRecyclerView(rv)
        recyclerView = rv
    }

    override fun onDetachedFromRecyclerView(rv: RecyclerView) {
        super.onDetachedFromRecyclerView(rv)
        recyclerView = null
    }

}

class PlayListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val bindView: ItemPlaylistBinding = ItemPlaylistBinding.bind(itemView)
}