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


        ImageButton button1 = (ImageButton) findViewById(R.id.inchToMm);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, inchesToMm.class);
            startActivity(intent);
        });




    }
}