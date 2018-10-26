package com.zwj.kotlintest

fun main(args: Array<String>) {

    val demo =Demo04()
    println(demo.result())

    // 在这里也可以改变接口属性的值
    demo.num4 = 5

    println(demo.result())
}

interface Demo04Interface{

    // 声明比那俩和提供默认值
    // 注意： val num3: Int = 3  这种方式不提供，为直接报错的
    val num3: Int
        get() = 3

    val num4: Int

}

class Demo04 : Demo04Interface{

    // 提供访问器实现
    override val num3: Int
        get() = super.num3


    // 手动赋值
    override var num4: Int = 4

    fun result() : Int{
        return num3 + num4
    }

}
