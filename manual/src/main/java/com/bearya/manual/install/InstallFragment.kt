package com.bearya.manual.install

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bearya.manual.BuildConfig
import com.bearya.manual.databinding.FragmentInstallBinding
import com.bearya.manual.main.MainViewModel
import com.liulishuo.filedownloader.BaseDownloadTask
import com.liulishuo.filedownloader.FileDownloadListener
import com.liulishuo.filedownloader.FileDownloader
import com.orhanobut.logger.Logger
import com.tencent.bugly.crashreport.CrashReport
import library.ext.downloadPath
import java.io.File

class InstallFragment : Fragment() {

    private val requestWriteExternalStorageCode: Int = 123
    private val requestReadExternalStorageCode = 203
    private val requestRequestInstallPackagesCode = 503

    private lateinit var bindView: FragmentInstallBinding
    private val mainViewModel: MainViewModel by activityViewModels()
    private var downloadListener: DownloadListenerImpl? = null
    private var downloadTaskId: Int? = null
    private var downloader: BaseDownloadTask? = null

    private val apkPath by lazy { BuildConfig.APP_DOWNLOAD_NAME.downloadPath() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindView = FragmentInstallBinding.inflate(inflater, container, false)
        return bindView.apply { lifecycleOwner = viewLifecycleOwner }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (File(apkPath).exists()) {
            Logger.d("应用已下载 $apkPath")

            bindView.progress.visibility = View.GONE
            bindView.updateTips.visibility = View.VISIBLE
            bindView.updateTips.text = "应用已下载"

            if (ContextCompat.checkSelfPermission(requireContext(), android.Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && requireContext().packageManager.canRequestPackageInstalls().not()) {
                    ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.REQUEST_INSTALL_PACKAGES), requestRequestInstallPackagesCode)
                } else {
                    installApk()
                }

            } else {
                ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE), requestReadExternalStorageCode)
            }
        } else {
            mainViewModel.newApkUrl.observe(viewLifecycleOwner) {
                it?.apply {
                    if (startsWith("http", true)) {
                        downloader = FileDownloader.getImpl().create(this).setPath(apkPath, false).setCallbackProgressTimes(100).setMinIntervalUpdateSpeed(100)

                        downloader?.listener = DownloadListenerImpl().also { downloadListenerImpl ->
                            downloadListener = downloadListenerImpl
                        }

                        if (ActivityCompat.checkSelfPermission(requireContext(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                            downloadTaskId = downloader?.start()
                        } else {
                            ActivityCompat.requestPermissions(requireActivity(), arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE), requestWriteExternalStorageCode)
                        }
                    } else {
                        CrashReport.postCatchedException(Exception("应用更新地址错误 : $this"))
                        bindView.updateTips.visibility = View.VISIBLE
                        bindView.updateTips.text = "应用更新地址错误"
                        bindView.progress.startIntro()
                        bindView.progress.fail()
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindView.unbind()
    }

    override fun onStop() {
        super.onStop()
        downloadTaskId?.let { FileDownloader.getImpl().pause(it) }
        downloadListener?.let { FileDownloader.getImpl().pause(it) }
    }

    private fun installApk() {

        File(apkPath).takeIf { it.exists() }?.apply {

            val intent = Intent(Intent.ACTION_VIEW)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }
            intent.setDataAndType(if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                FileProvider.getUriForFile(requireContext(), "com.bearya.manual.fileprovider", this)
            } else {
                Uri.fromFile(this)
            }, "application/vnd.android.package-archive")
            startActivity(intent)

        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            requestWriteExternalStorageCode -> {
                if (permissions[0] == android.Manifest.permission.WRITE_EXTERNAL_STORAGE && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    downloadTaskId = downloader?.start()
                }
            }

            requestReadExternalStorageCode -> {
                if (permissions[0] == android.Manifest.permission.READ_EXTERNAL_STORAGE && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    installApk()
                }
            }

            requestRequestInstallPackagesCode -> {
                if (permissions[0] == android.Manifest.permission.REQUEST_INSTALL_PACKAGES && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    installApk()
                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    startActivity(Intent(ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    })
                }
            }
        }
    }

    inner class DownloadListenerImpl : FileDownloadListener() {

        override fun warn(task: BaseDownloadTask?) {
            Logger.d("warn")
        }

        override fun completed(task: BaseDownloadTask?) {
            bindView.updateTips.text = "应用下载完成"
            bindView.progress.success()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && requireContext().packageManager.canRequestPackageInstalls().not()) {
                startActivity(Intent(ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                })
            } else {
                installApk()
            }
        }

        override fun pending(task: BaseDownloadTask?, soFarBytes: Int, totalBytes: Int) {
            bindView.updateTips.visibility = View.VISIBLE
            bindView.progress.startIntro()
        }

        override fun error(task: BaseDownloadTask?, e: Throwable?) {
            Logger.d(e?.message)
            bindView.updateTips.text = "应用下载中断"
            bindView.progress.fail()
        }

        override fun progress(task: BaseDownloadTask?, soFarBytes: Int, totalBytes: Int) {
            Logger.d("$soFarBytes/$totalBytes")
            bindView.updateTips.text = "应用正在下载中"
            if (soFarBytes < totalBytes) {
                val float = soFarBytes.toFloat() * 100 / totalBytes
                Logger.d("progress = $float")
                bindView.progress.setProgress(if (float < 100) float else 100f)
            }
        }

        override fun paused(task: BaseDownloadTask?, soFarBytes: Int, totalBytes: Int) {
            bindView.updateTips.text = "应用下载暂停"
            Logger.d("paused")
        }

    }
}