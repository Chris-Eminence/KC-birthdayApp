package com.example.myapplication

import android.graphics.Color
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mLayout = findViewById<LinearLayout>(R.id.layout_)
        val mBirthdayImage = findViewById<ImageView>(R.id.birthdayImage)
        val mBtn = findViewById<Button>(R.id.btn)
        mBtn.setOnClickListener {
            mBirthdayImage.visibility = View.VISIBLE
            mLayout.setBackgroundColor(Color.MAGENTA)


        }
    }
}