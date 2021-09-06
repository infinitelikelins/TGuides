package com.bearya.manual.chapter

import android.content.Context
import android.view.View
import android.view.animation.Animation
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import com.bearya.manual.R
import library.OnActivateClickListener
import razerdp.basepopup.BasePopupWindow
import razerdp.util.animation.AlphaConfig
import razerdp.util.animation.AnimationHelper
import razerdp.util.animation.ScaleConfig

class LicencePopupWindow(context: Context) : BasePopupWindow(context),
    View.OnFocusChangeListener {

    private lateinit var licence: AppCompatEditText
    private lateinit var activate: AppCompatTextView
    var onActivateClickListener: OnActivateClickListener<String>? = null

    override fun onCreateContentView(): View = createPopupById(R.layout.popup_licence).apply {
        licence = findViewById(R.id.licence)
        activate = findViewById(R.id.activate)
        activate.onFocusChangeListener = this@LicencePopupWindow
        activate.setOnClickListener { onActivateClickListener?.invoke(licence.text.toString()) }
    }

    override fun onCreateShowAnimation(): Animation? =
        AnimationHelper.asAnimation()
            .withScale(ScaleConfig.CENTER)
            .withAlpha(AlphaConfig.IN)
            .toShow()

    override fun onCreateDismissAnimation(): Animation? =
        AnimationHelper.asAnimation()
            .withScale(ScaleConfig.CENTER)
            .withAlpha(AlphaConfig.OUT)
            .toDismiss()

    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        val scale = if (hasFocus) 1.08f else 1.0f
        v?.animate()?.scaleX(scale)?.scaleY(scale)?.start()
    }

}