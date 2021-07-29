package com.example.week3task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting appBar layout to a variable
        val toolbar: Toolbar? = findViewById(R.id.topAppbar)
        //Toolbar is nullable, so a null check is done before toolbar is set to act as an actionbar
        if (toolbar != null){
            setSupportActionBar(toolbar)
        }

        //on Click listener to switch from day to night mode
        switchMode.setOnClickListener {

            if (switchMode.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }







    }
}