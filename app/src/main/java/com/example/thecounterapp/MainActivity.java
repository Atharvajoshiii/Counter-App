package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcometext;
    TextView countertxt;
    Button btn;
    Button reset;
    int counter =0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        welcometext=findViewById(R.id.welcome);
        countertxt=findViewById(R.id.text);
        reset = findViewById(R.id.rst);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countertxt.setText(""+increaseCounter());
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countertxt.setText("0");
            }
        });



    }

    public int increaseCounter(){
       return  ++counter;

    }

}