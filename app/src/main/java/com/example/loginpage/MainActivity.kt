package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.etUser)
        val pass = findViewById<EditText>(R.id.etPass)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            if (user.text.toString() == "ali" && pass.text.toString() == "1234") {
                startActivity(Intent(this, MainActivity2::class.java).putExtra("name", "ali"))
            } else {
                Toast.makeText(this, "نام کاربری یا رمز اشتباه است", Toast.LENGTH_SHORT).show()
            }
        }
    }
}