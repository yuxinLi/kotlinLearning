package com.example.c7.async

import cn.kotliner.coroutine.ui.MainWindow
import com.example.c7.basic.LOGO_URL
import com.example.c7.common.log
import javax.swing.JFrame

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */


fun main(args: Array<String>) {

    val frame = MainWindow()
    frame.title = "Coroutine@Bennyhuo"
    frame.setSize(200, 150)
    frame.isResizable = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.init()
    frame.isVisible = true

    frame.onButtonClick {
        log("协程之前")
        startC2(DownloadContext(LOGO_URL)) {
            log("协程开始")
            val imageData = time {
                loading2(this[DownloadContext]!!.url)
            }
            log("拿到图片")
            frame.setLogo(imageData)
        }
        log("协程之后")

    }

}