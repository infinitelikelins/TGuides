package library

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import androidx.databinding.DataBindingComponent
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import library.ext.dp2px

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

            val glide = Glide.with(imageView.context).load(url).apply(requestOptions)
            thumbnail?.let { glide.thumbnail(it) }
            glide.into(imageView)
        }
    }

    /**
     * 加载圆角方形头像或者图标
     *
     * @param imageView   加载控件
     * @param url         加载图片的地址
     * @param radius      图片剪切的圆角值
     * @param placeHolder 控件的占位符
     * @param error       加载失败的显示错误图片
     */
    @JvmStatic
    @BindingAdapter(value = ["round", "radius", "placeholder", "error","thumbnail"], requireAll = false)
    fun loadRound(imageView: ImageView, url: String?, radius: Int?, placeHolder: Drawable?, error: Drawable?, thumbnail:Float?) {
        if (TextUtils.isEmpty(url)) {
            imageView.setImageDrawable(placeHolder ?: error)
        } else {
            val transformation = RoundedCornersTransformation(radius?.dp2px(imageView.context) ?: 8, 8)

            val requestOptions = RequestOptions().also {
                it.centerCrop()
                if (placeHolder != null) it.placeholder(placeHolder)
                if (error != null) it.error(error)
                it.priority(Priority.HIGH)//优先级
                it.diskCacheStrategy(DiskCacheStrategy.NONE)//缓存策略
                it.transform(transformation)//转化为圆形
            }
            val glide = Glide.with(imageView.context).load(url).apply(requestOptions)
            thumbnail?.let { glide.thumbnail(it) }
            glide.into(imageView)
        }
    }

    /**
     * 加载圆形头像或者图标
     *
     * @param imageView   加载控件
     * @param url         加载图片的地址
     * @param placeHolder 控件的占位符
     * @param error       加载失败的显示错误图片
     */
    @JvmStatic
    @BindingAdapter(value = ["circle", "placeholder", "error","thumbnail"], requireAll = false)
    fun loadCircle(imageView: ImageView, url: String?, placeHolder: Drawable?, error: Drawable?, thumbnail:Float?) {
        if (TextUtils.isEmpty(url)) {
            imageView.setImageDrawable(placeHolder ?: error)
        } else {
            val transformation = CircleCrop()
            val requestOptions = RequestOptions().also {
                it.centerCrop()
                if (placeHolder != null) it.placeholder(placeHolder)
                if (error != null) it.error(error)
                it.priority(Priority.HIGH)//优先级
                it.diskCacheStrategy(DiskCacheStrategy.NONE)//缓存策略
                it.transform(transformation)
            }//转化为圆形
            val glide = Glide.with(imageView.context).load(url).apply(requestOptions)
            thumbnail?.let { glide.thumbnail(it) }
            glide.into(imageView)
        }
    }

    /**
     * 对将Color转换Drawable类型
     */
    @JvmStatic
    @BindingConversion
    fun convertColorToDrawable(colorRes: Int): ColorDrawable {
        return ColorDrawable(colorRes)
    }

}