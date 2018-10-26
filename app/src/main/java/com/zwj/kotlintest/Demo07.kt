package com.zwj.kotlintest
//函数类型的参数
fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = "",
        transform: (T) -> String = { it.toString() } //默认实现
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element)) //使用函数参数转换
        println("index===>$index;element=====>$element")
        println("result===>$result;transform(element)=====>${transform(element)}")
    }
    result.append(postfix)
    println("postfix===>$postfix")
    return result.toString()
}



fun main(args: Array<String>) {

    val letters = listOf("ALPHL", "Beta")
    println("===="+letters.joinToString())
    println("------"+letters.joinToString { it.toLowerCase() })
    println("......."+letters.joinToString(separator = "! ", postfix = "! ", transform = { it.toUpperCase() }))
    println("==========================>")
    testDemo()


}

//自定义高阶函数/**/

private fun resultByOpt(num1 : Int , num2 : Int , result : (Int ,Int) -> Int) : Int{
    return result(num1,num2)
}

private fun testDemo() {

    val letters = listOf(1, 2,3,4,5,6,7,8,9)

    for (x in 1..5){

        for (y in 1..5){
            val result1 = resultByOpt(x,y){
                num1, num2 ->  num1 + num2
            }
            println("x：$x ==> y：$y")
            println("result1 = $result1")
            println("========================================")

            val result2 = resultByOpt(x,y){
                num1, num2 ->  num1 - num2
            }

            println("x：$x ==> y：$y")
            println("result2 = $result2")
            println("------------------------------")

            val result3 = resultByOpt(x,y){
                num1, num2 ->  num1 * num2
            }

            println("x：$x ==> y：$y")
            println("result3 = $result3")
            println("....................................")

            val result4 = resultByOpt(x,y){

                num1, num2 ->  num1 / num2
            }
            println("x：$x ==> y：$y")
            println("result4 = $result4")
            println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>")


        }


    }



}


fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

//val  double = ints.map{value -> value*2}
