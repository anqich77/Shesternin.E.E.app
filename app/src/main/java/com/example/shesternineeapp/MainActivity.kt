package com.example.shesternineeapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Массив цветов для изменения
    private val colors = listOf(Color.BLUE, Color.RED, Color.YELLOW)
    private var currentColorIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorSquare = findViewById<View>(R.id.colorSquare)
        val colorButton = findViewById<Button>(R.id.colorButton)

        colorButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorSquare.setBackgroundColor(colors[currentColorIndex])
        }
    }
}