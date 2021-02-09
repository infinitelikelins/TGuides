package com.bearya.manual.main

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import androidx.startup.AppInitializer
import com.bearya.manual.AppDatabase
import com.bearya.manual.DatabaseInitializer
import com.bearya.manual.R
import com.bearya.manual.databinding.ActivityMainBinding
import com.orhanobut.logger.Logger
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {

    private lateinit var bindView: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    private val fragmentLifecycleCallback = object : FragmentManager.FragmentLifecycleCallbacks() {

        override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
            if ("SupportRequestManagerFragment" != f.javaClass.simpleName) {
                Logger.t("Current").v("===== ${f.javaClass.simpleName} onFragmentCreated ===== ")
            }
        }

        override fun onFragmentDestroyed(fm: FragmentManager, f: Fragment) {
            if ("SupportRequestManagerFragment" != f.javaClass.simpleName) {
                Logger.t("Current").v("===== ${f.javaClass.simpleName} onFragmentDestroyed ===== ")
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindView = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel.startCommandListen()
        mainViewModel.reportOpenLog()
        mainViewModel.checkUpdate()

        // recursive : 是否递归Fragment中的Fragment，就是Fragment栈中的Fragment
        supportFragmentManager.registerFragmentLifecycleCallbacks(fragmentLifecycleCallback, true)

        val permission = mutableListOf<String>()
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            permission.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            permission.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
                != PackageManager.PERMISSION_GRANTED) {
            permission.add(Manifest.permission.READ_PHONE_STATE)
        }
        val toTypedArray = permission.toTypedArray()
        toTypedArray.takeIf { it.isNotEmpty() }?.also {
            ActivityCompat.requestPermissions(this, it, 123)
        }
        AppDatabase.instance = AppInitializer.getInstance(this).initializeComponent(DatabaseInitializer::class.java)
    }

    override fun onSupportNavigateUp(): Boolean = Navigation.findNavController(this, R.id.container_fragment).navigateUp()

    override fun onDestroy() {
        super.onDestroy()
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallback)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        permissions.forEachIndexed { index, _ ->
            if (grantResults[index] == PackageManager.PERMISSION_DENIED) {
                handlePermissions(permissions[index])
            }
        }
    }

    private fun handlePermissions(permission: String) {
        when (permission) {
            Manifest.permission.WRITE_EXTERNAL_STORAGE -> "您拒绝使用存储器"
            Manifest.permission.ACCESS_COARSE_LOCATION -> "您拒绝使用位置信息"
            Manifest.permission.READ_PHONE_STATE -> "您拒绝使用设备信息"
            else -> null
        }?.also { Toasty.error(this, it, Toasty.LENGTH_LONG).show() }
    }

}