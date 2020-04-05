package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button cToF,FtoC;
    private TextView result;
    private EditText enterTemp;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cToF = findViewById(R.id.cToF);
        FtoC = findViewById(R.id.FtoC);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        cToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp *1.8) + 32;
                result.setText(String.valueOf(result0));
            }
        });
        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = (temp - 32) / 1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}