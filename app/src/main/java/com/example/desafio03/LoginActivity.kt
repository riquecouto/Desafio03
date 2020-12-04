package com.example.desafio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            callHome()
        }
        btn_register.setOnClickListener {
            callRegister()
        }
    }

    private fun callHome() = startActivity(Intent(this, HomeActivity::class.java))
    private fun callRegister() = startActivity(Intent(this, RegisterActivity::class.java))
}