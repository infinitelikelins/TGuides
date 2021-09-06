package com.bearya.manual.book

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bearya.data.entity.Book
import com.bearya.manual.R
import com.bearya.manual.databinding.ItemBookBinding
import library.OnItemClickListener
import library.ext.assetsPath

class BookPagingAdapter : PagingDataAdapter<Book, BookViewHolder>(object : DiffUtil.ItemCallback<Book>() {

    override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean =
            TextUtils.equals(oldItem.name, newItem.name) && oldItem.lock == newItem.lock

}) {

    private var lastPosition = 0
    private var recyclerView: RecyclerView? = null
    var onItemClickLister: OnItemClickListener<Book?>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder = BookViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
    )

    override fun onBindViewHolder(holder: BookViewHolder, index: Int) {

        val position = holder.bindingAdapterPosition

        val book = getItem(position)

        holder.bindView.cover = book?.cover?.assetsPath()
        holder.bindView.lock = book?.lock ?: true

        holder.itemView.apply {

            setOnClickListener { onItemClickLister?.invoke(it, book, position) }

            onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
                if (hasFocus) lastPosition = position
                val scaleSize = if (hasFocus) 1.1f else 1.0f
                view?.animate()?.scaleX(scaleSize)?.scaleY(scaleSize)?.start()
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

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val bindView: ItemBookBinding = ItemBookBinding.bind(itemView)
}