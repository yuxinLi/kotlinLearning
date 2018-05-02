package com.example.c4.overload


class Overloads{

    @JvmOverloads
    fun a(int: Int = 0): Int{
        return int
    }
}

fun main(args: Array<String>) {

    val ol = Overloads()
    println(ol.a(3))
    println(ol.a())


}