package com.example.firstapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {
    private  static final String dbname="mydb";
    private  static final int version= 1;

    public MyHelper(@Nullable Context context) {
        super(context, dbname, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql =" CREATE TABLE USER(_ID INTEGER PRIMARY KEY AUTOINCREMENT,FIRST_NAME TEXT,LAST_NAME TEXT,PASSWORD TEXT)";
        db.execSQL(sql);

    }

    private void  insertData(String fn, String ln,String pass,SQLiteDatabase sqLiteDatabase){
        ContentValues contentValues = new ContentValues();
        contentValues.put("FN", fn);
        contentValues.put("LN",ln);
        contentValues.put("PASS",pass);
        sqLiteDatabase.insert("USER",null,contentValues);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
