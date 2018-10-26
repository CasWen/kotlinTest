package com.zwj.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import java.util.Arrays

class Main3Activity : AppCompatActivity(), android.view.View.OnClickListener {
    internal var btn_0: Button? = null
    internal var btn_1: Button? = null
    internal var btn_2: Button? = null
    internal var btn_3: Button? = null
    internal var btn_4: Button? = null
    internal var btn_5: Button? = null
    internal var btn_6: Button? = null
    internal var btn_7: Button? = null
    internal var btn_8: Button? = null
    internal var btn_9: Button? = null
    internal var btn_point: Button? = null //小数点
    internal var btn_clear: Button? = null //清除
    internal var btn_del: Button? = null   //删除
    internal var btn_plus: Button? = null
    internal var btn_minus: Button? = null
    internal var btn_multiply: Button? = null
    internal var btn_divide: Button? = null
    internal var btn_equal: Button? = null
    internal var btn_left: Button? = null
    internal var btn_right: Button? = null
    private var et_input: TextView? = null
    private var pending = StringBuilder()

    private fun initView() {
        btn_0 = findViewById(R.id.btn_0) as Button
        btn_1 = findViewById(R.id.btn_1) as Button
        btn_2 = findViewById(R.id.btn_2) as Button
        btn_3 = findViewById(R.id.btn_3) as Button
        btn_4 = findViewById(R.id.btn_4) as Button
        btn_5 = findViewById(R.id.btn_5) as Button
        btn_6 = findViewById(R.id.btn_6) as Button
        btn_7 = findViewById(R.id.btn_7) as Button
        btn_8 = findViewById(R.id.btn_8) as Button
        btn_9 = findViewById(R.id.btn_9) as Button
        btn_point = findViewById(R.id.btn_point) as Button
        btn_clear = findViewById(R.id.btn_clear) as Button
        btn_del = findViewById(R.id.btn_del) as Button
        btn_plus = findViewById(R.id.btn_plus) as Button
        btn_minus = findViewById(R.id.btn_minus) as Button
        btn_multiply = findViewById(R.id.btn_multiply) as Button
        btn_divide = findViewById(R.id.btn_divide) as Button
        btn_equal = findViewById(R.id.btn_equal) as Button
        et_input = findViewById(R.id.et_input) as TextView
        btn_left = findViewById(R.id.btn_left) as Button
        btn_right = findViewById(R.id.btn_right) as Button

        btn_0!!.setOnClickListener(this)
        btn_1!!.setOnClickListener(this)
        btn_2!!.setOnClickListener(this)
        btn_3!!.setOnClickListener(this)
        btn_4!!.setOnClickListener(this)
        btn_5!!.setOnClickListener(this)
        btn_6!!.setOnClickListener(this)
        btn_7!!.setOnClickListener(this)
        btn_8!!.setOnClickListener(this)
        btn_9!!.setOnClickListener(this)
        btn_point!!.setOnClickListener(this)
        btn_plus!!.setOnClickListener(this)
        btn_equal!!.setOnClickListener(this)
        btn_minus!!.setOnClickListener(this)
        btn_multiply!!.setOnClickListener(this)
        btn_del!!.setOnClickListener(this)
        btn_divide!!.setOnClickListener(this)
        btn_clear!!.setOnClickListener(this)
        btn_divide!!.setOnClickListener(this)
        btn_left!!.setOnClickListener(this)
        btn_right!!.setOnClickListener(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initView()
    }


    private fun judje1(): Boolean {
        val a = "+-*/."
        val b = IntArray(a.length)
        val max: Int
        for (i in 0 until a.length) {
            val c = "" + a[i]
            b[i] = pending.lastIndexOf(c)
        }
        Arrays.sort(b)
        if (b[a.length - 1] == -1) {
            max = 0
        } else {
            max = b[a.length - 1]
        }
        return if (pending.indexOf(".", max) == -1) {
            true
        } else {
            false
        }
    }

    private fun judje2(): Int {
        var a = 0
        var b = 0
        for (i in 0 until pending.length) {
            if (pending[i] == '(') {
                a++
            }
            if (pending[i] == ')') {
                b++
            }
        }
        if (a == b)
            return 0
        return if (a > b) 1 else 2
    }


    override fun onClick(v: android.view.View) {
        var last = 0
        if (pending.length != 0) {
            last = pending.codePointAt(pending.length - 1)

        }
        when (v.id) {
            R.id.btn_0 -> {
                pending = pending.append("0")
                et_input!!.text = pending
            }
            R.id.btn_1 -> {
                pending = pending.append("1")
                et_input!!.text = pending
            }
            R.id.btn_2 -> {
                pending = pending.append("2")
                et_input!!.text = pending
            }
            R.id.btn_3 -> {
                pending = pending.append("3")
                et_input!!.text = pending
            }
            R.id.btn_4 -> {
                pending = pending.append("4")
                et_input!!.text = pending
            }
            R.id.btn_5 -> {
                pending = pending.append("5")
                et_input!!.text = pending
            }
            R.id.btn_6 -> {
                pending = pending.append("6")
                et_input!!.text = pending
            }
            R.id.btn_7 -> {
                pending = pending.append("7")
                et_input!!.text = pending
            }
            R.id.btn_8 -> {
                pending = pending.append("8")
                et_input!!.text = pending
            }
            R.id.btn_9 -> {
                pending = pending.append("9")
                et_input!!.text = pending
            }
            R.id.btn_plus -> {
                //if (last >= '0' && last <= '9' ) {
                pending = pending.append("+")
                // }
                et_input!!.text = pending
            }
            R.id.btn_minus -> {
                //if (last >= '0' && last <= '9') {
                pending = pending.append("-")
                //  }
                et_input!!.text = pending
            }
            R.id.btn_multiply -> {
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("*")
                // }
                et_input!!.text = pending
            }
            R.id.btn_divide -> {
                // if (last >= '0' && last <= '9' ) {
                pending = pending.append("/")
                // }
                et_input!!.text = pending
            }
            R.id.btn_point -> if (judje1()) {
                pending = pending.append(".")
                et_input!!.text = pending
            }
            R.id.btn_right// )右括号
            -> if ((last >= '0'.toInt() && last <= '9'.toInt() || last == ')'.toInt()) && judje2() == 1) {
                pending = pending.append(")")
                et_input!!.text = pending
            }
            R.id.btn_left// （左括号
            -> if (last != '('.toInt() || last <= '0'.toInt() && last >= '9'.toInt()) {
                pending = pending.append("(")
                et_input!!.text = pending
            }

            R.id.btn_del //删除
            -> if (pending.length != 0) {
                pending = pending.delete(pending.length - 1, pending.length)
                et_input!!.text = pending
            }
            R.id.btn_clear //清空
            -> {
                pending = pending.delete(0, pending.length)
                et_input!!.text = pending
            }
            R.id.btn_equal // =等于
            -> if (pending.length > 1) {
                val inf = InfixInToDuffix()
                var jieguo: String
                try {
                    val a = inf.toSuffix(pending)
                    jieguo = inf.dealEquation(a)

                } catch (ex: Exception) {
                    jieguo = "出错"
                }

                et_input!!.text = pending.toString() + "=" + jieguo
                pending = pending.delete(0, pending.length)
                if (Character.isDigit(jieguo[0])) {
                    pending = pending.append(jieguo)
                }
            }
            else -> {
            }
        }
    }
}