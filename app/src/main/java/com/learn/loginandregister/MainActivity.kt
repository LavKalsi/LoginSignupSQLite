package com.learn.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnsignup: Button
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsignup=findViewById(R.id.homeSignup)
        btnlogin=findViewById(R.id.homeLogin)

        btnsignup.setOnClickListener(){
            val intent = Intent(this,signup::class.java)
            startActivity(intent)
        }
        btnlogin.setOnClickListener(){
            val intent = Intent(this,login::class.java)
            startActivity(intent)        }
    }
}