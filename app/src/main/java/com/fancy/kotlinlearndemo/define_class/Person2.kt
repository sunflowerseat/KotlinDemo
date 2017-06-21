package com.fancy.kotlinlearndemo.define_class

import kotlin.properties.Delegates

class Person2{
    //添加观察者
    var name : String by PersonDelegate()
    var age : Int by Delegates.observable(0){
        d,old,new ->println("$old -> $new")
    };

    constructor()
    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "Person2(name='$name', age=$age)"
    }
}