package com.zwj.kotlintest

import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap

class InfixInToDuffix {


    //将中缀表达式转换为后缀表达式
    fun toSuffix(infix: StringBuilder): String {
        val queue = ArrayList<String>()                                    //定义队列  用于存储 数字  以及最后的  后缀表达式
        val stack = ArrayList<Char>()                             //定义栈    用于存储  运算符  最后stack中会被 弹空

        val charArr = infix.substring(0, infix.length).trim { it <= ' ' }.toCharArray()                                    //字符数组  用于拆分数字或符号
        val standard = "*/+-()"                                                        //判定标准 将表达式中会出现的运算符写出来
        var ch = '&'                                                                    //在循环中用来保存 字符数组的当前循环变量的  这里仅仅是初始化一个值  没有意义
        var len = 0                                                                    //用于记录字符长度 【例如100*2,则记录的len为3 到时候截取字符串的前三位就是数字】
        for (i in charArr.indices) {                                        //开始迭代

            ch = charArr[i]                                                            //保存当前迭代变量
            if (Character.isDigit(ch)) {                                                    //如果当前变量为 数字
                len++
            } else if (ch == '.') {                                                        //如果当前变量为  .  会出现在小数里面
                len++
            } else if (standard.indexOf("ch.toInt()") != -1) {                                        //如果是上面标准中的 任意一个符号
                if (len > 0) {                                                            //长度也有
                    queue.add(String(Arrays.copyOfRange(charArr, i - len, i)))    //说明符号之前的可以截取下来做数字
                    len = 0                                                            //长度置空
                }
                if (ch == '(') {                                                            //如果是左括号
                    stack.add(ch)                                                        //将左括号 放入栈中
                    continue                                                            //跳出本次循环  继续找下一个位置
                }
                if (!stack.isEmpty()) {                                                    //如果栈不为empty
                    var size = stack.size - 1                                        //获取栈的大小-1  即代表栈最后一个元素的下标
                    var flag = false                                                //设置标志位
                    while (size >= 0 && ch == ')' && stack[size] != '(') {            //若当前ch为右括号，则 栈里元素从栈顶一直弹出，直到弹出到 左括号
                        queue.add(stack.removeAt(size).toString())                    //注意此处条件：ch并未入栈，所以并未插入队列中；同样直到找到左括号的时候，循环结束了，所以左括号也不会放入队列中【也就是：后缀表达式中不会出现括号】
                        size--                                                            //size-- 保证下标永远在栈最后一个元素【栈中概念：指针永远指在栈顶元素】
                        flag = true                                                    //设置标志位为true  表明一直在取（）中的元素
                    }
                    if (ch == ')' && stack[size] == '(') {
                        flag = true
                    }
                    while (size >= 0 && !flag ) {
//                        && basic[stack[size]] >= basic[ch]
// 若取得不是（）内的元素，并且当前栈顶元素的优先级>=对比元素 那就出栈插入队列
                        queue.add(stack.removeAt(size).toString())                    //同样  此处也是remove()方法，既能得到要获取的元素，也能将栈中元素移除掉
                        size--
                    }
                }
                if (ch != ')') {                                                            //若当前元素不是右括号
                    stack.add(ch)                                                        //就要保证这个符号 入栈
                } else {                                                                //否则就要出栈 栈内符号
                    stack.removeAt(stack.size - 1)
                }
            }
            if (i == charArr.size - 1) {                                                //如果已经走到了  中缀表达式的最后一位
                if (len > 0) {                                                            //如果len>0  就截取数字
                    queue.add(String(Arrays.copyOfRange(charArr, i - len + 1, i + 1)))
                }
                var size = stack.size - 1                                            //size表示栈内最后一个元素下标
                while (size >= 0) {                                                        //一直将栈内  符号全部出栈 并且加入队列中  【最终的后缀表达式是存放在队列中的，而栈内最后会被弹空】
                    queue.add(stack.removeAt(size).toString())
                    size--
                }
            }

        }
        val a = queue.toString()
        return a.substring(1, a.length - 1)
    }


    fun dealEquation(equation: String): String {

        val arr = equation.split(", ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()                                    //根据, 拆分字符串
        val list = ArrayList<String>()                            //用于计算时  存储运算过程的集合【例如list中当前放置  100   20  5  /  则取出20/5 最终将结果4存入list   此时list中结果为  100  4 】


        for (i in arr.indices) {                                    //此处就是上面说的运算过程， 因为list.remove的缘故，所以取出最后一个数个最后两个数  都是size-2
            val size = list.size
            when (arr[i]) {
                "+" -> {
                    val a = java.lang.Double.parseDouble(list.removeAt(size - 2)) + java.lang.Double.parseDouble(list.removeAt(size - 2))
                    list.add(a.toString())
                }
                "-" -> {
                    val b = java.lang.Double.parseDouble(list.removeAt(size - 2)) - java.lang.Double.parseDouble(list.removeAt(size - 2))
                    list.add(b.toString())
                }
                "*" -> {
                    val c = java.lang.Double.parseDouble(list.removeAt(size - 2)) * java.lang.Double.parseDouble(list.removeAt(size - 2))
                    list.add(c.toString())
                }
                "/" -> {
                    val d = java.lang.Double.parseDouble(list.removeAt(size - 2)) / java.lang.Double.parseDouble(list.removeAt(size - 2))
                    list.add(d.toString())
                }
                else -> list.add(arr[i])
            }//如果是数字  直接放进list中
        }

        return if (list.size


                == 1)
            list[0]
        else
            "运算失败"                    //最终list中仅有一个结果，否则就是算错了
    }

    companion object {

        //使用集合定义好符号的运算优先级别
        private val basic = HashMap<Char, Int>()

        init {
            basic['-'] = 1
            basic['+'] = 1
            basic['*'] = 2
            basic['/'] = 2
            basic['('] = 0//在运算中  （）的优先级最高，但是此处因程序中需要 故设置为0
        }
    }

}
