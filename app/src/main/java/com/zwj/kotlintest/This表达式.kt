package com.zwj.kotlintest

/*
class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@{String.()->
                val d = this // funLit's receiver
                val d1 = this@lambda // funLit's receiver
            }


            val funLit2 = { (s: String) ->
                // foo()'s receiver, since enclosing function literal
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}*/
