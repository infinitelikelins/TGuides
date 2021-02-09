package library

import com.bearya.manual.BuildConfig
import java.util.*

const val APP_ID = BuildConfig.APPLICATION_ID

//================================== 课件需要激活的验证结果的状态常量
/**
 * 没有联网，不可验证激活码
 */
const val NoNet: Int = -2
/**
 * 激活码为空
 */
const val Empty: Int = -1
/**
 * 多种因素验证失败
 */
const val Fail: Int = 0
/**
 * 激活码验证正确
 */
const val Success: Int = 1
/**
 * 该激活码已失效
 */
const val Invalid: Int = 2
/**
 * 该激活码不存在
 */
const val None = 3
//==================================


val bluetoothUUID: UUID = UUID.fromString("14f46c43-afa0-4de3-8654-e4d0bda587f5")

const val ACTION_BLUETOOTH_MESSAGE = "BluetoothMessageAction"

const val BLUETOOTH_MESSAGE =  "BluetoothMessage"

const val ACTION_STOP_SERVICE = "ACTION_STOP_SERVICE"

//================================== 蓝牙的连接状态常量
/**
 * 蓝牙连接的状态：初始化
 */
const val STATE_INIT = -2

/**
 * 蓝牙连接的状态：等待连接
 */
const val STATE_WAITING = -1
/**
 * 蓝牙连接的状态：未连接
 */
const val STATE_NONE = 0

/**
 * 蓝牙连接的状态：已连接
 */
const val STATE_CONNECTED = 1
//==================================