package com.bearya.data.repository

import com.bearya.data.dao.BookDao
import com.bearya.manual.AppDatabase

class BookRepository {

    private val bookDao: BookDao = AppDatabase.instance.bookDao()

    fun findBookByAll() = bookDao.findBookByAll()

    suspend fun releaseBooks() = bookDao.releaseBooksLocks()

}