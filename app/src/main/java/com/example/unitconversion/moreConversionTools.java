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
public class moreConversionTools extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moreconversions);


        ImageButton backmain = (ImageButton) findViewById(R.id.backToMainManu);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(moreConversionTools.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Button temperatureButton = (Button) findViewById(R.id.temperatureButtonfinder);
        temperatureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moreConversionTools.this, temperaturePanel.class);
                startActivity(intent);
            }
        });


        Button weightButton = (Button) findViewById(R.id.weightButtonFinder);
        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Mass Finder", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(moreConversionTools.this, massConvertor.class);
                startActivity(intent);

            }
        });

        Button computerconversion = (Button) findViewById(R.id.computerConversionButtenFinder);
        computerconversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(moreConversionTools.this, computerConversion.class);
                startActivity(intent);
            }
        });

        Button currencyConvertor = (Button) findViewById(R.id.currencyConversionButtonFinder);
        currencyConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });


        Button speedConvertor = (Button) findViewById(R.id.speedButtonFinder);
        speedConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });


        Button currenConvertor = (Button) findViewById(R.id.currentButtonFinder);
        speedConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });


        Button fuelConvertor = (Button) findViewById(R.id.fuelButtonFinder);
        fuelConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button forceConvertor = (Button) findViewById(R.id.forceButtonFinder);
        forceConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button volumeConvertor = (Button) findViewById(R.id.volumeButtonFinder);
        volumeConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button storageConvertor = (Button) findViewById(R.id.storageButtonFinder);
        storageConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });


        Button soundConvertor = (Button) findViewById(R.id.soundButtonFinder);
        soundConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button resistanceConvertor = (Button) findViewById(R.id.resistanceButtonFinder);
        resistanceConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button resolutionConvertor = (Button) findViewById(R.id.resistanceButtonFinder);
        resolutionConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button inertiaConvertor = (Button) findViewById(R.id.inertiaButtonFinder);
        inertiaConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });


        Button permeabilityConvertor = (Button) findViewById(R.id.permeabilityButtonFinder);
        permeabilityConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button heatDensityConvertor = (Button) findViewById(R.id.heatDensityButtonFinder);
        heatDensityConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });

        Button frequencyConvertor = (Button) findViewById(R.id.frequencyButtonFinder);
        frequencyConvertor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();
            }
        });



    }
}


