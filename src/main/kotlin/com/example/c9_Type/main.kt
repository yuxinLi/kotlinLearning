package com.example.c9_Type


fun main(args: Array<String>) {

    val complex = Complex(3.0 , 4.0)
    val complex2 = Complex(3 , 5)

    println(complex)
    println(complex2)
}


data class Complex<T: Number>(val a: T , val b: T){

    override fun toString(): String {
        return "($a + $b i)"
    }
}

fun <T: Comparable<T>> maxOf(a: T , b: T): T{

    return if(a > b ) b else a
}