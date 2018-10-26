package com.zwj.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() ,View.OnClickListener {


    var button0: Button? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null
    var button5: Button? = null
    var button6: Button? = null
    var button7: Button? = null
    var button8: Button? = null
    var button9: Button? = null
    var button11: Button? = null
    var button12: Button? = null
    var button13: Button? = null
    var button14: Button? = null
    var button15: Button? = null
    var textView1: TextView? = null
    var pending = StringBuilder()

    fun initView(){
        button0 = findViewById(R.id.button0) as Button
        button1 = findViewById(R.id.button1) as Button
        button2 = findViewById(R.id.button2) as Button
        button3 = findViewById(R.id.button3) as Button
        button4 = findViewById(R.id.button4) as Button
        button5 = findViewById(R.id.button5) as Button
        button6 = findViewById(R.id.button6) as Button
        button7 = findViewById(R.id.button7) as Button
        button8 = findViewById(R.id.button8) as Button
        button9 = findViewById(R.id.button9) as Button
        button11 = findViewById(R.id.button11) as Button
        button12 = findViewById(R.id.button12) as Button
        button13 = findViewById(R.id.button13) as Button
        button14 = findViewById(R.id.button14) as Button
        button15 = findViewById(R.id.button15) as Button
        textView1 = findViewById(R.id.textView1) as TextView


        button0!!.setOnClickListener(this)
        button1!!.setOnClickListener(this)
        button2!!.setOnClickListener(this)
        button3!!.setOnClickListener(this)
        button4!!.setOnClickListener(this)
        button5!!.setOnClickListener(this)
        button6!!.setOnClickListener(this)
        button7!!.setOnClickListener(this)
        button8!!.setOnClickListener(this)
        button9!!.setOnClickListener(this)
        button11!!.setOnClickListener(this)
        button12!!.setOnClickListener(this)
        button13!!.setOnClickListener(this)
        button14!!.setOnClickListener(this)
        button15!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v!!.id){
            R.id.button0 -> {
                pending = pending.append("0")
                textView1!!.text = pending
            }
            R.id.button1 -> {
                pending = pending.append("1")
                textView1!!.text = pending
            }
            R.id.button2 -> {
                pending = pending.append("2")
                textView1!!.text = pending
            }
            R.id.button3 -> {
                pending = pending.append("3")
                textView1!!.text = pending
            }
            R.id.button4 -> {
                pending = pending.append("4")
                textView1!!.text = pending
            }
            R.id.button5 -> {
                pending = pending.append("5")
                textView1!!.text = pending
            }
            R.id.button6 -> {
                pending = pending.append("6")
                textView1!!.text = pending
            }
            R.id.button7 -> {
                pending = pending.append("7")
                textView1!!.text = pending
            }
            R.id.button8 -> {
                pending = pending.append("8")
                textView1!!.text = pending
            }
            R.id.button9 -> {
                pending = pending.append("9")
                textView1!!.text = pending
            }
            R.id.button11 -> {
                pending = pending.append("+")
                textView1!!.text = pending
            }
            R.id.button12 -> {
                pending = pending.append("-")
                textView1!!.text = pending
            }
            R.id.button13 -> {
                pending = pending.append("*")
                textView1!!.text = pending
            }
            R.id.button14 -> {
                pending = pending.append("/")
                textView1!!.text = pending
            }
            R.id.button15 -> {
                pending = pending.append("=")
                textView1!!.text = pending
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initView()


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
}
