package com.example.globalapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button moybtn = findViewById(R.id.moyennebtn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button modbtn = findViewById(R.id.modifiertextbtn);

        moybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExplicitActivity.this, MoyenneActivity.class);
                startActivity(intent);
            }
        });

        modbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExplicitActivity.this, TextActivity.class);
                startActivity(intent);
            }
        });

    }
}
