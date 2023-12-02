package com.example.globalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button impbtn = findViewById(R.id.implicitbtn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button expbtn = findViewById(R.id.explicitbtn);



        expbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExplicitActivity.class);
                startActivity(intent);
            }
        });

        impbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImplicitActivity.class);
                startActivity(intent);
            }
        });

    }
}