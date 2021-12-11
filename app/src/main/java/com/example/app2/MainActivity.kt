package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_login)
        button.setOnClickListener{
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        val buttonRegister = findViewById<Button>(R.id.btn_register)
        buttonRegister.setOnClickListener {
            Intent(this, RegisterActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}
