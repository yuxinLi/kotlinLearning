package com.example.c4

abstract class Person(open val age: Int){
    abstract fun work()
}

class MaNong(age:Int): Person(age){

    override val age: Int
        get() = 0

    override fun work() {
        println("mmmm")
    }

}

class Doctor(age:Int) : Person(age){

    override fun work(){
        println("aaa")
    }
}

fun main(args: Array<String>) {

    val person: Person = MaNong(23)
    person.work()
    println(person.age)


    val person2: Person = Doctor(2)
    person2.work()
    println(person2.age)
}