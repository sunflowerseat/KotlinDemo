package com.fancy.kotlinlearndemo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class KotlinBaseTest {
    fun variable() {
        var a: String = "指定类型变量"
        var b = "推断类型变量"
        val c = "常量"
    }

    @Test
            /* 定义一个无参无返回值的函数 */
    fun f1() {
        println("this is a no param and no return function")
    }

    /* 定义一个有参无返回值的函数 */
    fun f2(param: String): Unit {
        println("this is a no return function")
    }

    /* 定义一个有参有返回值的函数 */
    fun f3(a: Int, b: Int): Int {
        return a + b
    }

    /* 简化f3 ,简化成表达式，返回值自动推断*/
    fun f4(a: Int, b: Int) = a + b

    @Test
    /*空检查特性*/
    fun f5() {
        var cantNull = "Can not be empty"
        var canNull: String? = null
        //普通调用
        println(cantNull.toString())
        //空检查,如果不为空才执行后面的
        println(canNull?.toString())
        //如果为空抛出异常
        println(canNull!!.toString())
    }
}