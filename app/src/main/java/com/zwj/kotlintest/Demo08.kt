package com.zwj.kotlintest

/**
 *
 * *练习 Lambda 表达式*/
fun main(args: Array<String>) {
    val lambda = {
        left: Int, right: Int
        ->
        left + right
    }
    println(lambda(1,2))


    val sum: (Int) -> Int = { it +1 }

    println(sum(2))
    val nameList = listOf("Kotlin", "Java", "Python", "JavaScript", "Scala", "C", "C++", "Go", "Swift")
    nameList.filter {
        it.startsWith("J")
    }.map {
        "$it is a very good language"
    }.forEach {
        println(it)
    }


}


