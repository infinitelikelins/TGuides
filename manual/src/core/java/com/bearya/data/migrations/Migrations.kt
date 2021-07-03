package com.bearya.data.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val migrations_1_12 = object : Migration(1, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_2_12 = object : Migration(2, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_3_12 = object : Migration(3, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_4_12 = object : Migration(4, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_5_12 = object : Migration(5, 12) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_6_12 = object : Migration(6, 12) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }
}

val migrations_7_12 = object : Migration(7, 12) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }
}

val migrations_8_12 = object : Migration(8, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_9_12 = object : Migration(9, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_10_12 = object : Migration(10, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_11_12 = object : Migration(11, 12) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("DELETE FROM Book WHERE id > 6")
        database.execSQL("DELETE FROM Chapter")
    }

}

val migrations_12_13 = object : Migration(12, 13) {

    override fun migrate(database: SupportSQLiteDatabase) {

        database.execSQL("INSERT OR IGNORE INTO Book VALUES(1,'小班A1','book/小班A1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(2,'小班A2','book/小班A2.webp',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(3,'中班C1','book/中班C1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(4,'中班C2','book/中班C2.webp',1,1)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(5,'大班E1','book/大班E1.webp',1,0)")
        database.execSQL("INSERT OR IGNORE INTO Book VALUES(6,'大班E2','book/大班E2.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(7,'小课包(混龄)','book/小课包混.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(8,'小课包(小班)','book/小课包小.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(9,'小课包(中班)','book/小课包中.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(10,'小课包(大班)','book/小课包大.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(11,'小课包(幼小衔接)','book/小课包幼小衔接.webp',1,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(1,'你好！机器人小贝',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(2,'羊咩咩的新房间',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(3,'出发，图书馆',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(4,'转角的肉店',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(5,'好玩的游乐园',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(6,'动物园之旅',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(7,'遗失的金币',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(8,'神秘的回礼',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(9,'惊险的寻宝之路',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(10,'山间的道路',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(11,'我是道路工程师',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(12,'安全你我他',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(13,'地震后的修补',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(14,'全新的道路',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(15,'尽忠职守的镇长',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(16,'参观海洋博物馆',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(17,'寻找神仙金牌',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(18,'帮助懒惰小姐',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(19,'五花八门的电器行',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(20,'远在天边，近在眼前',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(21,'新旧道路的差别',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(22,'挖地洞的土拨鼠',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(23,'爱地球·净滩活动',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(24,'地洞内的惊喜',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(25,'道路的定期维护',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(26,'寻找环保小达人',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(27,'弯来弯去的路线图',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(28,'唐僧取经',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(29,'小贝玩桌游',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(30,'逃离大野狼',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(31,'军人体验营',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(32,'可怕的龙卷风',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(33,'寻找爱心小天使(中)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(34,'地铁路线蓝图',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(35,'参观邮局博物馆',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(36,'忙碌的大厨房',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(37,'健身之路',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(38,'古代金币的藏宝图',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(39,'7级大地震',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(40,'取经之路',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(41,'需要帮忙的贝妈妈',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(42,'四个路口，合而为一',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(43,'女王的后花园',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(44,'邮差小贝',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(45,'一日亲善大使',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(46,'寻找爱心小天使(大)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(47,'蜗牛先生的家',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(48,'健走比赛',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(49,'七步成诗',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(50,'规划小能手',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(51,'规定步数的距离',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(52,'财神爷来啰',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(53,'跳跳镇十周年庆',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(54,'迷路的小魔王',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(55,'1.小小邮递员(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(56,'2.郊外一日游(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(57,'3.寻找金币(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(58,'4.疯狂的外星人(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(59,'5.龙卷风来啦(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(60,'6.奇妙的迷宫花园(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(61,'7.登山之旅(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(62,'8.寻宝之旅(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(63,'9.参观消防局(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(64,'10.文明参观好宝宝(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(65,'11.保护环境人人有责(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(66,'12.误入蜗牛公园(混龄)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(67,'1.小小邮递员(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(68,'2.郊外一日游(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(69,'3.寻找金币(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(70,'4.疯狂的外星人(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(71,'5.龙卷风来啦(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(72,'6.奇妙的迷宫花园(小班)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(73,'1.小小邮递员(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(74,'2.郊外一日游(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(75,'3.寻找金币(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(76,'4.疯狂的外星人(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(77,'5.龙卷风来啦(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(78,'6.奇妙的迷宫花园(中班)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(79,'1.小小邮递员(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(80,'2.郊外一日游(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(81,'3.寻找金币(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(82,'4.疯狂的外星人(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(83,'5.龙卷风来啦(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(84,'6.奇妙的迷宫花园(大班)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(85,'1.我是小邮差(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(86,'2.高级道路工程师(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(87,'3.登山之旅(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(88,'4.误入迷宫花园(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(89,'5.奇幻寻宝(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(90,'6.小精灵的寻宝计划(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(91,'7.英雄无敌(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(92,'8.战胜黑暗使者(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(93,'9.梦幻舞会(幼小衔接)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(94,'10.创想天地(幼小衔接)',11,1)")

    }

}