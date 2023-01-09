package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton lengthButton1 = (ImageButton) findViewById(R.id.inchToMm);
        lengthButton1.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"Great", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, inchesToMm.class);
            startActivity(intent);
        });



        ImageButton lengthButton2 = (ImageButton) findViewById(R.id.mmToInch);
        lengthButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Great", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, mmToInches.class);
                startActivity(intent);
            }
        });



        ImageButton lengthButton3 = (ImageButton)  findViewById(R.id.feetToMeters);
        lengthButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Great", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, feetToMeters.class);
                startActivity(intent);
            }
        });



        ImageButton lengthButton4 = (ImageButton) findViewById(R.id.metersToFeeet);
        lengthButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Great",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, meterToFeets.class);
                startActivity(intent);
            }
        });


        ImageButton lengthButton5 = (ImageButton) findViewById(R.id.yardsToMeter);
        lengthButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), "Great",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, yardsToMeter.class);
                startActivity(intent);


            }
        });


        ImageButton lengthButton6 = (ImageButton) findViewById(R.id.metersToYards);
        lengthButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), "Great",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, metersToYards.class);
                startActivity(intent);


            }
        });

        ImageButton lengthButton7 = (ImageButton) findViewById(R.id.milesToKm);
        lengthButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Great",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, milesToKm.class);
                startActivity(intent);


            }
        });

        ImageButton lengthButton8 = (ImageButton) findViewById(R.id.kmToMiles);
        lengthButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Great",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, kmToMiles.class);
                startActivity(intent);
            }
        });



//        ImageButton timeButton1 = (ImageButton) findViewById(R.id.yearsToMonths);
//        timeButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), " Recently added", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, yearsToMonth.class);
//                startActivity(intent);
//            }
//        });
//
//
//
//        ImageButton timeButton2 = (ImageButton) findViewById(R.id.monthsToWeeks);
//        timeButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), " Coming SOon", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, monthsToWeeks.class);
//                startActivity(intent);
//            }
//        });
//
//
//
//        ImageButton timeButton3 = (ImageButton) findViewById(R.id.weeksToDays);
//        timeButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), " Coming SOon", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, weeksToDays.class);
//                startActivity(intent);
//            }
//        });

        Button showMore = (Button) findViewById(R.id.showMoreTools);
        showMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moreConversionTools.class);
                startActivity(intent);
            }
        });


    }
}