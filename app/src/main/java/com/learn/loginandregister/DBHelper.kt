package com.learn.loginandregister

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context):SQLiteOpenHelper(context,"UserData",null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table UserData(username TEXT primary key,password TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("drop table if exists UserData")
    }
    fun insertData(username:String,password:String): Boolean {
        val db =this.writableDatabase
        val cv = ContentValues()
        cv.put("username",username)
        cv.put("password",password)
        val result = db.insert("UserData",null,cv)
        if (result==1.toLong()){
            return false
        }
        return true
    }
    fun checkUserPass(username: String,password: String): Boolean {
        val db=this.writableDatabase
        val query="select * from UserData where username = '$username' and password = '$password'"
        val cursor= db.rawQuery(query,null)
        if (cursor.count<=0){
            cursor.close()
            return false
        }
        cursor.close()
        return true
    }
}