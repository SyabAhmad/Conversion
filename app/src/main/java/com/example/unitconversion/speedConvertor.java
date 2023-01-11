package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class speedConvertor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speedconvertor);

        ImageButton backButton = (ImageButton) findViewById(R.id.backToConversionTools);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(speedConvertor.this, "Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(speedConvertor.this, moreConversionTools.class);
                startActivity(intent);
            }
        });

        EditText meters = (EditText) findViewById(R.id.meters);
        EditText kmeterSecond = (EditText) findViewById(R.id.kmeterSecond);
        EditText kmtoHours = (EditText) findViewById(R.id.kmeterHour);
        EditText milesHours = (EditText) findViewById(R.id.milesHours);
        EditText knotHours = (EditText) findViewById(R.id.knotHours);
        EditText feetHours = (EditText) findViewById(R.id.feetHours);

        Button clearAllSpeed = (Button) findViewById(R.id.clearAllsSpeed);
        clearAllSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                meters.setText("");
                kmeterSecond.setText("");
                milesHours.setText("");
                kmtoHours.setText("");
                knotHours.setText("");
                feetHours.setText("");
            }
        });


        Button speedFinder = (Button) findViewById(R.id.speedFinder);
        speedFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (meters.length() != 0)
                {
                    double value = Double.parseDouble(meters.getText().toString());
                    //meters.setText("");
                    kmeterSecond.setText(String.valueOf(value*0.001));
                    milesHours.setText(String.valueOf(value*2.23694));
                    kmtoHours.setText(String.valueOf(value*3.6));
                    knotHours.setText(String.valueOf(value*1.94384));
                    feetHours.setText(String.valueOf(value*11811));
                } else if (kmeterSecond.length() != 0)
                {
                    double value = Double.parseDouble(kmeterSecond.getText().toString());
                    meters.setText(String.valueOf(value*1000));
                    //kmeterSecond.setText(String.valueOf(value*0.001));
                    milesHours.setText(String.valueOf(value*2236.9362920544));
                    kmtoHours.setText(String.valueOf(value*3600.00));
                    knotHours.setText(String.valueOf(value*1943.84));
                    //feetHours.setText(String.valueOf(value*11811));
                } else if (milesHours.length() != 0)
                {
                    double value = Double.parseDouble(milesHours.getText().toString());
                    meters.setText(String.valueOf(value*26.8224));
                    kmeterSecond.setText(String.valueOf(value*0.00044704));
                    //milesHours.setText(String.valueOf(value*2236.9362920544));
                    kmtoHours.setText(String.valueOf(value*1.60934));
                    knotHours.setText(String.valueOf(value*0.868976));
                    feetHours.setText(String.valueOf(value*5280));
                } else if (kmtoHours.length() != 0)
                {
                    double value = Double.parseDouble(kmtoHours.getText().toString());
                    meters.setText(String.valueOf(value*0.277778));
                    kmeterSecond.setText(String.valueOf(value*0.000277778));
                    milesHours.setText(String.valueOf(value*999.999));
                    //kmtoHours.setText(String.valueOf(value*1.60934));
                    knotHours.setText(String.valueOf(value*0.539957));
                    feetHours.setText(String.valueOf(value*3280.8398950131));
                } else if (knotHours.length() != 0)
                {
                    double value = Double.parseDouble(knotHours.getText().toString());
                    meters.setText(String.valueOf(value*0.514444));
                    kmeterSecond.setText(String.valueOf(value*0.000514444));
                    milesHours.setText(String.valueOf(value*1.15078));
                    kmtoHours.setText(String.valueOf(value*1.852));
                    //knotHours.setText(String.valueOf(value*0.539957));
                    feetHours.setText(String.valueOf(value*6076.12));
                } else if (feetHours.length() != 0)
                {
                    double value = Double.parseDouble(feetHours.getText().toString());
                    meters.setText(String.valueOf(value*8.46667e-5));
                    kmeterSecond.setText(String.valueOf(value*8.46667e-8));
                    milesHours.setText(String.valueOf(value*0.000189394));
                    kmtoHours.setText(String.valueOf(value*0.0003048));
                    knotHours.setText(String.valueOf(value*0.0003048));
                    //feetHours.setText(String.valueOf(value*3280.8398950131));
                } else {
                    Toast.makeText(getApplicationContext(), "Please Type Somthing First", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}