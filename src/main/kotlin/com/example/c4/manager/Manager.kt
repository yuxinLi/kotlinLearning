package com.example.c4.manager


interface Driver{
    fun drive()
}

interface Writer{
    fun write()
}


class CarDriver: Driver{
    override fun drive() {
        println(" drive ")
    }

}

class PPTWriter: Writer{
    override fun write() {
        println(" writer")
    }

}

class Manager: Driver , Writer{
    override fun drive() {
    }

    override fun write() {
    }

}

class SeniorManager(val driver: Driver , val write: Writer): Driver by driver , Writer by write

fun main(args: Array<String>) {

    val driver = CarDriver()
    val writer = PPTWriter()

    val sm = SeniorManager(driver , writer)
    sm.drive()
    sm.write()
}


