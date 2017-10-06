package com.example.user.testtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button calculate;
    EditText height,weight;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText) findViewById(R.id.EditText1);
        weight = (EditText) findViewById(R.id.EditText2);
        calculate = (Button) findViewById(R.id.Calculate_text);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double heights = Double.valueOf(height.getText().toString());
                double weights = Double.valueOf(weight.getText().toString());
                double bmi = weights/((heights/100)*(heights/100));
                String bmitext=" " ;
                if(bmi < 18.5){
                    bmitext = "น้ำหนักน้อยกว่าปกติ";
                }
                else if(bmi < 25){
                    bmitext = "น้ำหนักปกติ";
                }
               else if(bmi<30){
                   bmitext = "น้ำหนักมากกว่าปกติ(ท้วม)";
               }
               else if (bmi > 30){
                    bmitext = "น้ำหนักมากกว่าปกติมาก(อ้วน)";
                }
                Intent newpage = new Intent(MainActivity.this,Main2Activity.class);
                newpage.putExtra("BMI",bmi);
                newpage.putExtra("BmiText",bmitext);
                startActivity(newpage);
            }
        });

    }
}
