package com.example.unitconversion;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class inchesToMm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inchestomm);

        Button btn1 = (Button) findViewById(R.id.findInchesToMm);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.inchesValue);
                double result = Double.parseDouble(value1.getText().toString());
                double result1 = result*25.4D;
                TextView textview1 = (TextView) findViewById(R.id.resultInchesToMm);
                textview1.setText(String.valueOf(result1));
            }
        });

    }
}
