package com.example.snakenladder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class winpage extends AppCompatActivity {

    TextView p;
    Button b;

    LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winpage);
        p=findViewById(R.id.winner);
        b=findViewById(R.id.button);
        lottie=findViewById(R.id.lottie);


        Intent l = getIntent();
        String s3 = l.getStringExtra("3");
        p.setText(s3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i2);
            }
        });

         }
         }
