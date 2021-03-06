package com.example.calculator_antiplagiatorrelax_10112021;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ImageButton number1 = findViewById(R.id.button1);
        ImageButton number2 = findViewById(R.id.button2);
        ImageButton number3 = findViewById(R.id.button3);
        ImageButton number4 = findViewById(R.id.button4);
        ImageButton number5 = findViewById(R.id.button5);
        ImageButton number6 = findViewById(R.id.button6);
        ImageButton number7 = findViewById(R.id.button7);
        ImageButton number8 = findViewById(R.id.button8);
        ImageButton number9 = findViewById(R.id.button9);
        ImageButton number0 = findViewById(R.id.button0);
        TextView tablo = findViewById(R.id.tablo);
        //ArrayList<String> memmory = new ArrayList();


        number1.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {

                case MotionEvent.ACTION_DOWN: {
                    number1.setImageResource(R.drawable.n1);
                    tablo.setText("1");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number1.setImageResource(R.drawable.z1);
                    break;
                }
            }
            return false;
        });
        number2.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number2.setImageResource(R.drawable.n2);

                    tablo.setText("2");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number2.setImageResource(R.drawable.z2);
                    break;
                }
            }
            return false;
        });
        number3.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number3.setImageResource(R.drawable.n3);

                    tablo.setText("3");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number3.setImageResource(R.drawable.z3);
                    break;
                }
            }
            return false;
        });
        number4.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number4.setImageResource(R.drawable.n4);
                    tablo.setText("4");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number4.setImageResource(R.drawable.z4);
                    break;
                }
            }
            return false;
        });
        number5.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number5.setImageResource(R.drawable.n5);
                    tablo.setText("5");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number5.setImageResource(R.drawable.z5);
                    break;
                }
            }
            return false;
        });
        number6.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number6.setImageResource(R.drawable.n6);
                    tablo.setText("6");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number6.setImageResource(R.drawable.z6);
                    break;
                }
            }
            return false;
        });
        number7.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number7.setImageResource(R.drawable.n7);
                    tablo.setText("7");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number7.setImageResource(R.drawable.z7);
                    break;
                }
            }
            return false;
        });
        number8.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number8.setImageResource(R.drawable.n8);
                    tablo.setText("8");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number8.setImageResource(R.drawable.z8);
                    break;
                }
            }
            return false;
        });
        number9.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number9.setImageResource(R.drawable.n9);
                    tablo.setText("9");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number9.setImageResource(R.drawable.z9);
                    break;
                }
            }
            return false;
        });
        number0.setOnTouchListener((arg0, arg1) -> {
            switch (arg1.getAction()) {
                case MotionEvent.ACTION_DOWN: {
                    number0.setImageResource(R.drawable.n0);
                    tablo.setText("0");
                    break;
                }
                case MotionEvent.ACTION_UP:{
                    number0.setImageResource(R.drawable.z0);
                    break;
                }
            }
            return false;
        });

    }
}