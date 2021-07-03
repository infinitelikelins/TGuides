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
        database.execSQL("CREATE TABLE IF NOT EXISTS `Book` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `cover` TEXT, `enable` INTEGER, `lock` INTEGER);")
        database.execSQL("CREATE TABLE IF NOT EXISTS `Chapter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `bookId` INTEGER , `enable` INTEGER);")
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

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(1,'小班A1','book/小班A1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(2,'小班A2','book/小班A2.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(3,'中班C1','book/中班C1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(4,'中班C2','book/中班C2.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(5,'大班E1','book/大班E1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(6,'大班E2','book/大班E2.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(7,'暑期课','',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(8,'幼小衔接课','',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(9,'小班','book/小班.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(10,'中班','book/中班.webp',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(11,'大班','book/大班.webp',1,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(77,'先1.小贝，你好(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(78,'先2.游玩跳跳镇(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(79,'先3.乐于助人好宝宝(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(80,'先4.一起去游乐园玩(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(81,'1.敬业的公交车司机(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(82,'2.我是跳跳镇的好公民(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(83,'3.我会注意安全',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(84,'4.小贝的购物计划',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(85,'5.条条大路通罗马',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(86,'6.寻找秘密安全通道',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(87,'7.修建弯弯的山路',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(88,'8.小贝爱妈妈',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(89,'9.教练与玩家(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(90,'10.创想天地(中)',10,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(91,'先1.小贝，你好(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(92,'先2.游玩跳跳镇(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(93,'先3.一起去游乐园玩(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(94,'先4.敬业的公交车司机(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(95,'先5.我是跳跳镇的好公民(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(96,'1.寻找丢失的宝石',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(97,'2.前往秘密森林',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(98,'3.奇幻寻宝',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(99,'4.小精灵的寻宝计划',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(100,'5.英雄无敌',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(101,'6.不畏艰险',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(102,'7.可怕的火山',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(103,'8.医治国王',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(104,'9.梦幻舞会',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(105,'10.封锁黑暗使者',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(106,'11.魔法塔的威力',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(107,'12.教练与玩家(大)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(108,'13.创想天地(大)',11,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(109,'1.小贝，你好(小)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(110,'2.小小道路工程师',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(111,'3.游玩跳跳镇(小)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(112,'4.重建跳跳镇',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(113,'5.一起去游乐园玩(小)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(114,'6.丢失的金币',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(115,'7.乐于助人好宝宝(小)',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(116,'8.解决问题小能手',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(117,'9.比比谁更快',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(118,'10.规划路线我最行',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(119,'11.哪条路更短',9,1)")

    }

}


val migrations_7_8 = object : Migration(7, 8) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("UPDATE Chapter SET name = \"7.火山爆发\" WHERE id=102")
    }

}