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

public class computerConversion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.computerconversion);

        EditText binary = (EditText) findViewById(R.id.binary);
        EditText decimal = (EditText) findViewById(R.id.decimal);
        EditText hexa = (EditText) findViewById(R.id.hexadecimal);
        EditText octal = (EditText) findViewById(R.id.octal);

        Button binFinder = (Button) findViewById(R.id.binFinder);
        binFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binary.length() != 0)
                {
                    String value = binary.getText().toString();
                    int toDecimal = Integer.parseInt(value,2);
                    decimal.setText(toDecimal);
                    hexa.setText(Integer.toHexString(toDecimal));
                    octal.setText(Integer.toOctalString(toDecimal));
                } else if(decimal.length() != 0)
                {
                    String value = decimal.getText().toString();
                    //int toDecimal = Integer.parseInt(value,2);
                    //decimal.setText(toDecimal);
                    binary.setText(Integer.toBinaryString(Integer.parseInt(value)));
                    hexa.setText(Integer.toHexString(Integer.parseInt(value)));
                    octal.setText(Integer.toOctalString(Integer.parseInt(value)));
                } else if(hexa.length() != 0)
                {
                    String value = hexa.getText().toString();
                    int toDecimal = Integer.parseInt(value,16);
                    decimal.setText(toDecimal);
                    binary.setText(Integer.toBinaryString(Integer.parseInt(String.valueOf(toDecimal))));
                    //hexa.setText(Integer.toHexString(Integer.parseInt(value)));
                    octal.setText(Integer.toOctalString(Integer.parseInt(String.valueOf(toDecimal))));
                } else if (octal.length() != 0)
                {
                    String value = octal.getText().toString();
                    int toDecimal = Integer.parseInt(value,8);
                    decimal.setText(toDecimal);
                    binary.setText(Integer.toBinaryString(Integer.parseInt(String.valueOf(toDecimal))));
                    hexa.setText(Integer.toHexString(Integer.parseInt(String.valueOf(toDecimal))));
                    //octal.setText(Integer.toOctalString(Integer.parseInt(value)));
                } else
                {
                    Toast.makeText(getApplicationContext(), " Error", Toast.LENGTH_SHORT).show();
                }
            }
        });



        Button clearAllBin = (Button) findViewById(R.id.clearAllbin);
        clearAllBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decimal.setText("");
                binary.setText("");
                hexa.setText("");
                octal.setText("");
                Toast.makeText(getApplicationContext(), "Cleared", Toast.LENGTH_SHORT).show();
            }
        });


        Button backHome = (Button) findViewById(R.id.backToConversionTools);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(computerConversion.this, moreConversionTools.class);
                startActivity(intent);
            }
        });

    }
}

