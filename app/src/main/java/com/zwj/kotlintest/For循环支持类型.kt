package com.zwj.kotlintest

//fun main(args:Array<String>){
//
//    var str = listOf('a',1,true)
//
//    for (a in str){
//        println("$a")
//    }
//
//}

abstract class Lanauage {
    val TAG = this.javaClass.simpleName // 自身的属性

    // 自身的函数
    fun test(): Unit {
// exp
    }

    abstract var name: String // 抽象属性
    abstract fun init() // 抽象方法
}

/**
 * 抽象类Lanauage的实现类TestAbstarctA
 */
class TestAbstarctA : Lanauage() {

    override var name: String
        get() = "Kotlin"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

/**
 * 抽象类Lanauage的实现类TestAbstarctB
 */
class TestAbstarctB : Lanauage() {
    override var name: String
        get() = "Java"
        set(value) {}

    override fun init() {
        println("我是$name")
    }
}

fun main(args: Array<String>) {

// val lanauage = Lanauage() 是错误的，因为抽象类不能直接被实例化

    val mTestAbstarctA = TestAbstarctA()
    val mTestAbstarctB = TestAbstarctB()

    println(mTestAbstarctA.name)
    mTestAbstarctA.init()

    println(mTestAbstarctB.name)
    mTestAbstarctB.init()
}
