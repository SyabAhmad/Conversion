package com.example.unitconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class mmToInches extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mmtoinches);

        Button btn1 = (Button) findViewById(R.id.findmmToInches);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText value1 = (EditText) findViewById(R.id.mmValue);
                double result = Double.parseDouble(value1.getText().toString());
                double result1 = result*0.03937;
                TextView textview1 = (TextView) findViewById(R.id.resultmmToInches);
                textview1.setText(String.valueOf(result1));
            }
        });

    }
}
