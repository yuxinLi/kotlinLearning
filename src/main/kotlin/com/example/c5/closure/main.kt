package com.example.c5.closure


val string = "hello world"

fun makeFun():()->Unit{

    var count = 0
    return fun(){
        println (++count)
    }
}


fun add(x: Int):(Int) -> Int{
    return fun( y: Int):Int{
        return x+y
    }
}

fun add2(x: Int) = fun (y:Int) = x+y


fun main(args: Array<String>) {

//    val add5 = add(5)
//    val add2 = add5(2)
//    println(add2)

//    println(add2( 5))
    val makeFun = makeFun()
    makeFun()
    makeFun()
    makeFun()
}



