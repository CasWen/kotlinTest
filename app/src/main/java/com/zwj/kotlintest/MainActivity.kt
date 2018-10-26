package com.zwj.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    private var tv_click:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var view = View()
//        init()
        var count=0
//        tv_click.text = "good"

        tv_click?.setOnClickListener{
            println(count++)
            Toast.makeText(this@MainActivity,"点击了监听", Toast.LENGTH_LONG).show()//this@MainActivity 是this表达式

        }
        view.setOnClickListenter{
            it->it.toHome()

        Toast.makeText(this@MainActivity,"返回首页成功", Toast.LENGTH_LONG).show()//this@MainActivity 是this表达式

        }
    }




}
class View{
    fun toHome(){


    }
    fun setOnClickListenter(listener: (v:View) -> Unit){
        listener(this)
    }
}


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        var book = Book()
//        var name = book.apply {
//            var price = getPrice()
//            if (price < 50) {
//                Toast.makeText(this@MainActivity,"小于50", Toast.LENGTH_LONG).show()//this@Main2Activity 是this表达式
//                type = "便宜书"
//            }else{
//                Toast.makeText(this@MainActivity,"大于50", Toast.LENGTH_LONG).show()
//                type = "贵书"
//            }
//        }.getName()
//    }
//}
//class Book{
//    var type:String? = null
//    fun getName():String {
//        return "youxin"
//    }
//    fun getPrice():Int {
//        return 100
//    }
//}