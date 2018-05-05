package com.example.c9_Type

import com.google.gson.Gson


fun main(args: Array<String>) {

    testGenerics<Number>()

    val person = Person("lyx" , 18)
    val s = Gson().toJson(person)

    needPerson(Gson().fromJson(s))
}


inline fun <reified T> testGenerics(){
    println(T::class.java)
}


fun needPerson( person: Person){}

data class Person(val name: String , val age: Int)

inline fun <reified T> Gson.fromJson(json: String): T
    = fromJson(json , T::class.java)