package com.example.unitconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class temperaturePanel extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperaturepanel);

        EditText celsiusValue1 = (EditText) findViewById(R.id.celsiusValue);
        EditText fahrenheitValue1 = (EditText) findViewById(R.id.fahrenheitValue);
        EditText kelvinValue1 = (EditText) findViewById(R.id.kelvinValue);

        Button tempButton = (Button) findViewById(R.id.findTempValues);

        tempButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (celsiusValue1.length() != 0)
                {
                    double newValue1 = Double.parseDouble(celsiusValue1.getText().toString());
                    double result1 = (newValue1*9/5) +32;
                    fahrenheitValue1.setText(String.valueOf(result1));
                    double result2 = newValue1+273.5;
                    kelvinValue1.setText(String.valueOf(result2));
                } else if(fahrenheitValue1.length() !=0)
                {
                    double newValue2 = Double.parseDouble(fahrenheitValue1.getText().toString());
                    double result1 = (newValue2+459.67)*5/9;
                    kelvinValue1.setText(String.valueOf(result1));
                    double result2 = (newValue2-32)*5/9;
                    celsiusValue1.setText(String.valueOf(result2));

                } else if(kelvinValue1.length() !=0)
                {
                    double newValue3 = Double.parseDouble(kelvinValue1.getText().toString());
                    double result1 = (newValue3*9/5)-459.67;
                    fahrenheitValue1.setText(String.valueOf(result1));
                    double result2 = newValue3-273.15;
                    celsiusValue1.setText(String.valueOf(result2));
                } else{
                    Toast.makeText(getApplicationContext(), "Type something First", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button clearbtn = (Button) findViewById(R.id.clearAllTemp);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fahrenheitValue1.setText("");
                celsiusValue1.setText("");
                kelvinValue1.setText("");
                Toast.makeText(getApplicationContext(),"cleared", Toast.LENGTH_SHORT).show();
            }
        });


    }
}


