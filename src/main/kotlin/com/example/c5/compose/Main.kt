package com.example.c5.compose

import com.example.c5.closure.add


val add5 = {i: Int -> i+5}
val multi2 = {i: Int -> i *2}

fun main(args: Array<String>) {

//    println(multi2(add5(5)))


    val addMul = add5 andThen multi2

    val muladd = add5 compose multi2

    println(addMul(3))

    println(muladd(3))

}


infix fun<P1,P2,R> Function1<P1, P2>.andThen(
        function: Function1<P2 , R> ): Function1<P1 , R>
{

    return fun(p1: P1): R{
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1 , P2 ,R> Function1<P2 , R>.compose(
    function: Function1<P1 , P2>):Function1<P1 ,R> {

    return fun(p1: P1):R{
        return this.invoke(function.invoke(p1))
    }
}