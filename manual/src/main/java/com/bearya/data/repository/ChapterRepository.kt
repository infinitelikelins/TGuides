package com.bearya.data.repository

import com.bearya.data.dao.ChapterDao
import com.bearya.manual.AppDatabase
import kotlinx.coroutines.CoroutineScope
import library.ext.buildPagerLiveData

class ChapterRepository {
    private val chapterDao: ChapterDao = AppDatabase.instance.chapterDao()

    fun findAllChaptersById(scope: CoroutineScope, bookId: Int = 0) =
        buildPagerLiveData(scope) { chapterDao.findChaptersByBookId(bookId) }
}