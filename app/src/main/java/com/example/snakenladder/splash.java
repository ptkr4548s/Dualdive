package com.example.snakenladder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {

    TextView game;
     LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        game= findViewById(R.id.appname);
        lottie=findViewById(R.id.lottie);


        game.animate().translationY(-1200).setDuration(2000).setStartDelay(800);
        lottie.animate().translationX(1000).setDuration(2000).setStartDelay(5900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        },5000);
    }
}