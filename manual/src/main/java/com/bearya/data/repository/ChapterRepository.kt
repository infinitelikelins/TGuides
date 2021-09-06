package com.bearya.data.repository

import com.bearya.data.dao.ChapterDao
import com.bearya.manual.AppDatabase

class ChapterRepository {
    private val chapterDao: ChapterDao = AppDatabase.instance.chapterDao()
    fun findAllChaptersById(bookId: Int = 0) = chapterDao.findChaptersByBookId(bookId)
}