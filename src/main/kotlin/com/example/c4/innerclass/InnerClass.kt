package com.example.c4.innerclass


open class Outter{

    val a:Int = 0

    inner class Inner{

        val a:Int = 2

        fun hello(){
            println(a)
            println(this@Outter.a)
        }
    }
}

interface OnClickListener{
    fun onClick()
}
class View{
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {

    val inner = Outter().Inner()

    val view = View()
    view.onClickListener = object : Outter(),OnClickListener{
        override fun onClick() {
        }

    }
}