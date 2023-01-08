package com.example.unitconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class mmToInches extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mmtoinches);

        Button btn1 = (Button) findViewById(R.id.findMmToInches);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.mmValue);
                if (value1.length()!=0){
                    if (value1.getText().toString().equals(".")) {
                        Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_LONG).show();
                    }else{
                        double result = Double.parseDouble(value1.getText().toString());
                        double result1 = result*0.03937;
                        TextView textview1 = (TextView) findViewById(R.id.resultMmToInches);
                        textview1.setText(String.valueOf(result1));
                    }

                } else
                {
                    Toast.makeText(getApplicationContext(),"Please Type Somthing First", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
