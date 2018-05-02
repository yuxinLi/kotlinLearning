package com.example.c5.basic


fun main(args: Array<String>) {



    args.forEach(::println)

    args.filter(String::isNotEmpty)

    val pdf = PDFPrinter()
    args.forEach(pdf::println)

}

class PDFPrinter{
    fun println(any: Any){
        kotlin.io.print(any)
    }
}

class Hello{
    fun world(){
        println("world")
    }
}