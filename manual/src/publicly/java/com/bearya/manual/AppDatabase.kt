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
], version = 9, exportSchema = false)
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
                .addMigrations(migrations_1_9, migrations_2_9, migrations_3_9, migrations_4_9)
                .addMigrations(migrations_5_9, migrations_6_9, migrations_7_9, migrations_8_9)
                .build()

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

}