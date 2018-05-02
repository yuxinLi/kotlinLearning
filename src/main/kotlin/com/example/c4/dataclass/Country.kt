package com.example.c4.dataclass

import com.example.c4.annotations.PoKo

@PoKo
data class Country(val id: Int , val name:String)


class ComponentX{
    operator fun  component1():String{
        return "i"
    }

    operator fun component2():String {
        return "m"
    }

    operator fun component3():String {
        return "110"
    }
}

fun main(args: Array<String>) {
    val china = Country(1 , "aaa")
    println(china)

    println(china.component1())
    println(china.component2())
    val (id , name) = china
    println(id)
    println(name)


    val componentX = ComponentX()
    val (a , b , c) = componentX
    print("$a $b $c")


}