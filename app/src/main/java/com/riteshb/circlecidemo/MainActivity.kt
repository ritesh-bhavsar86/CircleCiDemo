package com.riteshb.circlecidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.riteshb.libjar.MyLibClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myClass = MyLibClass()
        myClass.additionInt(4,3)
    }
}