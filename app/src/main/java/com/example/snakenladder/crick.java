package com.example.snakenladder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class crick extends AppCompatActivity {
    ImageView pl,comp;

    TextView pp,sc1,sc2,pl1,pl2;

    Button b1,b2,b3,b4,b5,b0,info;


    int sum1=0,sum2=0,chance=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stadium);

        pp = findViewById(R.id.textView8);
        pl1 = findViewById(R.id.textView);
        pl2 = findViewById(R.id.textView4);
        sc1 = findViewById(R.id.textView5);
        sc2 = findViewById(R.id.textView6);

        pl = findViewById(R.id.imageView3);
        comp = findViewById(R.id.imageView5);

        b0 = findViewById(R.id.button2);
        b1 = findViewById(R.id.button4);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button5);
        b4 = findViewById(R.id.button6);
        b5 = findViewById(R.id.button7);
        info = findViewById(R.id.button8);

        Intent j = getIntent();

        String s1 = j.getStringExtra("1");
        String s2 = j.getStringExtra("2");
        pl1.setText(s1);
        pl2.setText(s2);
        pp.setText(s1);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.zero1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);

                if (chance == 1) {
                    if (i == 0) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else {
                        sum1 = sum1 + i;
                    }
                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 0) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else {
                        sum2 = sum2 + i;
                    }
                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.one1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);
                if (chance == 1) {

                    if (i == 1) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else {
                        sum1 = sum1 + 1;
                    }
                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 1) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else
                        sum2 = sum2 + 1;

                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.two1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);
                if (chance == 1) {

                    if (i == 2) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else
                        sum1 = sum1 + 2;

                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 2) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else
                        sum2 = sum2 + 2;

                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.three1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);
                if (chance == 1) {

                    if (i == 3) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else
                        sum1 = sum1 + 3;

                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 3) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else
                        sum2 = sum2 + 3;

                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.four1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);
                if (chance == 1) {

                    if (i == 4) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else
                        sum1 = sum1 + 4;

                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 4) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else
                        sum2 = sum2 + 4;

                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pl.setImageResource(R.drawable.five1);
                int i = (int) (Math.random() * (6));
                if (i == 0)
                    comp.setImageResource(R.drawable.zero1);
                else if (i == 1)
                    comp.setImageResource(R.drawable.one1);
                else if (i == 2)
                    comp.setImageResource(R.drawable.two1);
                else if (i == 3)
                    comp.setImageResource(R.drawable.three1);
                else if (i == 4)
                    comp.setImageResource(R.drawable.four1);
                else if (i == 5)
                    comp.setImageResource(R.drawable.five1);
                if (chance == 1) {

                    if (i == 5) {
                        chance = 2;
                        pp.setText(s2);
                        Toast.makeText(crick.this, s2 + " batting starts", Toast.LENGTH_SHORT).show();

                    } else
                        sum1 = sum1 + 5;

                    String s = Integer.toString(sum1);
                    sc1.setText(s);
                } else {

                    if (i == 5) {
                        Intent k = new Intent(getApplicationContext(), winpage.class);
                        if (sum1 > sum2)
                            k.putExtra("3", s1);
                        else
                            k.putExtra("3", s2);
                        startActivity(k);
                    } else
                        sum2 = sum2 + 5;

                    String s = Integer.toString(sum2);
                    sc2.setText(s);
                }
            }
        });

    }
            public void openDialog(){
                info in=new info();
                in.show(getSupportFragmentManager(),"example");
        }

}
