package library

import android.content.Context
import android.media.MediaPlayer
import android.util.SparseArray
import androidx.core.util.forEach
import java.lang.ref.WeakReference

object Music {

    private var localMusicPlayer: LocalMusicPlayer? = null
    private var localMusicPlayerBg: LocalMusicPlayer? = null

    private val audios = mutableListOf<String>()

    private val mediaPlayers: SparseArray<MediaPlayer?> by lazy { SparseArray<MediaPlayer?>() }

    private lateinit var mContext: WeakReference<Context>

    fun init(context: Context) {
        mContext = WeakReference(context)
        mContext.get()?.apply {
            localMusicPlayer = LocalMusicPlayer(this, false)
            localMusicPlayerBg = LocalMusicPlayer(this, true)
        }
    }

    fun playAssetsAudios(names: List<String>?, listener: (() -> Unit)? = null) {

        mediaPlayers.forEach { _, mediaPlayer ->
            mediaPlayer?.isPlaying?.takeIf { it }.apply { mediaPlayer?.stop() }
            mediaPlayer?.release()
        }
        mediaPlayers.clear()

        names?.apply {
            audios.clear()
            audios.addAll(this)
            playAudios(listener)
        } ?: listener?.invoke()

    }

    private fun playAudios(listener: (() -> Unit)? = null) {
        if (audios.size > 0) {
            try {
                audios.forEachIndexed { index, audio ->
                    if (audio.isNotEmpty()) {
                        val mediaPlayer: MediaPlayer = MediaPlayer().also { mediaPlayers.put(index, it) }
                        val assetMg = mContext.get()?.assets
                        val fileDescriptor = assetMg?.openFd(audio)
                        mediaPlayer.setDataSource(fileDescriptor?.fileDescriptor,
                                fileDescriptor?.startOffset ?: 0, fileDescriptor?.length ?: 0)
                        mediaPlayer.prepareAsync()
                        if (index == 0) {
                            mediaPlayer.setOnPreparedListener {
                                it.start()
                            }
                        }
                        mediaPlayer.setOnCompletionListener {
                            if (index == audios.size - 1) {
                                listener?.invoke()
                            } else {
                                mediaPlayers[index + 1]?.start()
                                mediaPlayers.setValueAt(index , null)
                                it.release()
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                error("${e.message}")
            }
        }
    }

    fun playAssetsAudio(name: String?, listener: (() -> Unit)? = null) {
        try {
            stopMusic()
            if (name?.isNotEmpty() == true) {
                localMusicPlayer?.mOnCompletionListener = MediaPlayer.OnCompletionListener { listener?.invoke() }
                localMusicPlayer?.isLooping = false
                localMusicPlayer?.play(name)
            } else {
                listener?.invoke()
            }
        } catch (e: Exception) {
            error("$name error")
            listener?.invoke()
        }
    }

    fun stopMusic() {
        audios.clear()
        localMusicPlayer?.stop()

        mediaPlayers.forEach { _, mediaPlayer ->
            mediaPlayer?.isPlaying?.takeIf { it }?.apply { mediaPlayer.stop() }
            mediaPlayer?.release()
        }
        mediaPlayers.clear()
    }

    fun playAssetsBgMusic(name: String?) {
        try {
            stopBgMusic()
            name?.isNotEmpty()?.takeIf { it }?.apply { localMusicPlayerBg?.play(name) }
        } catch (e: Exception) {
            error("$name error")
        }
    }

    fun stopBgMusic() {
        localMusicPlayerBg?.stop()
    }

    fun destroy() {
        localMusicPlayer?.release()
        localMusicPlayerBg?.release()

        mediaPlayers.forEach { _, mediaPlayer ->
            mediaPlayer?.isPlaying?.takeIf { it }?.apply { mediaPlayer.stop() }
            mediaPlayer?.release()
        }

        mediaPlayers.clear()
    }

}

internal class LocalMusicPlayer(context: Context, looping: Boolean = false) {

    private var mContext: WeakReference<Context>? = null
    private var mp: MediaPlayer? = null

    var mOnPreparedListener: MediaPlayer.OnPreparedListener? = null
    var mOnErrorListener: MediaPlayer.OnErrorListener? = null
    var mOnCompletionListener: MediaPlayer.OnCompletionListener? = null
    var isLooping: Boolean = false
        set(value) {
            field = value
            mp?.isLooping = value
        }

    init {
        mContext = WeakReference(context)
        mp = MediaPlayer().apply {
            setOnCompletionListener {
                mOnCompletionListener?.onCompletion(it)
            }
            setOnErrorListener { mp, what, extra ->
                mOnErrorListener?.onError(mp, what, extra) ?: false
            }
        }
        isLooping = looping
    }

    @Throws(Exception::class)
    private fun setDataSource(dataSource: String) {
        if (dataSource.isNotEmpty()) {
            val assetMg = mContext?.get()?.assets
            val fileDescriptor = assetMg?.openFd(dataSource)
            mp?.setDataSource(fileDescriptor?.fileDescriptor,
                    fileDescriptor?.startOffset ?: 0, fileDescriptor?.length ?: 0)
        }
    }

    @Throws(Exception::class)
    fun play(ds: String) {
        stop()
        setDataSource(ds)
        mp?.prepareAsync()
        mp?.setOnPreparedListener {
            it.start()
            mOnPreparedListener?.onPrepared(it)
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