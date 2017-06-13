package com.fancy.kotlinlearndemo

import com.fancy.kotlinlearndemo.extension_fun.sout
import com.fancy.kotlinlearndemo.operator_overload.log
import org.junit.Test

/**
 * Created by Fancy on 2017/6/12.
 */
class KotlinOperatorTest {
    @Test
    fun test1() {
        val a = 3
        this log a
        val cc = "hahah"
        this log cc
    }
}