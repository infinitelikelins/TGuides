package com.bearya.data.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.bearya.data.entity.Book

@Dao
interface BookDao {

    @Query("SELECT * FROM Book WHERE `enable` = 1")
    fun findBookByAll(): PagingSource<Int, Book>

    @Query("UPDATE Book SET `lock` = 0 WHERE `lock` = 1")
    suspend fun releaseBooksLocks(): Int

}