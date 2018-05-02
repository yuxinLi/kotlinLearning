package com.example.c4

enum class LogLevel(val id: Int){
    VERBOSE(0), INFO(1);

    fun getTag(): String{
        return "$id , $name"
    }

    override fun toString(): String {
        return "$name , $ordinal"
    }
}

fun main(args: Array<String>) {
    println(LogLevel.INFO.ordinal)
    println(LogLevel.values().map(::println))

//    println(LogLevel2.VERBOSE)
}

class LogLevel2 protected constructor(){

    companion object {
        val VERBOSE = LogLevel2()
    }
}