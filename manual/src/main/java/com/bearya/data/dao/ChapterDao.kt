package com.bearya.data.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.bearya.data.entity.Chapter

@Dao
interface ChapterDao {

    @Query("SELECT * FROM Chapter WHERE `enable` = 1 AND `bookId`= :bookId")
    fun findChaptersByBookId(bookId: Int): PagingSource<Int, Chapter>

}