package com.fancy.kotlinlearndemo.define_class

class Person(val name: String){
    infix fun say(word: String){
        println("${name}说$word")
    }
}