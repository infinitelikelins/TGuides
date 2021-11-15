package com.bearya.data.repository

import com.bearya.data.dao.BookDao
import com.bearya.manual.AppDatabase
import com.tencent.mmkv.MMKV
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import library.ext.buildPagerLiveData

class BookRepository {

    private val bookDao: BookDao = AppDatabase.instance.bookDao()

    fun findBookByAll(scope: CoroutineScope) = buildPagerLiveData(scope) { bookDao.findBookByAll() }

    fun releaseBooks(scope: CoroutineScope) {
        scope.launch {
            bookDao.releaseBooksLocks()
            MMKV.defaultMMKV().encode("lockStatus", false)
        }
    }

}