package com.zwj.kotlintest

import android.support.compat.R.id.time

//对象表达式和声明

class Student{
    var age:Int? =0
    get() = field//get 访问 关键字为field
    set(value) {
        field = value
    }

}

//对象声明 跟在object后面

object DataProviderManager {
//    fun registerDataProvider(provider: DataProvider) {
        // ...
    }

//    val allDataProviders: Collection<DataProvider>
//        get() = // ...
//}


//高阶函数

val sum:(Int,Int) -> Int = {x,y -> x+y}
val action:() -> Unit = {
    println(35)
}


fun main(args:Array<String>){

    action()


}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

/*

fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit //给函数类型的参数定义名字
) {
    */
/*...*//*

}

>>> val url = "http://kotl.in"
>>> performRequest(url) {code, content -> */
/*...*//*
} //可以使用定义的名字
>>> performRequest(url) {code, page -> */
/*...*//*
} //也可以改变参数名字
*/

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

