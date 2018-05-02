package com.example.c5.`fun`

import java.io.File


fun main(args: Array<String>) {

//    val map = HashMap<Char , Int>()
//    File("build.gradle")
//        .readText()
//        .toCharArray()
//            .filterNot (Char::isWhitespace)
//            .groupBy { it }
//            .map {
//                println(it.key to it.value.size)
//            }
//            .forEach(::println)


    val list = listOf(1 , 2 , 3 , 4)
//    list.takeWhile { it <= 3 }.forEach(::println)

    list.filter(Int::isEvent).forEach(::println)

}

fun Int.isEvent() = this % 2 == 0