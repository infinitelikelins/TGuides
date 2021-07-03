package library

import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingComponent
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

/**
 * DataBinding 默认控件组合
 */
object DefaultBinding : DataBindingComponent {

    /**
     * 加载头像或者图标
     *
     * @param imageView   加载控件
     * @param url         加载图片的地址
     * @param placeHolder 控件的占位符
     * @param error       加载失败的显示错误图片
     */
    @JvmStatic
    @BindingAdapter(value = ["load", "placeholder", "error","thumbnail"], requireAll = false)
    fun load(imageView: ImageView, url: String?, placeHolder: Drawable?, error: Drawable? , thumbnail:Float?) {
        if (TextUtils.isEmpty(url)) {
            imageView.setImageDrawable(placeHolder ?: error)
        } else {
            val requestOptions = RequestOptions().also {
                if (placeHolder != null) it.placeholder(placeHolder)
                if (error != null) it.error(error)
                it.priority(Priority.HIGH)//优先级
                it.diskCacheStrategy(DiskCacheStrategy.NONE)//缓存策略
            }
            Glide.with(imageView.context).load(url).apply(requestOptions)
                .thumbnail(thumbnail ?: 1.0f).into(imageView)
        }
    }

}