package com.example.viewgroup

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class DynamicActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)
        val button = findViewById<Button>(R.id.addButton)
        button.setOnClickListener {
            //внутри сохраним текст, который пользователь ввёл
            val textInputter = findViewById<EditText>(R.id.textInput)
            val textToAdd2 = textInputter.text.toString()

            //получить текст можно таким образом - мы обращаемся к свойству текст,
        // свойство текст имеет тип editable,
        // т.е. его можно редактировать, но мы хотим получить просто строку, поэтому мы вызываем метод toString
        }
        //Мы хотим добавить в контейнер textView, текст у которой будет равен тексту textToAdd
        val textViewtoAdd = TextView(this).apply{
             val textToAdd3 = findViewById<EditText>(R.id.textInput)
            text = textToAdd3.toString()
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            //что это такое спросить у Славы
            ).apply {
               gravity = when(Random.nextInt(3)){
                    0 -> Gravity.CENTER
                    1 -> Gravity.END
                    else -> Gravity.START
                }
            }

val contContainer = findViewById<LinearLayout>(R.id.container)
            contContainer.addView(textViewtoAdd)
        }
        //Мы вызываем конструктор на классе текстВью, необходимо передать контекст(this в конструктор),
    // также в конструктор можно передавать дополнительные атрибуты и стили.
        //Дальше необходимо установить текст в нашу textView, для этого воспользуемся функцией apply,
    // apply принимает лямбда функцию, в которой содержится код, который нужно применить к объекту,
    // у которого вызывается функия apply, в данном случае к объекту textView
        //Для этой вью мы указываем свойство текст, присваеваем ему значение textToAdd
        //чтобы указать размер для вью будем указывать layout параметры
    }
}