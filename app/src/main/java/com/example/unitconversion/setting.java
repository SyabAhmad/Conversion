package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        ImageButton backButton = (ImageButton) findViewById(R.id.backToMainManu);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(setting.this, "Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(setting.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}