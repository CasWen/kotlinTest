package com.zwj.kotlintest

import java.lang.Integer.sum

fun sum(a: Int, b: Int) = a + b
fun main(args: Array<String>) {
    val path = "asdfghjkloiuytrewq"
    val path2 = "asdfghjkloiuytrewq"

    println(path.substring(0, 3))

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    println("=============================>")
    readWhile()
    println("=============================>")

    readFor()
    println("=============================>")
    println("sum of 19 and 23 is ${sum(19, 23)}")
    println("=============================>")
    println(sum2(19, 23))

    println("=============================>")

    var x = 5 // 推导出Int类型
    x += 1
    println("x = $x")
    println("=============================>")
    var a = 1
    // 使用变量名作为模板:
    val s1 = "a is $a"

    a = 2
    // 使用表达式作为模板:
    val s2 = "${s1.replace("is", "是")}, but now is $a"
    println(s2)
    println("=============================>")
    printProduct("4", "5")
    printProduct("a", "5")
    printProduct("a", "b")
    println("=============================>")

    for (x in 1..5) {
        println(x)
    }
    println("=============================>")
    for (x in 1..10 step 3) {
        println(x)
    }

    println("=============================>")

    for (x in 9 downTo 0 step 1) {
        println(x)
    }

    var arr = arrayOf("a","b","c","d")
    for ((index,value) in arr.withIndex()){
        println("arr的下标：$index ==> 对应的值为：$value")
    }

    println("=============================>")



    compareNum(2,3)

}

fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

fun readWhile(){
    val items = listOf("apple","banane","kakaq","aaaaa")
    var index =0
    while (index<items.size){
        println("打印结果为："+ "$index => ${items[index]}")
        index++
    }
}

fun readFor(){
    var intList:List<Int> = listOf(1,2,3,4,5,6)

    for (item:Int in intList){
        println(item)
    }


    var intArray = arrayOf(5,6,7,8,9)

    //使用in操作符检查集合是否包含某个对象
    for (i in intArray){
        println("intArray为："+i)

        println("arrary为："+"$i->${intArray.size}")
    }

    val  map = mapOf("a" to 1,"b" to 2,"c" to 3)

    for (m in map){
        println("============================>>>")
        println(m)


    }

}

fun sum2(a: Int , b: Int) : Int{
    return a + b

}


fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // 直接使用 x*y 会产生错误因为它们中有可能会有空值
    if (x != null && y != null) {
        // x 和 y 将会在空值检测后自动转换为非空值
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun compareNum(a: Int,b: Int){


     if (a > b){
        println("choose a")

    }else{
        println("choose b")

    }

   /* //传统用法
    var max = a
    if (a < b)
        max = b

//带 else
    var max: Int
    if (a > b)
        max = a
    else
        max = b

//作为表达式

    val max = if (a > b) a else b*/
}


