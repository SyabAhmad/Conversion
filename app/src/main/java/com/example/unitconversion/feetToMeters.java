package com.example.unitconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class feetToMeters extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feettometers);

        Button btn1 = (Button) findViewById(R.id.findfeetToMeters);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.feetValue);
                if (value1.length()!=0){
                    double result = Double.parseDouble(value1.getText().toString());
                    double result1 = result*0.3048;
                    TextView textview1 = (TextView) findViewById(R.id.resultfeetToMeters);
                    textview1.setText(String.valueOf(result1));
                }else{
                    Toast.makeText(getApplicationContext(),"Please Type Somthing First", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

