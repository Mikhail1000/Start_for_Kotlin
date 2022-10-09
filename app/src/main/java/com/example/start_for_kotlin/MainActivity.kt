package com.example.start_for_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView_1)
        val listCities = arrayListOf<Cities>()
        listCities.add(Cities("Москва", "Российская Федерация"))
        listCities.add(Cities("Екатеринбург", "Российская Федерация"))
        listCities.add(Cities("Токио", "Япония"))
        listCities.add(Cities("Сеул", "Республика Корея"))

        val buttonSettings: Button = findViewById(R.id.button_settings)
        buttonSettings.setOnClickListener {
            val message: String = "Город " + listCities[0].nameCity + " находится в стране " + listCities[0].country
            textView.text = message
            println(CopyCity.copyCity)
            for (city in listCities){
                print(city.country + " ")
                println(city.nameCity)
            }
        }
    }
}

data class Cities(val nameCity: String, val country: String)

object CopyCity {
    private val city = Cities("Москва", "Российская Федерация")
    val copyCity = city.copy()
}
