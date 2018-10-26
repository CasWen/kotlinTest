package com.zwj.kotlintest


fun main(args:Array<String>){
    val obj = "aertywifds"
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        print("Not a String")
    }
    else {
        println(obj.length)
    }
    demo(12345678)

    select(arrayOf(5,6,7,8))
}

fun demo(X:Any){
    if (X is String){
        println(X.length)
    }else
        println(X)

    if (X !is String || X.length==0){
        return
    }
}

fun select(a:Any){
    when(a){
        is Int -> println(a)
        is String -> println("哈哈")
        is ArrayList<*> -> println(a.size)
        is Array<*> -> println("我是数组：${a.size}")
    }
}
