
CREATE TABLE IF NOT EXISTS Chapter (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `bookId` INTEGER , `enable` INTEGER, `lock` INTEGER);

INSERT INTO Chapter VALUES(1,'你好！机器人小贝',1,1,0);
INSERT INTO Chapter VALUES(2,'羊咩咩的新房间',1,1,0);
INSERT INTO Chapter VALUES(3,'出发，图书馆',1,1,0);
INSERT INTO Chapter VALUES(4,'转角的肉店',1,1,1);
INSERT INTO Chapter VALUES(5,'好玩的游乐园',1,1,1);
INSERT INTO Chapter VALUES(6,'动物园之旅',1,1,1);
INSERT INTO Chapter VALUES(7,'遗失的金币',1,1,1);
INSERT INTO Chapter VALUES(8,'神秘的回礼',1,1,1);
INSERT INTO Chapter VALUES(9,'惊险的寻宝之路',1,1,1);
INSERT INTO Chapter VALUES(10,'山间的道路',1,1,1);
INSERT INTO Chapter VALUES(11,'我是道路工程师',1,1,1);
INSERT INTO Chapter VALUES(12,'安全你我他',1,1,1);
INSERT INTO Chapter VALUES(13,'地震后的修补',1,1,1);
INSERT INTO Chapter VALUES(14,'全新的道路',1,1,1);
INSERT INTO Chapter VALUES(15,'尽忠职守的镇长',1,1,1);
INSERT INTO Chapter VALUES(16,'参观海洋博物馆',1,1,1);
INSERT INTO Chapter VALUES(17,'寻找神仙金牌',1,1,1);
INSERT INTO Chapter VALUES(18,'帮助懒惰小姐',1,1,1);
INSERT INTO Chapter VALUES(19,'五花八门的电器行',2,1,0);
INSERT INTO Chapter VALUES(20,'远在天边，近在眼前',2,1,0);
INSERT INTO Chapter VALUES(21,'新旧道路的差别',2,1,0);
INSERT INTO Chapter VALUES(22,'挖地洞的土拨鼠',2,1,1);
INSERT INTO Chapter VALUES(23,'爱地球·净滩活动',2,1,1);
INSERT INTO Chapter VALUES(24,'地洞内的惊喜',2,1,1);
INSERT INTO Chapter VALUES(25,'道路的定期维护',2,1,1);
INSERT INTO Chapter VALUES(26,'寻找环保小达人',2,1,1);
INSERT INTO Chapter VALUES(27,'弯来弯去的路线图',2,1,1);
INSERT INTO Chapter VALUES(28,'唐僧取经',2,1,1);
INSERT INTO Chapter VALUES(29,'小贝玩桌游',2,1,1);
INSERT INTO Chapter VALUES(30,'逃离大野狼',2,1,1);
INSERT INTO Chapter VALUES(31,'军人体验营',2,1,1);
INSERT INTO Chapter VALUES(32,'可怕的龙卷风',2,1,1);
INSERT INTO Chapter VALUES(33,'寻找爱心小天使(中)',2,1,1);
INSERT INTO Chapter VALUES(34,'地铁路线蓝图',2,1,1);
INSERT INTO Chapter VALUES(35,'参观邮局博物馆',2,1,1);
INSERT INTO Chapter VALUES(36,'忙碌的大厨房',2,1,1);
INSERT INTO Chapter VALUES(37,'健身之路',3,1,0);
INSERT INTO Chapter VALUES(38,'古代金币的藏宝图',3,1,0);
INSERT INTO Chapter VALUES(39,'7级大地震',3,1,0);
INSERT INTO Chapter VALUES(40,'取经之路',3,1,1);
INSERT INTO Chapter VALUES(41,'需要帮忙的贝妈妈',3,1,1);
INSERT INTO Chapter VALUES(42,'四个路口，合而为一',3,1,1);
INSERT INTO Chapter VALUES(43,'女王的后花园',3,1,1);
INSERT INTO Chapter VALUES(44,'邮差小贝',3,1,1);
INSERT INTO Chapter VALUES(45,'一日亲善大使',3,1,1);
INSERT INTO Chapter VALUES(46,'寻找爱心小天使(大)',3,1,1);
INSERT INTO Chapter VALUES(47,'蜗牛先生的家',3,1,1);
INSERT INTO Chapter VALUES(48,'健走比赛',3,1,1);
INSERT INTO Chapter VALUES(49,'七步成诗',3,1,1);
INSERT INTO Chapter VALUES(50,'规划小能手',3,1,1);
INSERT INTO Chapter VALUES(51,'十步内的距离',3,1,1);
INSERT INTO Chapter VALUES(52,'财神爷来啰',3,1,1);
INSERT INTO Chapter VALUES(53,'跳跳镇十周年庆',3,1,1);
INSERT INTO Chapter VALUES(54,'迷路的小魔王',3,1,1);

select * from Chapter;

CREATE TABLE IF NOT EXISTS Book (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT, `cover` TEXT, `enable` INTEGER);

INSERT INTO Book VALUES(1,'小班上','book/小班上.webp',1);
INSERT INTO Book VALUES(2,'中班上','book/中班上.webp',1);
INSERT INTO Book VALUES(3,'大班上','book/大班上.webp',1);

select * from Book;

CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)
