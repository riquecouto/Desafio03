package com.example.desafio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_save.setOnClickListener {
            callHome()
        }
    }

    private fun callHome() = startActivity(Intent(this, MainActivity::class.java))
}