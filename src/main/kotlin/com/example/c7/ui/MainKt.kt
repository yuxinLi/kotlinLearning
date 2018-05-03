package cn.kotliner.coroutine.ui

import com.example.c7.basic.loading
import com.example.c7.basic.startC
import javax.swing.JFrame

/**
 * Created by benny on 5/20/17.
 */
const val LOGO_URL = "http://www.imooc.com/static/img/index/logo.png?t=1.1"

fun main(args: Array<String>) {


    val frame = MainWindow()
    frame.title = "Coroutine@Bennyhuo"
    frame.setSize(200, 150)
    frame.isResizable = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.init()
    frame.isVisible = true

    frame.onButtonClick {
        startC {
            val imageData = loading(LOGO_URL)
            frame.setLogo(imageData)
        }
    }

}

