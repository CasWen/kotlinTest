package com.zwj.kotlintest

//接口类
fun main(args: Array<String>) {

    // 类的初始化
    val demo = Demo4()

    demo.fun1()
    demo.fun2()
}

interface Demo4InterfaceOne{
    fun fun1(){
        println("我是Demo4InterfaceOne中的fun1()")
    }

    fun fun2(){
        println("我是Demo4InterfaceOne中的fun2()")
    }
}

interface Demo4InterfaceTwo{
    fun fun1(){
        println("我是Demo4InterfaceTwo中的fun1()")
    }

    fun fun2(){
        println("我是Demo4InterfaceTwo中的fun2()")
    }
}

class Demo4 : Demo4InterfaceOne,Demo4InterfaceTwo{

    override fun fun1() {
        super<Demo4InterfaceOne>.fun1()
        super<Demo4InterfaceTwo>.fun1()
    }

    //可以通过super<接口名>.方法名来区分
    override fun fun2() {
        super<Demo4InterfaceOne>.fun2()
        super<Demo4InterfaceTwo>.fun2()
    }

}

