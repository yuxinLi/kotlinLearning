package com.example.c5.carrying

import java.io.OutputStream
import java.nio.charset.Charset


fun log(tag: String , target: OutputStream ,message: Any?){

    target.write(" [$tag] $message \n".toByteArray())
}

fun main(args: Array<String>) {
//    log("lyx" , System.out , " hello " )
//    ::log.curried()("lyx")(System.out)(" hello lyx")


    var f = ::log.curried()("lyx")(System.out)
    f("aa")
    f("bb")

    println(p2("我是 ".toByteArray()))

}

fun <P1 , P2 , P3 , R> Function3<P1 , P2 , P3 , R>.curried()
    = fun(p1:P1) = fun(p2:P2) = fun (p3:P3)
    = this(p1 , p2 , p3)


val makeString = fun(byteArray: ByteArray , charset: Charset):String{
    return String(byteArray , charset)
}

val p2 = makeString.partial2(charset("GBK"))

fun <P1 ,P2 ,R> Function2<P1 , P2, R>.partial2(p2: P2)
    = fun(p1: P1) = this(p1 , p2)