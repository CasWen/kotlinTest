package com.zwj.kotlintest



// open class Person
//
//val person = Person()
data class User(val name : String, val age: Int )

val mUser = User("kotlin",22)

val mNewUser = mUser.copy("bill",32)


//fun copy(name: String = this.name1, age: Int = this.age) = User(name, age)
val jane = User("jane",24)
val oldjane = jane.copy(name = "张三",age = 25)


fun main(args: Array<String>){
    println(mUser)
    println("oldjane===：$oldjane;jane===:$jane")


    println(mNewUser)
    println("demo:$demo;str====>${Outer().Inner().str()}")

    // 类的初始化
    var demo = Demo1()

    demo.fun1()
}

class Outer {
    private val bar: Int = 1
    val str = "xyx"
    inner class Inner {
        fun foo() = bar
        fun str() = str
    }
}

val demo = Outer().Inner().foo() //==1




/**
 * 我定义的接口
 */
interface Demo1Interface{

    // 定义的方法
    fun fun1()
}

/**
 * 接口的实现类
 */
class Demo1 : Demo1Interface{
    override fun fun1() {
        println("我是接口中的fun1方法")
    }
}
