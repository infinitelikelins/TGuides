package com.bearya.data.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val migrations_6_12 = object : Migration(6, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion12(database)
    }

}

val migrations_7_12 = object : Migration(7, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion12(database)
    }

}

val migrations_8_12 = object : Migration(8, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion12(database)
    }

}

val migrations_9_12 = object : Migration(9, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion12(database)
    }

}

val migrations_10_12 = object : Migration(10, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        updateDatabaseToVersion12(database)
    }

}

val migrations_11_12 = object : Migration(11, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
       updateDatabaseToVersion12(database)
    }

}

private fun updateDatabaseToVersion12(database: SupportSQLiteDatabase) {

    database.execSQL("CREATE TEMPORARY TABLE Book2 AS SELECT count(lock) > 0 as lock FROM Book where lock = 1")

    database.execSQL("DELETE FROM Book")
    database.execSQL("DELETE FROM Chapter")

    database.execSQL("INSERT OR REPLACE INTO Book VALUES(1,'畅游中国(上)','book/畅游中国(上).webp',1,0)")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(2,'畅游中国(下)','book/畅游中国(下).webp',1,(SELECT lock FROM Book2 LIMIT 1))")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(3,'环游世界(上)','book/环游世界(上).webp',1,0)")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(4,'环游世界(下)','book/环游世界(下).webp',1,(SELECT lock FROM Book2 LIMIT 1))")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(5,'童话大冒险(上)','book/童话大冒险(上).webp',1,0)")
    database.execSQL("INSERT OR REPLACE INTO Book VALUES(6,'童话大冒险(下)','book/童话大冒险(下).webp',1,(SELECT lock FROM Book2 LIMIT 1))")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(1,'1.中国心脏——北京',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(2,'2.千年丝路——甘肃',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(3,'3.灵秀潇湘——湖南',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(4,'4.山城雾都——重庆',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(5,'5.冰雪世界——黑龙江',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(6,'6.魅力三秦——陕西',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(7,'7.八闽福地——福建',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(8,'8.世界屋脊——西藏',1,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(9,'9.天堂草原——内蒙古',1,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(10,'10.瓜果之乡——新疆',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(11,'11.华夏摇篮——山西',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(12,'12.海上明珠——台湾',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(13,'13.天涯海角——海南',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(14,'14.旖旎画卷——浙江',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(15,'15.荆楚之地——湖北',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(16,'16.圣贤之邦——山东',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(17,'17.江南水乡——江苏',2,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(18,'18.天府之国——四川',2,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(19,'1.英国之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(20,'2.俄罗斯之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(21,'3.埃及之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(22,'4.法国之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(23,'5.意大利之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(24,'6.德国之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(25,'7.泰国之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(26,'8.印度之旅',3,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(27,'9.西班牙之旅',3,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(28,'10.南非之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(29,'11.新加坡之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(30,'12.希腊之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(31,'13.澳大利亚之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(32,'14.新西兰之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(33,'15.美国之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(34,'16.加拿大之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(35,'17.墨西哥之旅',4,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(36,'18.巴西之旅',4,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(37,'1.帮小贝辨左右',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(38,'2.神奇的指令',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(39,'3.编程帮大忙',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(40,'4.我是小侦探',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(41,'5.走哪条路合适？',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(42,'6.奇幻寻宝',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(43,'7.宝箱里的秘密',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(44,'8.哪里出错了？',5,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(45,'9.解救美人鱼',5,1)")

    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(46,'10.不畏困难艰险',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(47,'11.紧急大救援',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(48,'12.垃圾大清理',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(49,'13.梦幻舞会',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(50,'14.走出黑暗森林',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(51,'15.让草原焕发生机',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(52,'16.给程序打补丁',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(53,'17.战胜疫情',6,1)")
    database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(54,'18.清除计算机病毒',6,1)")

}