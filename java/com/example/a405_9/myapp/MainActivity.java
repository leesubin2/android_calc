package com.example.a405_9.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);


        findViewById(R.id.plusBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"덧셈클릭",Toast.LENGTH_LONG).show();
                final int a = Integer.parseInt(num1.getText().toString());
                final int b = Integer.parseInt(num2.getText().toString());
                int c = a + b;
            }
        });

        findViewById(R.id.minusBtntn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.multiBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.divBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.eqoaBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
