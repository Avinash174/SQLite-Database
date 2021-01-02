package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fn,ln,pass;
    Button succ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        succ=findViewById(R.id.succ);
        fn=findViewById(R.id.fn);
        ln=findViewById(R.id.ln);
        pass=findViewById(R.id.pass);
        MyHelper myHelper = new MyHelper(this);
        SQLiteDatabase sqLiteDatabase =myHelper.getReadableDatabase();
    }



}