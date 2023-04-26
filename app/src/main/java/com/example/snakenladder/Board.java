package com.example.snakenladder;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

public class Board extends AppCompatActivity {
Button roll,info;
TextView bp1,bp2,bb1,bb2,n1,n2,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
ImageView dice;
int sum1=0,sum2=0;
int chance=1;
    private void backGroundToChange(int position,int k) {

        String resourceName = "b" + position;
        int resourceID = getResources().getIdentifier(resourceName, "id",
                getPackageName());
        if (resourceID != 0) {
            if(k==1)
                 bb1 = (TextView) findViewById(resourceID);
            else
                bb2 = (TextView) findViewById(resourceID);
//            if (b != null) {
                // Take action on TextView tv here...

//            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
        roll= findViewById(R.id.roll);
        dice= (ImageView)findViewById(R.id.dice);
        n1= findViewById(R.id.editTextTextPersonName);
        n2= findViewById(R.id.editTextTextPersonName2);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);
        b4= findViewById(R.id.b4);
        b5= findViewById(R.id.b5);
        b6= findViewById(R.id.b6);
        b7= findViewById(R.id.b7);
        b8= findViewById(R.id.b8);
        b9= findViewById(R.id.b9);
        b10= findViewById(R.id.b10);
        b11= findViewById(R.id.b11);
        b12= findViewById(R.id.b12);
        b13= findViewById(R.id.b13);
        b14= findViewById(R.id.b14);
        b15= findViewById(R.id.b15);
        b16= findViewById(R.id.b16);
        b17= findViewById(R.id.b17);
        b18= findViewById(R.id.b18);
        b19= findViewById(R.id.b19);
        b20= findViewById(R.id.b20);
        b21= findViewById(R.id.b21);
        b22= findViewById(R.id.b22);
        b23= findViewById(R.id.b23);
        b24= findViewById(R.id.b24);
        b25= findViewById(R.id.b25);
        info=findViewById(R.id.info1);
        Intent j = getIntent();
        bb1=b1;
        bb2=b1;
        bp1=b1;
        bp2=b1;
        String s1 = j.getStringExtra("1");
        String s2 = j.getStringExtra("2");
        n1.setText(s1);
        n2.setText(s2);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=(int)(Math.random()*(6)+1);
                if(chance==1) {
                    chance = 2;
                    if (i == 1) {
                        sum1=sum1+1;
                        dice.setImageResource(R.drawable.one);
                    } else if (i == 2) {sum1=sum1+2;
                        dice.setImageResource(R.drawable.two);
                    } else if (i == 3) {sum1=sum1+3;
                        dice.setImageResource(R.drawable.three);
                    } else if (i == 4) {sum1=sum1+4;
                        dice.setImageResource(R.drawable.four);
                    } else if (i == 5) {sum1=sum1+5;
                        dice.setImageResource(R.drawable.five);
                    } else if (i == 6) {sum1=sum1+6;
                        chance = 1;
                        dice.setImageResource(R.drawable.six);
                    }
                    if(sum1>=25){
                        Intent i1 = new Intent(getApplicationContext(),winpage.class);
                        i1.putExtra("3",s1);
                        startActivity(i1);
                    }
                    if(sum1==4 || sum1==7 || sum1==11 || sum1==15 || sum1==18 || sum1==24) {
                        sum1 = 1;
                        chance=2;
                    }
                    backGroundToChange(sum1,1);
                    bp1.setBackgroundColor(Color.parseColor("#407A7A7A"));
                    bb1.setBackgroundColor(Color.rgb(100, 200, 200));
                    bp1=bb1;

                }
                else if(chance==2) {
                    chance = 1;
                    if (i == 1) {
                        sum2=sum2+1;
                        dice.setImageResource(R.drawable.one);
                    } else if (i == 2) {sum2=sum2+2;
                        dice.setImageResource(R.drawable.two);
                    } else if (i == 3) {sum2=sum2+3;
                        dice.setImageResource(R.drawable.three);
                    } else if (i == 4) {sum2=sum2+4;
                        dice.setImageResource(R.drawable.four);
                    } else if (i == 5) {sum2=sum2+5;
                        dice.setImageResource(R.drawable.five);
                    } else if (i == 6) {sum2=sum2+6;
                        chance = 2;
                        dice.setImageResource(R.drawable.six);
                    }
                    if(sum2>=25){
                        Intent i1 = new Intent(getApplicationContext(),winpage.class);
                        i1.putExtra("3",s2);
                        startActivity(i1);
                    }
                    if(sum2==4 || sum2==7 || sum2==11 || sum2==15 || sum2==18 || sum2==24) {
                        sum2 = 1;
                        chance=1;
                    }
                    backGroundToChange(sum2,2);
                    bp2.setBackgroundColor(Color.parseColor("#407A7A7A"));
                    bb2.setBackgroundColor(Color.rgb(200, 200, 200));
                    bp2=bb2;
                }
                if(sum1==sum2){
                    bb2.setBackgroundColor(Color.parseColor("#3399ff"));
                }

            }
        });

    }
    public void openDialog(){
        infobo in=new infobo();
        in.show(getSupportFragmentManager(),"example");
    }
}
