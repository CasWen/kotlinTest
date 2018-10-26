package com.zwj.kotlintest

fun main(args:Array<String>){

    val addSum = Demo3(4,5)
    println(addSum.sum())
}

interface Demo3Interface{
    val num: Int
    val num2: Int
}

class Demo3(override val num:Int,override val num2:Int) : Demo3Interface{
    fun sum():Int{
        return num+num2
    }
}




