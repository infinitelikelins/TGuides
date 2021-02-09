package com.bearya.manual.chapter

import androidx.lifecycle.*
import androidx.paging.PagingData
import com.bearya.data.entity.Chapter
import com.bearya.data.repository.ChapterRepository
import library.ext.buildPagerLiveData

class ChapterViewModel : ViewModel() {

    private val chapterRepository: ChapterRepository by lazy { ChapterRepository() }

    val bookId: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }

    val chapters: LiveData<PagingData<Chapter>> = bookId.switchMap {
        buildPagerLiveData(viewModelScope) { chapterRepository.findAllChaptersById(it) }
    }

}