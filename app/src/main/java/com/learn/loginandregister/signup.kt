package com.learn.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class signup : AppCompatActivity() {

    private lateinit var uname:EditText
    private lateinit var pword:EditText
    private lateinit var cpword:EditText
    private lateinit var signbtn:Button
    private lateinit var db: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        uname=findViewById(R.id.SignupUserName)
        pword=findViewById(R.id.SignupPassword)
        cpword=findViewById(R.id.SignupConfirmPassword)
        signbtn=findViewById(R.id.SignupSubmit)
        db= DBHelper(this)

        signbtn.setOnClickListener(){
            val unametext= uname.text.toString()
            val pwordtext= pword.text.toString()
            val cpwordtext= cpword.text.toString()
            val saveData= db.insertData(unametext,pwordtext)

            if (TextUtils.isEmpty(unametext)||TextUtils.isEmpty(pwordtext)||TextUtils.isEmpty(cpwordtext)){
                Toast.makeText(this,"Add details in the Edit Text",Toast.LENGTH_SHORT).show()
            }
            else{
                if (pwordtext.equals(cpwordtext)){
                    if (saveData==true){
                        Toast.makeText(this,"Account Created",Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext,login::class.java)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this,"Account Already Created",Toast.LENGTH_SHORT).show()
                    }
                }
                else{
                    Toast.makeText(this,"Password does not match",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}