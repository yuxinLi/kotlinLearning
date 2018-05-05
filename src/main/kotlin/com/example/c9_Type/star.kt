package com.example.c9_Type


fun main(args: Array<String>) {


    val list: List<*> = listOf(1 , 2 )

    val com: Comparable<*> = object: Comparable<Any>{
        override fun compareTo(other: Any): Int {
            return 0
        }
    }

    Raw.getRaw()
}


fun <T> hello(){}

open class Hello<T>

class Hello2<T>

class Son: Hello<Hello2<*>>()
