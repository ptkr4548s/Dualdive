package com.example.snakenladder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    Button st,st2;
    EditText nam1,nam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st= findViewById(R.id.start);
        st2= findViewById(R.id.start2);
        nam1= findViewById(R.id.P1);
        nam2= findViewById(R.id.P2);



      st.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String s1 = nam1.getText().toString();
              String s2 = nam2.getText().toString();
              if(s1.length()==0 || s2.length()==0){
                  Toast.makeText(MainActivity.this, "Please enter the name", Toast.LENGTH_SHORT).show();
              }
              else {
                  Intent i = new Intent(getApplicationContext(), Board.class);
                  i.putExtra("1", s1);
                  i.putExtra("2", s2);
                  startActivity(i);
              }
          }
      });


      st2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String s1 = nam1.getText().toString();
              String s2 = nam2.getText().toString();
              if(s1.length()==0 || s2.length()==0){
                  Toast.makeText(MainActivity.this, "Please enter the name", Toast.LENGTH_SHORT).show();
              }
              else {
                  Intent i2 = new Intent(getApplicationContext(), crick.class);
                  i2.putExtra("1", s1);
                  i2.putExtra("2", s2);
                  startActivity(i2);
              }
          }
      });
    }
}