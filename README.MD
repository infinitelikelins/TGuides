# TV 更新日期: 2020-12-24
## 创想天地(民办园) (ACE/小团课)

![Version](https://img.shields.io/badge/Version-2.3.0-brightgreen.svg?style=flat)
![VersionCode](https://img.shields.io/badge/VersionCode-2602-brightgreen.svg?style=flat)
![数据库版本](https://img.shields.io/badge/DatabaseVersion-10-red.svg?style=flat)
![AndroidAPI](https://img.shields.io/badge/AndroidAPI-21+-orange.svg?style=flat)
![Project](https://img.shields.io/badge/Project-core-purple.svg?style=flat)
![BuildType](https://img.shields.io/badge/BuildType-release-cyan.svg?style=flat)
![PackageName](https://img.shields.io/badge/PackageName-com.bearya.manual-blue.svg?style=flat)

## 创想天地(民办园) (BD)

![Version](https://img.shields.io/badge/Version-2.3.0-brightgreen.svg?style=flat)
![VersionCode](https://img.shields.io/badge/VersionCode-2602-brightgreen.svg?style=flat)
![数据库版本](https://img.shields.io/badge/DatabaseVersion-10-red.svg?style=flat)
![AndroidAPI](https://img.shields.io/badge/AndroidAPI-21+-orange.svg?style=flat)
![Project](https://img.shields.io/badge/Project-world-purple.svg?style=flat)
![BuildType](https://img.shields.io/badge/BuildType-release-cyan.svg?style=flat)
![PackageName](https://img.shields.io/badge/PackageName-com.bearya.manual.world-blue.svg?style=flat)

## 创想天地(公办园)

![Version](https://img.shields.io/badge/Version-2.3.0-brightgreen.svg?style=flat)
![VersionCode](https://img.shields.io/badge/VersionCode-2602-brightgreen.svg?style=flat)
![数据库版本](https://img.shields.io/badge/DatabaseVersion-7-red.svg?style=flat)
![AndroidAPI](https://img.shields.io/badge/AndroidAPI-21+-orange.svg?style=flat)
![Project](https://img.shields.io/badge/Project-publicly-purple.svg?style=flat)
![BuildType](https://img.shields.io/badge/BuildType-release-cyan.svg?style=flat)
![PackageName](https://img.shields.io/badge/PackageName-com.bearya.manual.publicly-blue.svg?style=flat)

## 贝芽暑期课

![Version](https://img.shields.io/badge/Version-2.3.0-brightgreen.svg?style=flat)
![VersionCode](https://img.shields.io/badge/VersionCode-2602-brightgreen.svg?style=flat)
![数据库版本](https://img.shields.io/badge/DatabaseVersion-6-red.svg?style=flat)
![AndroidAPI](https://img.shields.io/badge/AndroidAPI-21+-orange.svg?style=flat)
![Project](https://img.shields.io/badge/Project-summer-purple.svg?style=flat)
![BuildType](https://img.shields.io/badge/BuildType-release-cyan.svg?style=flat)
![PackageName](https://img.shields.io/badge/PackageName-com.bearya.manual.summer-blue.svg?style=flat)

## 贝芽幼小衔接课

![Version](https://img.shields.io/badge/Version-2.3.0-brightgreen.svg?style=flat)
![VersionCode](https://img.shields.io/badge/VersionCode-2602-brightgreen.svg?style=flat)
![数据库版本](https://img.shields.io/badge/DatabaseVersion-6-red.svg?style=flat)
![AndroidAPI](https://img.shields.io/badge/AndroidAPI-21+-orange.svg?style=flat)
![Project](https://img.shields.io/badge/Project-connect-purple.svg?style=flat)
![BuildType](https://img.shields.io/badge/BuildType-release-cyan.svg?style=flat)
![PackageName](https://img.shields.io/badge/PackageName-com.bearya.manual.connect-blue.svg?style=flat)

# 工程构建 ： include ':manual', 结构如下：

- main  : 核心板块，这里存放着各个产品版本的通用界面和核心工具通用类

- frame : 投屏功能界面核心类和资源

- core  : 民办幼儿园产品(ACE/小团课)的不同代码位置

- world : 民办幼儿园产品(BD)的不同代码位置

- publicly : 公办幼儿园产品的不同代码位置

- connect : 贝芽幼小衔接课产品的不同代码位置

- summer : 贝芽暑期课产品的不同代码位置

# 项目工程

- 本项目是AndroidTv的应用

- 本项目使用的基本语言是kotlin + Coroutines

- 本项目现在是全面基于AndroidX和AndroidJetpack构建

- 项目使用单activity+多Fragment，没有封装基类等，均使用AndroidX的兼容类，避免封装的基类带来的不便。如果需要基类的基本需求，使用Kotlin的类扩展语法糖

- **以andoridxd的Fragment为标准新页面的基类，不重写**

- **集成框架基础 ：** androidx.leanback + andoridx.core + KTX + Lifecycle + ViewModel + LiveData + Coroutines + DataBinding + Room + Paging + Navigation + Constraintlayout + WorkManager + Viewpager2

- **(重要) (重要) 项目中不要修改versionCode（编译自动更新），只需要修改version版本即可**

- 业务信息内容可分不同包

- **(重要) 工具扩展方法在library包中定义**

- **(重要) (重要) 图片放置位置与drawable下,mipmap 是放置应用图标的文件夹**

- **(重要) 数据的获取不要再Activity/Fragment中去做，需要在data/repository 或者是在ViewModel中完成**

- **(重要) API接口统一写在data/component中,接口信息是使用新的Retrofit2.6以上版本，代码可以简化请求，注意异常的捕获**

- Room数据库采取持久化存储方式。 [数据库更新日志](https://dev.git.bearya.com/BeiYaOS/TGuides/src/master/%E6%95%B0%E6%8D%AE%E5%BA%93%E6%9B%B4%E6%96%B0%E7%89%88%E6%9C%AC.MD)

- **(重要) (重要) (重要) 日志信息记录：约定日志使用Logger记录**

- **(重要) (重要) Room数据库升级可在AppDatabase中添加迁移信息，迁移信息可以在com.bearya.data.migrations中定义，预打包的数据库文件在assets/database/manual.db**

- **(重要) (重要) (重要) v-X.Y.Z.B : X 主版本号 , Y 小版本号 , Z bug修复版本号 , B 编译版本号**

- [Apk版本更新日志](https://dev.git.bearya.com/BeiYaOS/TGuides/src/master/%e6%9b%b4%e6%96%b0%e6%97%a5%e5%bf%97.MD)

## 使用蓝牙连接

- Tv上 BluetoothMonitorService做数据接收 ，FrameAppcompatActivity做界面数据的显示

- 注意数据读写方面的线程安全

- 蓝牙的代码再library/bluetooth中定义,BluetoothMonitorService 是新的进程服务，与界面是使用关播进行通信

- 本项目作为蓝牙服务端存在，配对的UUID是 : **14f46c43-afa0-4de3-8654-e4d0bda587f5**

- 蓝牙服务端口成功监听到客户端连接需要及时的释放监听资源，断开后再开启下次的监听。

## 课件文件夹目录

- **由于课件的版本不同，所有的课程内容分布在不同的产品风味下，注意修改目录和打包配置。
- **课件的文件夹的名称就是课程的名称。**
- **(重要) (重要) (重要) 课件的封面放在课件的文件夹 assets/chapter/课程名称/ 下，命名统一为cover.webp。**
- **(重要) (重要) (重要) 课件的实际内容放在课件文件夹下，新建一个的 assets/chapter/课程名称/resource/ 文件夹中，命名需要以阿拉伯数字定义顺序。**
- **课件webp文件**
- 查阅 [电视端可播放课件内容目录要求](https://dev.git.bearya.com/BeiYaOS/TGuides/src/master/%e7%94%b5%e8%a7%86%e7%ab%af%e5%8f%af%e6%92%ad%e6%94%be%e8%af%be%e4%bb%b6%e5%86%85%e5%ae%b9%e7%9b%ae%e5%bd%95%e8%a6%81%e6%b1%82.txt) 

## 关于课件激活解锁

- 课件激活验证是通过网络激活验证，可查API接口。
- **课件激活验证后，使用Room去更新表Chapter中的lock字段**。
- 课件激活码返回的数据data含义：

| 名称 | 类型| 值 | 详细 |
|---|---|---|---|
| NoNet | Int |-2  | 没有联网，不可验证激活码|
| Empty | Int | -1| 激活码为空|
| Fail | Int | 0 |多种因素验证失败 |
| Success  | Int | 1 | 激活码验证正确 |
| Invalid | Int | 2 |该激活码已失效 |
| None | Int | 3 |该激活码不存在 |

## 关于投屏的定码规则

- 1. 投屏定码 -- com.bearya.manual.frame.FrameCommand -- 详细可查询 - [投屏定码](https://dev.git.bearya.com/BeiYaOS/TGuides/src/master/%e6%8a%95%e5%b1%8f%e5%ae%9a%e7%a0%81.MD)
- 2. 投屏场景 -- com.bearya.manual.frame.scene.* -- 可定义各种使用的表现场景
- 3. 投屏数据 -- com.bearya.manual.frame.FrameImages / com.bearya.manual.frame.obj.* -- 可定义各种不同的数据内容
- 4. 共同的内容： **使用 " ; "作为标识分隔符**

### 投屏场景Scene

|场景|ClassName|应用|
|---|---|---|
|行走Lottie动画场景|EmotionScene|童话世界|
|终点场景（道具收集缺少）|EndFailScene|童话世界|
|终点场景（道具完整收集）|EndScene|童话世界|
|事件场景（选择正确做法）|EventScene|跳跳镇|
|道路异常场景|ExceptionScene|跳跳镇|
|金币场景|GoldScene|跳跳镇|
|事件场景（触摸小贝传感器）|HelpScene|跳跳镇|
|主题背景介绍|IntroduceScene|童话世界|
|障碍对抗场景|ObstacleScene|童话世界|
|收集道具场景|PropScene|童话世界|
|启动闪屏场景|StartScene|通用|
|状态场景（连接状态/卡片编辑状态）|StateScene|通用|
|行走错误场景|StoryErrorScene|童话世界|
|终点场景|SummaryScene|跳跳镇|
|主题选择场景|ThemeScene|通用|
|行走Lottie动画场景|WalkMoveScene|跳跳镇|

#

### 跳跳镇
我们在使用的时候，跳跳镇中统一定义:

|参数|解释|限制|
|---|---|---|
|第一参数(必须)| 应用的名称定义|固定参数 city;|
|第二参数(必须)| 应用的动作或者是页面信息|可自定义数字或者字符参数|
|第N参数(可选自定义，可为空)|应用动作页面所需要携带的参数信息，具体含义解释定义需要配合同步定义|可选|

>例如金币动画：city;10069;10
>就是定义的跳跳镇，金币动画，金币个数参数10个。
>由具体的场景去解析这个参数播放动画和音频内容

---

### 童话世界
我们在使用的时候，童话世界中统一定义:

|参数|解释|限制|
|---|---|---|
|第一参数(必须)| 应用的名称以及动作和页面|固定参数开头 80 + 其他动作页面数值|
|第N参数(可选自定义，可为空)|应用动作页面所需要携带的参数信息，具体含义解释定义需要配合同步定义|可选|

>例如主题动画：800001 ，
>就是定义的童话世界，游戏主题选择，无参数。
>由具体的场景去解析这个参数播放动画和音频内容