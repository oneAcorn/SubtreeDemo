package com.acorn.subtreedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acorn.commonmodule.TestUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testUtil = TestUtil()
        testUtil.abc()
    }
}