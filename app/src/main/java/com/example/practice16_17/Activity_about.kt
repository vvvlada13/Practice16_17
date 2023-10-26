package com.example.practice16_17
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class Activity_about: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setTitle("О программе")
    }

    fun BtnClickFinish(view: View) {
        finish()
    }
}
