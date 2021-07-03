package com.bearya.manual

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.startup.Initializer
import com.bearya.data.dao.BookDao
import com.bearya.data.dao.ChapterDao
import com.bearya.data.entity.Book
import com.bearya.data.entity.Chapter
import com.bearya.data.migrations.*

@Database(entities = [
    Book::class,
    Chapter::class
], version = 6, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookDao(): BookDao
    abstract fun chapterDao(): ChapterDao

    companion object {
        lateinit var instance: AppDatabase
    }

}

class DatabaseInitializer : Initializer<AppDatabase> {

    override fun create(context: Context): AppDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "manual.db")
        .createFromAsset("database/manual.db")
        .addMigrations(migrations_1_2, migrations_2_3, migrations_3_4, migrations_4_5, migrations_5_6)
        .build()

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

}