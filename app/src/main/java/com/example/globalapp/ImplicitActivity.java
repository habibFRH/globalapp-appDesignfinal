package com.example.globalapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn = findViewById(R.id.btn);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn2 = findViewById(R.id.btn2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn3 = findViewById(R.id.btn3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btn5 = findViewById(R.id.btn4);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText ed1 = findViewById(R.id.ed1);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText ed2 = findViewById(R.id.ed2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText ed3 = findViewById(R.id.ed3);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText ed4 = findViewById(R.id.ed4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = ed1.getText().toString();

                if (val1.isEmpty()) {
                    Toast.makeText(ImplicitActivity.this, "veillez entrer une text", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_TEXT, val1);
                    intent.setType("text/plain");
                    startActivity(intent);
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val2 = ed2.getText().toString();
                if (val2.isEmpty()) {
                    Toast.makeText(ImplicitActivity.this, "veillez entrer une location", Toast.LENGTH_SHORT).show();
                } else {
                    String geo = "geo:" + val2;
                    Uri loc = Uri.parse("geo:37.4216239,-892.06364?z=18");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(geo));
                    intent1.setAction(Intent.ACTION_SEND);
                    startActivity(intent1);
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val3 = ed3.getText().toString();
                if (val3.isEmpty()) {
                    Toast.makeText(ImplicitActivity.this, "veillez entrer un numero", Toast.LENGTH_SHORT).show();

                } else {


                    String vtel = "tel:" + val3;
                    Uri tel = Uri.parse(vtel);
                    Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse(vtel));
                    startActivity(intent1);


                }
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val4 = ed4.getText().toString();

                if (val4.isEmpty()) {
                    Toast.makeText(ImplicitActivity.this, "veillez entrer une contact", Toast.LENGTH_SHORT).show();

                } else {
                    String cont = "content://contacts/" + val4;
                    Uri contacts = Uri.parse("content://contacts/people");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(cont));
                    startActivity(intent1);
                }
            }
        });
    }}

