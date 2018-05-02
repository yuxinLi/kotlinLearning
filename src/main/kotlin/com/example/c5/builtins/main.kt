package com.example.c5.builtins

import java.io.BufferedReader
import java.io.FileReader


fun main(args: Array<String>) {

//    val list = listOf(
//            1..20 ,
//            2..5,
//            30..50
//    )
//
//    val flatList = list.flatMap {
////        println(" ft $it" )
//         it
//    }
//
//    flatList.forEach(::println)
//
//    println(flatList.reduce { aac , i -> aac + i})
//
//    println(flatList)
//
//    println((0..6).map(::factorial).takeWhile { it%2 == 1 })
//
//
//
//    findPerson()?.let{
//        it.work()
//    }
//
//    findPerson()?.apply {
//        work()
//        println(age)
//    }
//
//
//    var br = BufferedReader(FileReader("hello.txt"))
//    with(br){
//        var line: String?
//        while (true){
//            line = readLine()?:break
//            println(line)
//        }
//        close()
//    }
//
//
//    BufferedReader(FileReader("hello.txt")).use {
//        var line: String?
//        while (true){
//            line = it.readLine()
//            println(line)
//        }
//    }

}

data class Person(val name:String , val age:Int){
    fun work(){
        println("$name working..")
    }
}

fun findPerson():Person?{
    return Person("aaa" , 18)
}

fun factorial(n : Int) : Int{

    if(n == 0) return 1
    return (1..n).reduce{ acc , i -> acc+i}


}