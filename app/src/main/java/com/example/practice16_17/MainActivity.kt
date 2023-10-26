package com.example.practice16_17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("dwsfsdf")

        val themeSwitchButton:Button = findViewById(R.id.button)
        themeSwitchButton.setOnClickListener {
            toggleTheme()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when(item.itemId){
            R.id.setthem_light_menu_item -> {toggleTheme_light()}
            R.id.setthem_dark_menu_item ->  {toggleTheme_dark()}
            R.id.about_menu_item -> {about_menu_open()}
        }
        return super.onOptionsItemSelected(item)
    }
    private fun about_menu_open() {
        val intent = Intent(this, Activity_about::class.java)
        startActivity(intent)
    }
    fun toggleTheme_light(){
        val currentNightMode = resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_NO) {
            // Светлая тема, переключаем на темную
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)}
    }
    fun toggleTheme_dark(){
        val currentNightMode = resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_YES) {
            // Темная тема, переключаем на светлую
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
    fun toggleTheme() {
        val currentNightMode = resources.configuration.uiMode and android.content.res.Configuration.UI_MODE_NIGHT_MASK
        if (currentNightMode == android.content.res.Configuration.UI_MODE_NIGHT_NO) {
            // Светлая тема, переключаем на темную
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            // Темная тема, переключаем на светлую
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        recreate() // Пересоздаем активность
    }
}