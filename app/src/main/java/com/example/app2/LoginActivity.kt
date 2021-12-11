package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonBack = findViewById<ImageButton>(R.id.btn_back1)
        buttonBack.setOnClickListener {
            finish()
        }

        val buttonRegister2 = findViewById<Button>(R.id.btn_register2)
        buttonRegister2.setOnClickListener {
            Intent(this, RegisterActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}