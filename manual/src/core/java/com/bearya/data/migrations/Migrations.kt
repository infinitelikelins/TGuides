package com.bearya.data.migrations

import android.annotation.SuppressLint
import android.content.ContentValues
import androidx.room.OnConflictStrategy
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.tencent.mmkv.MMKV

val migrations_1_13 = object : Migration(1, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_2_13 = object : Migration(2, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_3_13 = object : Migration(3, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_4_13 = object : Migration(4, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_5_13 = object : Migration(5, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_6_13 = object : Migration(6, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_7_13 = object : Migration(7, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_8_13 = object : Migration(8, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_9_13 = object : Migration(9, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_10_13 = object : Migration(10, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_11_13 = object : Migration(11, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_12_13 = object : Migration(12, 13) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

val migrations_13_14 = object : Migration(13, 14) {
    override fun migrate(database: SupportSQLiteDatabase) {
        migrationTo14(database)
    }
}

@SuppressLint("Range")
private fun migrationTo14(database: SupportSQLiteDatabase) {
    // 迁移之前的版本的锁定状态写入配置文件
    database.query("SELECT count(lock) AS lockStatus FROM Book WHERE lock = 1").run {
        moveToFirst()
        MMKV.defaultMMKV().encode("lockStatus", getInt(getColumnIndex("lockStatus")) > 0)
    }
    // 然后再清空表
    database.execSQL("DELETE FROM Book")
    database.execSQL("DELETE FROM Chapter")
}

val migrations_14_15 = object : Migration(14, 15) {
    override fun migrate(database: SupportSQLiteDatabase) {
        //  1 锁定 , 0 解锁
        val lockStatus = if (MMKV.defaultMMKV().decodeBool("lockStatus", true)) 1 else 0

        // 库重建
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(1,'幼儿一级(上)A','book/幼儿一级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(2,'幼儿一级(上)B','book/幼儿一级上B.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(3,'幼儿二级(上)A','book/幼儿二级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(4,'幼儿二级(上)B','book/幼儿二级上B.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(5,'幼儿三级(上)A','book/幼儿三级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(6,'幼儿三级(上)B','book/幼儿三级上B.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(7,'A1系列','book/小班A1.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(8,'A2系列','book/小班A2.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(9,'C1系列','book/中班C1.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(10,'C2系列','book/中班C2.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(11,'E1系列','book/大班E1.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(12,'E2系列','book/大班E2.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(13,'小课包(混龄)','book/小课包混.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(14,'小课包(小班)','book/小课包小.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(15,'小课包(中班)','book/小课包中.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(16,'小课包(大班)','book/小课包大.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(17,'小课包(幼小衔接)','book/小课包幼小衔接.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(1,'1.你好！机器人小贝(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(2,'2.哆哆虎的烦恼(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(3,'3.摘水果比赛(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(4,'4.花园大迷宫(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(5,'5.我是道路工程师(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(6,'6.模块失踪之谜(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(7,'7.金币逃跑啦(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(8,'8.森林音乐会(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(9,'9.走了多少步(幼儿一级上A)',1,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(10,'10.帮助爱心小天使(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(11,'11.寻找兔呵呵(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(12,'12.爱心好宝宝(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(13,'13.地洞探宝(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(14,'14.合格的邮递员(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(15,'15.文明小标兵(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(16,'16.小贝的心愿(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(17,'17.爱收藏的小松鼠(幼儿一级上B)',2,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(18,'18.美丽的叶子(幼儿一级上B)',2,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(19,'1.中国心脏——北京(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(20,'2.千年丝路——甘肃(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(21,'3.灵秀潇湘——湖南(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(22,'4.山城雾都——重庆(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(23,'5.冰雪世界——黑龙江(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(24,'6.魅力三秦——陕西(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(25,'7.八闽福地——福建(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(26,'8.世界屋脊——西藏(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(27,'9.天堂草原——内蒙古(幼儿二级上A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(28,'10.瓜果之乡——新疆(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(29,'11.华夏摇篮——山西(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(30,'12.海上明珠——台湾(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(31,'13.天涯海角——海南(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(32,'14.旖旎画卷——浙江(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(33,'15.荆楚之地——湖北(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(34,'16.圣贤之邦——山东(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(35,'17.江南水乡——江苏(幼儿二级上B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(36,'18.天府之国——四川(幼儿二级上B)',4,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(37,'1.帮小贝辨左右(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(38,'2.神奇的指令(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(39,'3.编程帮大忙(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(40,'4.我是小侦探(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(41,'5.走哪条路合适？(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(42,'6.奇幻寻宝(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(43,'7.宝箱里的秘密(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(44,'8.哪里出错了？(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(45,'9.解救美人鱼(幼儿三级上A)',5,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(46,'10.不畏困难艰险(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(47,'11.紧急大救援(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(48,'12.垃圾大清理(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(49,'13.梦幻舞会(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(50,'14.走出黑暗森林(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(51,'15.让草原焕发生机(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(52,'16.给程序打补丁(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(53,'17.战胜疫情(幼儿三级上B)',6,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(54,'18.清除计算机病毒(幼儿三级上B)',6,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(55,'你好！机器人小贝',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(56,'羊咩咩的新房间',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(57,'出发，图书馆',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(58,'转角的肉店',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(59,'好玩的游乐园',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(60,'动物园之旅',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(61,'遗失的金币',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(62,'神秘的回礼',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(63,'惊险的寻宝之路',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(64,'山间的道路',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(65,'我是道路工程师',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(66,'安全你我他',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(67,'地震后的修补',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(68,'全新的道路',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(69,'尽忠职守的镇长',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(70,'参观海洋博物馆',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(71,'寻找神仙金牌',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(72,'帮助懒惰小姐',8,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(73,'五花八门的电器行',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(74,'远在天边，近在眼前',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(75,'新旧道路的差别',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(76,'挖地洞的土拨鼠',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(77,'爱地球·净滩活动',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(78,'地洞内的惊喜',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(79,'道路的定期维护',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(80,'寻找环保小达人',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(81,'弯来弯去的路线图',9,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(82,'唐僧取经',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(83,'小贝玩桌游',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(84,'逃离大野狼',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(85,'军人体验营',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(86,'可怕的龙卷风',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(87,'寻找爱心小天使(中)',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(88,'地铁路线蓝图',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(89,'参观邮局博物馆',10,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(90,'忙碌的大厨房',10,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(91,'健身之路',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(92,'古代金币的藏宝图',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(93,'7级大地震',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(94,'取经之路',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(95,'需要帮忙的贝妈妈',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(96,'四个路口，合而为一',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(97,'女王的后花园',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(98,'邮差小贝',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(99,'一日亲善大使',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(100,'寻找爱心小天使(大)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(101,'蜗牛先生的家',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(102,'健走比赛',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(103,'七步成诗',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(104,'规划小能手',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(105,'规定步数的距离',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(106,'财神爷来啰',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(107,'跳跳镇十周年庆',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(108,'迷路的小魔王',12,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(109,'1.小小邮递员(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(110,'2.郊外一日游(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(111,'3.寻找金币(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(112,'4.疯狂的外星人(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(113,'5.龙卷风来啦(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(114,'6.奇妙的迷宫花园(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(115,'7.登山之旅(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(116,'8.寻宝之旅(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(117,'9.参观消防局(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(118,'10.文明参观好宝宝(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(119,'11.保护环境人人有责(混龄)',13,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(120,'12.误入蜗牛公园(混龄)',13,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(121,'1.小小邮递员(小班)',14,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(122,'2.郊外一日游(小班)',14,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(123,'3.寻找金币(小班)',14,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(124,'4.疯狂的外星人(小班)',14,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(125,'5.龙卷风来啦(小班)',14,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(126,'6.奇妙的迷宫花园(小班)',14,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(127,'1.小小邮递员(中班)',15,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(128,'2.郊外一日游(中班)',15,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(129,'3.寻找金币(中班)',15,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(130,'4.疯狂的外星人(中班)',15,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(131,'5.龙卷风来啦(中班)',15,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(132,'6.奇妙的迷宫花园(中班)',15,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(133,'1.小小邮递员(大班)',16,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(134,'2.郊外一日游(大班)',16,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(135,'3.寻找金币(大班)',16,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(136,'4.疯狂的外星人(大班)',16,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(137,'5.龙卷风来啦(大班)',16,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(138,'6.奇妙的迷宫花园(大班)',16,1)")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(139,'1.我是小邮差(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(140,'2.高级道路工程师(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(141,'3.登山之旅(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(142,'4.误入迷宫花园(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(143,'5.奇幻寻宝(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(144,'6.小精灵的寻宝计划(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(145,'7.英雄无敌(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(146,'8.战胜黑暗使者(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(147,'9.梦幻舞会(幼小衔接)',17,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(148,'10.创想天地(幼小衔接)',17,1)")

    }
}


val migrations_15_16 = object : Migration(15, 16) {
    override fun migrate(database: SupportSQLiteDatabase) {
        //  1 锁定 , 0 解锁
        val lockStatus = if (MMKV.defaultMMKV().decodeBool("lockStatus", true)) 1 else 0

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(1,'幼儿一级(上)A','book/幼儿一级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(2,'幼儿一级(上)B','book/幼儿一级上B.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(3,'幼儿一级(下)A','book/幼儿一级下A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(4,'幼儿一级(下)B','book/幼儿一级下B.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(5,'幼儿二级(上)A','book/幼儿二级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(6,'幼儿二级(上)B','book/幼儿二级上B.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(7,'幼儿二级(下)A','book/幼儿二级下A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(8,'幼儿二级(下)B','book/幼儿二级下B.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(9,'幼儿三级(上)A','book/幼儿三级上A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(10,'幼儿三级(上)B','book/幼儿三级上B.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(11,'幼儿三级(下)A','book/幼儿三级下A.webp',1,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(12,'幼儿三级(下)B','book/幼儿三级下B.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(13,'小课包(混龄)','book/小课包混.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(14,'小课包(小班)','book/小课包小.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(15,'小课包(中班)','book/小课包中.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(16,'小课包(大班)','book/小课包大.webp',1,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(17,'小课包(幼小衔接)','book/小课包幼小衔接.webp',1,$lockStatus)")

        database.execSQL("INSERT OR REPLACE INTO Book VALUES(18,'A1系列','book/小班A1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(19,'A2系列','book/小班A2.webp',0,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(20,'C1系列','book/中班C1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(21,'C2系列','book/中班C2.webp',0,$lockStatus)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(22,'E1系列','book/大班E1.webp',0,0)")
        database.execSQL("INSERT OR REPLACE INTO Book VALUES(23,'E2系列','book/大班E2.webp',0,$lockStatus)")

        database.execSQL("UPDATE Chapter SET bookId = 23 WHERE bookId = 12")
        database.execSQL("UPDATE Chapter SET bookId = 22 WHERE bookId = 11")
        database.execSQL("UPDATE Chapter SET bookId = 21 WHERE bookId = 10")
        database.execSQL("UPDATE Chapter SET bookId = 20 WHERE bookId = 9")
        database.execSQL("UPDATE Chapter SET bookId = 19 WHERE bookId = 8")
        database.execSQL("UPDATE Chapter SET bookId = 18 WHERE bookId = 7")
        database.execSQL("UPDATE Chapter SET bookId = 10 WHERE bookId = 6")
        database.execSQL("UPDATE Chapter SET bookId = 9 WHERE bookId = 5")
        database.execSQL("UPDATE Chapter SET bookId = 6 WHERE bookId = 4")
        database.execSQL("UPDATE Chapter SET bookId = 5 WHERE bookId = 3")

        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(149,'1.糖果小镇旅行记(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(150,'2.跳跳镇运动会(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(151,'3.嘻皮猴蛀牙了(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(152,'4.神秘的客人(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(153,'5.找彩虹(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(154,'6.环保小达人(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(155,'7.厉害的大喷嚏(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(156,'8.热心帮帮团(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(157,'9.暴风雨过后(幼儿一级下A)',3,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(158,'10.谁的羽毛？(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(159,'11.地铁路线图(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(160,'12.十步内的距离(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(161,'13.安全小卫士(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(162,'14.生日庆祝会(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(163,'15.寻找红气球(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(164,'16.草丛里的星星(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(165,'17.小乌龟找水源(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(166,'18.一起玩捉迷藏(幼儿一级下B)',4,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(167,'1.英国之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(168,'2.俄罗斯之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(169,'3.埃及之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(170,'4.法国之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(171,'5.意大利之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(172,'6.德国之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(173,'7.泰国之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(174,'8.印度之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(175,'9.西班牙之旅(幼儿二级下A)',7,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(176,'10.南非之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(177,'11.新加坡之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(178,'12.希腊之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(179,'13.澳大利亚之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(180,'14.新西兰之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(181,'15.美国之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(182,'16.加拿大之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(183,'17.墨西哥之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(184,'18.巴西之旅(幼儿二级下B)',8,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(185,'1.一封求救信(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(186,'2.独闯荆棘林(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(187,'3.神秘岛探险(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(188,'4.拯救原始部落(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(189,'5.穿越极限之地(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(190,'6.寻找失踪的装备(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(191,'7.对抗巨龙(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(192,'8.对称乐园奇遇记(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(193,'9.神秘的旋转王国(幼儿三级下A)',11,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(194,'10.突现大飞龙(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(195,'11.小贝大变身(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(196,'12.迷宫转转转(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(197,'13.寻找蓝色药水(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(198,'14.决战喷嚏龙(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(199,'15.好饿的小蛇(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(200,'16.变色龙的奇妙之旅(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(201,'17.小壁虎的烦恼(幼儿三级下B)',12,1)")
        database.execSQL("INSERT OR REPLACE INTO Chapter VALUES(202,'18.这是苹果吗？(幼儿三级下B)',12,1)")

    }
}

val migrations_16_17 = object : Migration(16, 17) {

    override fun migrate(database: SupportSQLiteDatabase) {
        database.update("Chapter", OnConflictStrategy.REPLACE, ContentValues().apply {
            put("name", "12.东南明珠——台湾(幼儿二级上B)")
        }, "id=?", arrayOf("30"))
    }

}