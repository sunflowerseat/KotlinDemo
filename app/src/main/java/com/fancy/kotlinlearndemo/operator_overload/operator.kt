package com.fancy.kotlinlearndemo.operator_overload

import android.util.Log
import android.view.View
import android.view.ViewGroup
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

/**
 * Created by Fancy on 2017/6/12.
 */
infix fun Any.log(message: Any) {
    try {
        Log.d(this.javaClass.simpleName, message.toString())
    } catch (e: Exception) {
        println(this.javaClass.simpleName + ":" + message.toString())
    }
}

infix fun Any.log(tag: String) {
    try {
        Log.d(tag, toString())
    } catch (e: Exception) {
        println(tag + ":" + toString())
    }
}

operator fun ViewGroup.get(pos: Int): View = getChildAt(pos)