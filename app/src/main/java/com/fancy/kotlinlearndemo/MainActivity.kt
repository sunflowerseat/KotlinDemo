package com.fancy.kotlinlearndemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.fancy.kotlinlearndemo.define_class.IMain
import com.fancy.kotlinlearndemo.define_class.Preference
import com.fancy.kotlinlearndemo.operator_overload.log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.inflate.*

class MainActivity : AppCompatActivity(), IMain {
    var onceEntranceApp: Boolean by Preference(this, "onceEntranceApp", false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.text = "Hello Kotlin,by me"
        onceEntranceApp.log("MainActivity")
        onceEntranceApp = true

        val v = layoutInflater.inflate(R.layout.inflate, null)
        activity_main.addView(v)
        tv_1.text = "add view -> tv_1"
    }
}
