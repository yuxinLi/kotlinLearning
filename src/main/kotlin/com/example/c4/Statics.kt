package com.example.c4


fun main(args: Array<String>) {
    val l = Latitude.TAG
    val k = Latitude.ofDouble(2.0)
    println(k.value)
}

class Latitude private constructor(val value: Double){


    companion object {

        @JvmStatic
        fun ofDouble (double: Double): Latitude{
            return Latitude(double)
        }

        @JvmField
        val TAG: String = "Latitude"
    }
}