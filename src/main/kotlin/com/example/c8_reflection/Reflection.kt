package com.example.c8_reflection

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/4
 */

@Poko
open class Person(@AnotherAnno val name: String , var age:Int){

    fun hello(){
        println("hello")
    }

    fun hello2(){
        println("hello2")
    }

    fun String.times(other: Int){
    }
}

fun Person.sayHello(){
    println("Person sayHello")
}


fun sayHello(){
    println("sayHello")
}


class Engineer(name: String, age: Int): Person(name, age)

class NoPrimaryContructor{
    constructor (){
        println("not primary, no arg")
    }

    constructor(int: Int){
        println("not primary, arg: $int")
    }
}

class DefaultConstructor


fun main(args: Array<String>) {
    val clazz = Person::class.java
    val kClazz = Person::class
    println("clazz = "+clazz)
    println("kClazz = $kClazz")

    val person = Person("lyx" , 18)
    val kClazz2 = person::class
    val kClazz3 = person.javaClass.kotlin
    val clazz2 = person.javaClass
    val clazz3 = person::class.java
//    println("kClazz2 = $kClazz2")
//    println("kClazz3 = $kClazz3")
//    println("clazz2 = $clazz2")
//    println("clazz3 = $clazz3")

    val defC = DefaultConstructor::class.java.newInstance()
    val primaryC = kClazz2.primaryConstructor!!
    val kPerson = primaryC.call("lyx" , 18)
//    println(kPerson)

    NoPrimaryContructor::class.constructors.last().call(18)

    (kClazz.memberProperties.first { it.name == "age" } as? KMutableProperty1<Person , Int>)?.set(kPerson , 19)

//    println(kPerson.age)

//    kClazz.memberExtensionFunctions.forEach(::println)
//    kClazz.annotations.forEach(::println)
//    kClazz.memberProperties.first{ it.name == "name"}.annotations.forEach(::println)

    val person2 = clazz2.getConstructor(String::class.java , Int::class.java).newInstance("lyx" , 20)
//    println(person2)

    Class.forName("com.example.c8_reflection.ReflectionKt")
            .getDeclaredMethod("sayHello")
            .invoke(null)

//    clazz.getAnnotation(Poko::class.java).let(::println)
//    clazz.getDeclaredField("name")
//            .apply {
//                isAccessible = true
//            }
//            .annotations.forEach(::println)
}

















