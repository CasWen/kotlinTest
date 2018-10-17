package com.zwj.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        init()
//    }

    fun main(args:Array<String>){
        init()
    }

     fun init() {

         val str="abc"
        System.out.println(str)
    }
}
