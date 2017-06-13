package com.fancy.kotlinlearndemo.operator_overload

import android.nfc.NdefMessage
import android.nfc.Tag
import android.util.Log

/**
 * Created by Fancy on 2017/6/12.
 */
//infix fun Any.log(tag: Any) {
//    try {
//        Log.d(tag.javaClass.simpleName, toString())
//    } catch (e: Exception) {
//
//    } finally {
//        println(tag.javaClass.simpleName + ":" + toString())
//    }
//}

infix fun Any.log(message: Any) {
    try {
        Log.d(this.javaClass.simpleName, message.toString())
    } catch (e: Exception) {

    } finally {
        println(this.javaClass.simpleName + ":" + message.toString())
    }
}