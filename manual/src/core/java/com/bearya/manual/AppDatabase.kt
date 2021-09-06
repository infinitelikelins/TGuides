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
import com.tencent.mmkv.MMKV

@Database(
    entities = [
        Book::class,
        Chapter::class
    ], version = 15, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookDao(): BookDao
    abstract fun chapterDao(): ChapterDao

    companion object {
        lateinit var instance: AppDatabase
    }

}

class DatabaseInitializer : Initializer<AppDatabase> {

    override fun create(context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "manual.db")
            .createFromAsset("database/manual.db")
            .addMigrations(migrations_1_13, migrations_2_13, migrations_3_13, migrations_4_13, migrations_5_13)
            .addMigrations(migrations_6_13, migrations_7_13, migrations_8_13, migrations_9_13, migrations_10_13)
            .addMigrations(migrations_11_13, migrations_12_13, migrations_13_14, migrations_14_15)
            .build()

    override fun dependencies(): MutableList<Class<out Initializer<*>>> =
        mutableListOf(MMKVInitializer::class.java)

}

class MMKVInitializer : Initializer<String> {

    override fun create(context: Context): String = MMKV.initialize(context)

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

}