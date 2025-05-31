package com.example.shesternineeapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Массив цветов для изменения
    private val colors = listOf(Color.BLUE, Color.RED, Color.YELLOW)
    private var currentColorIndex = 0

    // Переменная для хранения текущего числа
    private var currentNumber = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим элементы интерфейса
        val colorSquare = findViewById<View>(R.id.colorSquare)
        val colorButton = findViewById<Button>(R.id.colorButton)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val incrementButton = findViewById<Button>(R.id.incrementButton)

        // Логика для кнопки изменения цвета
        colorButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorSquare.setBackgroundColor(colors[currentColorIndex])
        }

        // Логика для кнопки увеличения числа
        incrementButton.setOnClickListener {
            // Увеличиваем число
            currentNumber++
            // Если число превышает 10, возвращаем его к 1
            if (currentNumber > 10) {
                currentNumber = 1
            }
            // Обновляем текстовое поле
            numberTextView.text = currentNumber.toString()
        }
    }
}