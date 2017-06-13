package com.fancy.kotlinlearndemo

import com.fancy.kotlinlearndemo.define_class.OpenClass
import org.junit.Test

/**
 * Created by Fancy on 2017/6/12.
 */
/** Kotlin关键字,*/
class KotlinKeywordTest {
    /**in 关键字*/
    fun testIn() {
        var a = 3
        if (a in 1..5) {
            println("a in 1~5")
        }
    }

    @Test
    /**is 关键字*/
    fun testIs() {
        var a: Any? = null;
        a = 3L
        if (a is Int) {
            println("a is int")
        } else if (a is Long) {
            println("a is long")
        } else {
            println("a not int or long")
        }
    }

    /* 简化testIs() */
    fun testWhen1() {
        var a: Any? = null;
        a = 3L
        when (a) {
            is Int -> println("a is int")
            is Long -> println("a is long")
            else -> println("a not int or long")
        }
    }

    /* when的用法 */
    fun testWhen2() {
        var a = 2;
        when (a) {
            in 1..5 -> println("a in 1~5")
            in 6..10 -> println("a in 6~10")
            else -> println("a > 10")
        }
    }

    @Test
    /* for的用法*/
    fun testFor() {
        var list = listOf<Int>(1, 2, 3, 4, 5)
        for (i in list.indices) {
            println(list.get(i))
        }
    }

    /* for的用法*/
    fun testFor2() {
        var list = listOf<Int>(1, 2, 3, 4, 5)
        //相当于forEach
        for (item in list) {
            println(item)
        }
    }
}