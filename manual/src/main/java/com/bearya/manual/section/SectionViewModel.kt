package com.bearya.manual.section

import android.app.Application
import androidx.lifecycle.*
import library.ext.setData

class SectionViewModel(app: Application) : AndroidViewModel(app) {

    val sectionDirPath: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    val sectionDirFile: LiveData<List<String>> = liveData {
        emitSource(sectionDirPath.map {
            try {
                app.applicationContext.assets.list(it)?.sortedBy { fileName ->
                    fileName.substringBefore(".").toInt()
                }?.map { fileName ->
                    "${it}/${fileName}"
                } ?: emptyList<String>()
            } catch (ex: Exception) {
                emptyList<String>()
            }
        })
    }

    val playIndex: MutableLiveData<Int> by lazy { MutableLiveData<Int>().apply { setData(0) } }

}