package com.example.ondotpoc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.maths.ArithMetic
import com.example.maths.Multiplication

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = ArithMetic().add(1f, 3f, 5f)
        findViewById<TextView>(R.id.label).text = result.toString()

        var data = Multiplication()
        data.div()
    }
}
