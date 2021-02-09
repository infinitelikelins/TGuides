package library.widget

import `is`.arontibo.library.IntroView
import `is`.arontibo.library.ProgressDownloadView
import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewTreeObserver
import android.widget.FrameLayout
import com.bearya.manual.R

class DownloadBar(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs),
        IntroView.EnterAnimationListener {

    private var mIntroView: IntroView? = null
    private var mProgressDownloadView: ProgressDownloadView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.download_bar, this, true)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        mIntroView = findViewById(R.id.intro_view)
        mIntroView?.setListener(this)
        mProgressDownloadView = findViewById(R.id.progress_download_view)

        mProgressDownloadView?.viewTreeObserver?.addOnGlobalLayoutListener(
                object : ViewTreeObserver.OnGlobalLayoutListener {
                    override fun onGlobalLayout() {
                        mProgressDownloadView?.viewTreeObserver?.removeOnGlobalLayoutListener(this)
                        mIntroView?.layoutParams?.width = mProgressDownloadView!!.width
                        mIntroView?.layoutParams?.height = mProgressDownloadView!!.height
                    }
                })
    }

    public override fun onRestoreInstanceState(state: Parcelable) {
        super.onRestoreInstanceState(state)
        mIntroView?.init()
        mIntroView?.visibility = View.VISIBLE
    }

    fun startIntro() = mIntroView?.startAnimation()

    fun setProgress(progress: Float) = mProgressDownloadView?.setPercentage(progress)

    fun success() = mProgressDownloadView?.drawSuccess()

    fun fail() = mProgressDownloadView?.drawFail()

    override fun onEnterAnimationFinished() {
        mIntroView?.visibility = View.INVISIBLE
        mProgressDownloadView?.visibility = View.VISIBLE
    }

}