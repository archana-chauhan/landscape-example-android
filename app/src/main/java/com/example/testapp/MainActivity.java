package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.milkshake);
//        btn1.setAnimation(myAnim);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                view.startAnimation(myAnim);

//                Animator scale = ObjectAnimator.ofPropertyValuesHolder(view,
//                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1, 1.5f, 1),
//                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1, 1.5f, 1)
//                );
//                scale.setDuration(1000);
//                scale.start();


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    btn2.setBackground(getDrawable(R.drawable.bottom_border));
                    btn3.setBackground(getDrawable(R.drawable.bottom_border));
                    btn4.setBackground(getDrawable(R.drawable.bottom_border));
                    btn5.setBackground(getDrawable(R.drawable.bottom_border));
                    btn1.setBackground(getDrawable(R.drawable.round_button));
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    btn1.setBackground(getDrawable(R.drawable.bottom_border));
                    btn3.setBackground(getDrawable(R.drawable.bottom_border));
                    btn4.setBackground(getDrawable(R.drawable.bottom_border));
                    btn5.setBackground(getDrawable(R.drawable.bottom_border));
                    btn2.setBackground(getDrawable(R.drawable.round_button));
                }


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    btn1.setBackground(getDrawable(R.drawable.bottom_border));
                    btn2.setBackground(getDrawable(R.drawable.bottom_border));
                    btn4.setBackground(getDrawable(R.drawable.bottom_border));
                    btn5.setBackground(getDrawable(R.drawable.bottom_border));
                    btn3.setBackground(getDrawable(R.drawable.round_button));
                }


            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    btn1.setBackground(getDrawable(R.drawable.bottom_border));
                    btn3.setBackground(getDrawable(R.drawable.bottom_border));
                    btn2.setBackground(getDrawable(R.drawable.bottom_border));
                    btn5.setBackground(getDrawable(R.drawable.bottom_border));
                    btn4.setBackground(getDrawable(R.drawable.round_button));
                }


            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    btn1.setBackground(getDrawable(R.drawable.bottom_border));
                    btn3.setBackground(getDrawable(R.drawable.bottom_border));
                    btn4.setBackground(getDrawable(R.drawable.bottom_border));
                    btn2.setBackground(getDrawable(R.drawable.bottom_border));
                    btn5.setBackground(getDrawable(R.drawable.round_button));
                }


            }
        });



    }
}