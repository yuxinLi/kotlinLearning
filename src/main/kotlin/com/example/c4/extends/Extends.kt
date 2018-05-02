package com.example.c4.extends

fun main(args: Array<String>) {

    println("abc" * 5)

    "abc".b = 6
    println("abc".b)

}

operator fun String.times(int: Int): String{
    val sb = StringBuilder()
    for(i in 0 until int){
        sb.append(this)
    }
    return sb.toString()
}


val String.a : String
    get() = "abc"

var String.b : Int
    set(value){

    }
    get() = 5