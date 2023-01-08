package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton lengthButton1 = (ImageButton) findViewById(R.id.inchToMm);
        lengthButton1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, inchesToMm.class);
            startActivity(intent);
        });

        ImageButton lengthButton2 = (ImageButton) findViewById(R.id.mmToInch);
        lengthButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mmToInches.class);
                startActivity(intent);
            }
        });




    }
}