package com.zwj.kotlintest



fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式，例如: 3 + 4，用空格隔开")
            //从命令行读取,如果读到的null,直接break
            val input = readLine() ?: break
            //读取结果可能为空。所以要作非空校验
            //用空格切割,trim去掉字符串首位的空白
            val splits = input.trim().split(" ")
            if (splits.size < 3){
                throw IllegalArgumentException("参数格数不对")
            }
            //第一个参数
            val arg1 = splits[0].toDouble()
            //第二个参数
            val op = splits[1]
            //第三个参数
            val arg2 = splits[2].toDouble()

            //将结果打印出来
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1, arg2)}")
        }catch (e: NumberFormatException){
            println("请按照正常的格式输入")
        }catch (e: IllegalArgumentException){
            println("您确定您的输入是用空格分割的吗？")
        }catch (e: Exception){
            println("您好，程序遇到了未知的错误，错误信息是${e.printStackTrace()}")
        }
        println("再来一次？[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }
    //用户退出后，需要感谢用户的使用
    println("感谢您使用了**的计算器")
}
/**定义一个类*/
class Operator(op: String){
    //定义一个opFun,使用lambda表达式
    val opFun:(left: Double,right: Double) -> Double

    init {
        opFun = when(op){
            "+" -> {l,r -> l + r}
            "-" -> {l,r -> l - r}
            "*" -> {l,r -> l * r}
            "/" -> {l,r -> l / r}
            "%" -> {l,r -> l % r}
            else ->{
                throw UnsupportedOperationException(op)
            }
        }
    }
    //定义一个方法
    fun apply(left: Double, right: Double): Double{
        return opFun(left,right)
    }
}
