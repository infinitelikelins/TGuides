package com.bearya.data.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val migrations_1_9 = object : Migration(1, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_2_9 = object : Migration(2, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_3_9 = object : Migration(3, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_4_9 = object : Migration(4, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_5_9 = object : Migration(5, 9) {
    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_6_9 = object : Migration(6, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}


val migrations_7_9 = object : Migration(7, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

val migrations_8_9 = object : Migration(8, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion9(database)
    }

}

private fun updateDatabaseToVersion9(database: SupportSQLiteDatabase){

    database.execSQL("DELETE FROM Book")
    database.execSQL("DELETE FROM Chapter")

    database.execSQL("INSERT OR REPLACE INTO Book VALUES(1,'小班','book/小班.webp',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(2,'中班','book/中班.webp',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(3,'大班','book/大班.webp',1,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(1,'1.小贝，你好(小)',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(2,'2.小小道路工程师',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(3,'3.游玩跳跳镇(小)',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(4,'4.重建跳跳镇',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(5,'5.一起去游乐园玩(小)',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(6,'6.丢失的金币',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(7,'7.乐于助人好宝宝(小)',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(8,'8.解决问题小能手',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(9,'9.比比谁更快',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(10,'10.规划路线我最行',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(11,'11.哪条路更短',1,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(12,'先1.小贝，你好(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(13,'先2.游玩跳跳镇(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(14,'先3.乐于助人好宝宝(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(15,'先4.一起去游乐园玩(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(16,'1.敬业的公交车司机(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(17,'2.我是跳跳镇的好公民(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(18,'3.我会注意安全',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(19,'4.小贝的购物计划',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(20,'5.条条大路通罗马',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(21,'6.寻找秘密安全通道',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(22,'7.修建弯弯的山路',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(23,'8.小贝爱妈妈',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(24,'9.教练与玩家(中)',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(25,'10.创想天地(中)',2,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(26,'先1.小贝，你好(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(27,'先2.游玩跳跳镇(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(28,'先3.一起去游乐园玩(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(29,'先4.敬业的公交车司机(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(30,'先5.我是跳跳镇的好公民(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(31,'1.寻找丢失的宝石',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(32,'2.前往秘密森林',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(33,'3.奇幻寻宝',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(34,'4.小精灵的寻宝计划',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(35,'5.英雄无敌',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(36,'6.不畏艰险',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(37,'7.火山爆发',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(38,'8.医治国王',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(39,'9.梦幻舞会',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(40,'10.封锁黑暗使者',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(41,'11.魔法塔的威力',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(42,'12.教练与玩家(大)',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(43,'13.创想天地(大)',3,1)")
}