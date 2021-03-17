package com.bearya.data.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val migrations_6_9 = object : Migration(6, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {

    }

}


val migrations_7_9 = object : Migration(7, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {

    }

}

val migrations_8_9 = object : Migration(8, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {

    }

}

val migrations_9_10 = object : Migration(9, 10) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("UPDATE Book SET name=\"畅游中国(上)\", cover=\"book/畅游中国(上).webp\" WHERE name=\"中国之旅(上)\"")
        database.execSQL("UPDATE Book SET name=\"畅游中国(下)\", cover=\"book/畅游中国(下).webp\" WHERE name=\"中国之旅(下)\"")
        database.execSQL("UPDATE Book SET name=\"环游世界(上)\", cover=\"book/环游世界(上).webp\" WHERE name=\"世界之旅(上)\"")
        database.execSQL("UPDATE Book SET name=\"环游世界(下)\", cover=\"book/环游世界(下).webp\" WHERE name=\"世界之旅(下)\"")
    }

}

val migrations_10_11 = object : Migration(10, 11) {

    override fun migrate(database: SupportSQLiteDatabase) {

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(14,'童话大冒险(上)','book/童话大冒险(上).webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(125,'1.帮小贝辨左右',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(126,'2.神奇的指令',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(127,'3.编程帮大忙',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(128,'4.我是小侦探',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(129,'5.走哪条路合适？',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(130,'6.奇幻寻宝',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(131,'7.宝箱里的秘密',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(132,'8.哪里出错了？',14,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(133,'9.解救美人鱼',14,1)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(15,'童话大冒险(下)','book/童话大冒险(下).webp',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(134,'10.不畏困难艰险',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(135,'11.紧急大救援',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(136,'12.垃圾大清理',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(137,'13.梦幻舞会',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(138,'14.走出黑暗森林',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(139,'15.让草原焕发生机',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(140,'16.给程序打补丁',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(141,'17.战胜疫情',15,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(142,'18.清除计算机病毒',15,1);")

    }

}