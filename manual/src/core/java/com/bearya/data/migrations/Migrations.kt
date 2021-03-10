package com.bearya.data.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val migrations_1_2 = object : Migration(1, 2) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DROP TABLE Book")
        database.execSQL("DROP TABLE Chapter")
    }

}

val migrations_2_3 = object : Migration(2, 3) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE IF NOT EXISTS `Book` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `cover` TEXT, `enable` INTEGER, `lock` INTEGER)")
        database.execSQL("CREATE TABLE IF NOT EXISTS `Chapter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `bookId` INTEGER , `enable` INTEGER)")
    }

}

val migrations_3_4 = object : Migration(3, 4) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(1,'小班A1','book/小班A1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(2,'小班A2','book/小班A2.webp',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(3,'中班C1','book/中班C1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(4,'中班C2','book/中班C2.webp',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(5,'大班E1','book/大班E1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(6,'大班E2','book/大班E2.webp',1,1)")
    }

}

val migrations_4_5 = object : Migration(4, 5) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(1,'你好！机器人小贝',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(2,'羊咩咩的新房间',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(3,'出发，图书馆',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(4,'转角的肉店',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(5,'好玩的游乐园',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(6,'动物园之旅',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(7,'遗失的金币',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(8,'神秘的回礼',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(9,'惊险的寻宝之路',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(10,'山间的道路',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(11,'我是道路工程师',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(12,'安全你我他',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(13,'地震后的修补',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(14,'全新的道路',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(15,'尽忠职守的镇长',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(16,'参观海洋博物馆',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(17,'寻找神仙金牌',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(18,'帮助懒惰小姐',2,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(19,'五花八门的电器行',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(20,'远在天边，近在眼前',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(21,'新旧道路的差别',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(22,'挖地洞的土拨鼠',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(23,'爱地球·净滩活动',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(24,'地洞内的惊喜',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(25,'道路的定期维护',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(26,'寻找环保小达人',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(27,'弯来弯去的路线图',3,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(28,'唐僧取经',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(29,'小贝玩桌游',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(30,'逃离大野狼',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(31,'军人体验营',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(32,'可怕的龙卷风',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(33,'寻找爱心小天使(中)',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(34,'地铁路线蓝图',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(35,'参观邮局博物馆',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(36,'忙碌的大厨房',4,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(37,'健身之路',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(38,'古代金币的藏宝图',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(39,'7级大地震',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(40,'取经之路',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(41,'需要帮忙的贝妈妈',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(42,'四个路口，合而为一',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(43,'女王的后花园',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(44,'邮差小贝',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(45,'一日亲善大使',5,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(46,'寻找爱心小天使(大)',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(47,'蜗牛先生的家',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(48,'健走比赛',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(49,'七步成诗',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(50,'规划小能手',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(51,'十步内的距离',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(52,'财神爷来啰',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(53,'跳跳镇十周年庆',6,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(54,'迷路的小魔王',6,1)")
    }

}

val migrations_5_6 = object : Migration(5, 6) {
    override fun migrate(database: SupportSQLiteDatabase) {

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(7,'暑期课','',0,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(8,'幼小衔接课','',0,1)")

        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(55,'小小邮递员',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(56,'郊外一日游',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(57,'寻找金币',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(58,'疯狂的外星人',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(59,'龙卷风来啦',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(60,'奇妙的迷宫花园',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(61,'登山之旅',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(62,'寻宝之旅',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(63,'参观消防局',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(64,'文明参观好宝宝',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(65,'保护环境人人有责',7,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(66,'误入蜗牛公园',7,1)")

        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(67,'我是小邮差',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(68,'高级道路工程师',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(69,'登山之旅',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(70,'误入迷宫花园',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(71,'奇幻寻宝',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(72,'小精灵的寻宝计划',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(73,'英雄无敌',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(74,'战胜黑暗使者',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(75,'梦幻舞会',8,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(76,'创想天地',8,1)")
    }

}

val migrations_6_7 = object : Migration(6, 7) {
    override fun migrate(database: SupportSQLiteDatabase) {

    }
}

val migrations_7_8 = object : Migration(7, 8) {
    override fun migrate(database: SupportSQLiteDatabase) {

    }
}

val migrations_8_9 = object : Migration(8, 9) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(13,'小团课','book/小团课.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(113,'1.小小邮递员',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(114,'2.郊外一日游',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(115,'3.寻找金币',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(116,'4.疯狂的外星人',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(117,'5.龙卷风来啦',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(118,'6.奇妙的迷宫花园',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(119,'7.登山之旅',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(120,'8.寻宝之旅',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(121,'9.参观消防局',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(122,'10.文明参观好宝宝',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(123,'11.保护环境人人有责',13,1)")
        database.execSQL("INSERT OR IGNORE INTO Chapter VALUES(124,'12.误入蜗牛公园',13,1)")
    }

}

val migrations_9_10 = object : Migration(9, 10) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("update Book set name=\"畅游中国(上)\", cover=\"book/畅游中国(上).webp\" where name=\"中国之旅上\"")
        database.execSQL("update Book set name=\"畅游中国(下)\", cover=\"book/畅游中国(下).webp\" where name=\"中国之旅下\"")
        database.execSQL("update Book set name=\"环游世界(上)\", cover=\"book/环游世界(上).webp\" where name=\"世界之旅上\"")
        database.execSQL("update Book set name=\"环游世界(下)\", cover=\"book/环游世界(下).webp\" where name=\"世界之旅下\"")
    }

}