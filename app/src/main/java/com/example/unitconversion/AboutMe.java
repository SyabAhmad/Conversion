package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);


        ImageButton backButton = (ImageButton) findViewById(R.id.backToMainManu1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutMe.this, "Home", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AboutMe.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}