package library.ext

import android.os.Looper
import androidx.lifecycle.MutableLiveData

/**
 * 线程分配设置数据到LiveData
 */
fun <T> MutableLiveData<T>.setData(data: T?) =
        if (Looper.getMainLooper().thread == Thread.currentThread()) {
            setValue(data)
        } else {
            postValue(data)
        }