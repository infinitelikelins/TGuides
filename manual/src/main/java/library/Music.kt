package library

import android.content.Context
import android.media.MediaPlayer
import java.lang.ref.WeakReference

object Music {

    private var localMusicPlayer: LocalMusicPlayer? = null
    private var localMusicPlayerBg: LocalMusicPlayer? = null

    private val audios = mutableListOf<String>()

    private lateinit var mContext: WeakReference<Context>

    fun init(context: Context) {
        mContext = WeakReference(context)
        mContext.get()?.apply {
            localMusicPlayer = LocalMusicPlayer(this, false)
            localMusicPlayerBg = LocalMusicPlayer(this, true)
        }
    }

    fun playAssetsAudios(names: MutableList<String>?, listener: (() -> Unit)? = null) {
        names?.apply {
            audios.clear()
            audios.addAll(this)
            playAudios(listener)
        } ?: listener?.invoke()
    }

    private fun playAudios(listener: (() -> Unit)? = null) {
        try {
            playAssetsAudio(audios.removeFirst()) { playAudios(listener) }
        } catch (ex: Exception) {
            listener?.invoke()
        }
    }

    fun playAssetsAudio(name: String?, listener: (() -> Unit)? = null) {
        try {
            localMusicPlayer?.stop()
            localMusicPlayer?.mOnCompletionListener = listener
            localMusicPlayer?.isLooping = false
            localMusicPlayer?.play(name)
        } catch (ex: Exception) {
            listener?.invoke()
        }
    }

    fun stopMusic() {
        localMusicPlayer?.stop()
    }

    fun playAssetsBgMusic(name: String?) {
        try {
            localMusicPlayerBg?.stop()
            localMusicPlayerBg?.play(name)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun stopBgMusic() {
        localMusicPlayerBg?.stop()
    }

    fun destroy() {
        localMusicPlayer?.release()
        localMusicPlayerBg?.release()
    }

}

internal class LocalMusicPlayer(context: Context, looping: Boolean = false) {

    private var mContext: WeakReference<Context>? = null
    private var mp: MediaPlayer? = null

    var mOnCompletionListener: (() -> Unit)? = null
    var isLooping: Boolean = false
        set(value) {
            field = value
            mp?.isLooping = value
        }

    init {
        mContext = WeakReference(context)
        mp = MediaPlayer().apply {
            setOnCompletionListener { mOnCompletionListener?.invoke() }
            setOnErrorListener { _, _, _ -> true }
        }
        isLooping = looping
    }

    @Throws(Exception::class)
    private fun setDataSource(dataSource: String) {
        if (dataSource.isNotEmpty()) {
            val assetMg = mContext?.get()?.assets
            val fileDescriptor = assetMg?.openFd(dataSource)
            mp?.setDataSource(fileDescriptor?.fileDescriptor, fileDescriptor?.startOffset ?: 0, fileDescriptor?.length ?: 0)
        }
    }

    @Throws(Exception::class)
    fun play(ds: String?) {
        if (ds != null && ds.isNotEmpty()) {
            stop()
            setDataSource(ds)
            mp?.setOnPreparedListener { it.start() }
            mp?.prepareAsync()
        } else {
            throw Exception("dataSource is empty")
        }
    }

    fun stop() {
        pause()
        mp?.reset()
        mp?.isLooping = isLooping
    }

    fun release() {
        stop()
        mp?.release()
        mp = null
    }

    private fun pause() = mp?.isPlaying?.takeIf { it }?.apply { mp?.pause() }

}