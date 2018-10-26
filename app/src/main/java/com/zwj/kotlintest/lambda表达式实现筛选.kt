package com.zwj.kotlintest
//筛选年龄

fun main(args: Array<String>) {

    val num = listOf(1,2,3,4,5)
    val peopleList = listOf(People("小白", 22),
            People("小红", 23),
            People("小明", 20),
            People("李刚",15))

     //筛选大于等于3
     println(num.filter { it >=3 })
     //筛选age小于18
     println(peopleList.filter { it.age <18 })
     println(peopleList.filter { it. age> 18 }.map{ it.name })//map生成一个新的集合

}

//需要注意的是数据类需要加 data 关键字,否则打印出来是地址值
data class People (val name:String,val age:Int)