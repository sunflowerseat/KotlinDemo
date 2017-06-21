package com.fancy.kotlinlearndemo.define_class

import com.fancy.kotlinlearndemo.extension_fun.sout
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//简单的
class PersonDelegate : ReadWriteProperty<Person2, String> {
    var value: String = ""
    override fun getValue(thisRef: Person2, property: KProperty<*>): String {
        return value
    }

    override operator fun setValue(thisRef: Person2, property: KProperty<*>, value: String) {
        this.value = value
        "name update".sout()
    }


}