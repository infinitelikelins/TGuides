package com.bearya.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

// 章节
@Entity
data class Chapter(@PrimaryKey(autoGenerate = true) val id: Int? = 0,
                   val name: String?, // 单元名称
                   val bookId: Int?, // 关联的手册
                   val enable: Boolean?// 启用状态
)