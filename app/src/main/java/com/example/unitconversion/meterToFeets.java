package com.example.unitconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class meterToFeets extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metertofeet);

        Button btn1 = (Button) findViewById(R.id.findMetersToFeets);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.meterValue);
                if (value1.length()!=0){
                    if (value1.getText().toString().equals(".")) {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_LONG).show();
                    }else{
                        double result = Double.parseDouble(value1.getText().toString());
                        double result1 = result*3.281;
                        TextView textview1 = (TextView) findViewById(R.id.resultMetersToFeets);
                        textview1.setText(String.valueOf(result1));
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Please Type Somthing First", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
