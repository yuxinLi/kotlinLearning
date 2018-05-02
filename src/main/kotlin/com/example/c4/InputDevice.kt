package com.example.c4

interface InputDevice{
    fun input(event : Any)
}

interface USB : InputDevice

interface BLE: InputDevice

interface OpticalMouse

abstract class USBMouse(val name: String): USB , OpticalMouse{

    override fun input(event: Any) {
    }

    override fun toString(): String {
        return name
    }
}

class LogiMouse: USBMouse("Loji")


class Computer{

    fun addUSB(input: USB){
        println(input)
    }

    fun addBLE(input : BLE){
        println(input)
    }

    fun add(input: InputDevice){
        when(input){
            is BLE ->{
                addBLE(input)
            }

            is USB ->{
                addUSB(input)
            }
            else -> {

            }
        }
    }
}

fun main(args: Array<String>) {

    val com = Computer()
    val mouse = LogiMouse()
    com.add(mouse)
}