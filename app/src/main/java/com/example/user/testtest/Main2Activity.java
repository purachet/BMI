package com.example.user.testtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.user.testtest.R.drawable.bmi;

public class Main2Activity extends AppCompatActivity {
        TextView t;
        TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView) findViewById(R.id.show);
        t1 = (TextView) findViewById(R.id.show1);

        Intent page2 = getIntent();
        double t2 = page2.getDoubleExtra("BMI",0);
        String t3 = page2.getStringExtra("BmiText");

        t.setText(String.format("ค่า bmi ที่ได้คือ %.2f",t2));
        t1.setText("อยู่ในเกณฑ์ : " + t3);

    }
}
