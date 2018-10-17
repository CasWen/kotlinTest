package com.zwj.kotlintest

/**
 * Created by zhu on 2017/6/12.
 */
val adrBoolear:Boolean=true

val anInt:Int=8
val anotherInt:Int=0xff
val moreInt:Int=0b0000000011
val maxInt:Int=Int.MAX_VALUE
val minInt:Int=Int.MIN_VALUE


val byetfanwei:Byte=127//-128到127  1个byte为8字节

val intarray:IntArray = intArrayOf(1,3,5,7)
val fromchars:String = String(charArrayOf('h','e','l','l','o'))//chararray 转string
val stringdemo:String="hello 'world'"
val gongzhi:Int=1000

var range:IntRange=0..1024  //区间变量   父类  closerange曲线

//类型  比较值和对象 区间 判断空  简单继承
fun main(args: Array<String>) {
    print("helloworld")
    //Type
    println(anotherInt)
    println(moreInt)
    println(maxInt)
    println(minInt)
    println(0f/0 )//nan


    println(intarray.slice(1..2))//拿到对应范围的数组
    println(intarray[1])//拿到指定的元素
    println(fromchars)//chararray 转string
    println(stringdemo)//hello 'world'

    println("$${gongzhi}")//$1000
    //字符串比较 == 比较内容   ===  比较的是对象
    val string:String="小明的工资$${gongzhi}"
    println("$string")//$1000

//    判断区间
    println(range.contains(1000))
    println(1000 in range)


    //class
    var miss= Miss("女","1990")
    var suange= Suaige("男","1990")
    if (suange is Suaige){
        println(suange.getName())
    }


    println(getName()?.length)

    println("=======================")
//    var personkt1= Kt1person("找")//import Person as Kt1person
//    var personkt2= Kt2person()
//    println("$personkt1"+"=====")


}





class Miss(sex:String,birth:String): Ren(sex,birth){
}
class Suaige(sex:String,birth:String): Ren(sex,birth){
    fun getName():String{
        return "suaige"
    }
}
open class Ren(sex:String, birth:String){
    init {
        //this.javaClass.simpleName 类名
        println("${this.javaClass.simpleName} 构造方法执行完后 执行的方法  ${sex}  ${birth}")
    }
}

fun getName(): String? {
    return null
}
