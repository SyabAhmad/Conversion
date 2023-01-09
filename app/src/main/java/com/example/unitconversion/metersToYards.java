package com.example.unitconversion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class metersToYards extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meterstoyard);

        Button btn1 = (Button) findViewById(R.id.findMetersToYards);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.meterValue);
                if (value1.length()!=0){
                    if (value1.getText().toString().equals(".")) {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_LONG).show();
                    } else{
                        double result = Double.parseDouble(value1.getText().toString());
                        double result1 = result*1.094;
                        TextView textview1 = (TextView) findViewById(R.id.resultmetersToYards);
                        textview1.setText(String.valueOf(result1));
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Please Type Somthing First", Toast.LENGTH_LONG).show();
                }
            }
        });

        ImageButton backhome = (ImageButton) findViewById(R.id.backToMainManu);
        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(metersToYards.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

