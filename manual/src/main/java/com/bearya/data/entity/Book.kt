package com.bearya.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// 手册
@Entity
data class Book(@PrimaryKey(autoGenerate = true) @ColumnInfo val id: Int? = 0,
                val name: String?,
                val cover: String?,
                val enable: Boolean?,// 启用状态
                val lock: Boolean? // 锁定状态
)

