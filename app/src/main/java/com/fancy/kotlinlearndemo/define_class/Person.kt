package com.fancy.kotlinlearndemo.define_class

data class Person(var name: String) {
    infix fun say(word: String) {
        println("${name}说$word")
    }

    //重写Getter方法
    var note: String = ""
        get() = field + ":" + name

    lateinit var age:String


}