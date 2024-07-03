package com.learn.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    private lateinit var login: Button
    private lateinit var editUser: EditText
    private lateinit var editPassword: EditText
    private lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.LoginSubmit)
        editUser = findViewById(R.id.LoginUserName)
        editPassword =findViewById(R.id.LoginPassword)

        dbHelper= DBHelper(this)

        login.setOnClickListener(){
            val enteruser = editUser.text.toString()
            val enterpassword = editPassword.text.toString()

            if (TextUtils.isEmpty(enteruser)||TextUtils.isEmpty(enterpassword)){
                Toast.makeText(this,"Enter username and password",Toast.LENGTH_SHORT).show()
            }
            else{
                val checkuser = dbHelper.checkUserPass(enteruser,enterpassword)
                if (checkuser==true){
                    Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
                    val intent= Intent(this,Home::class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}