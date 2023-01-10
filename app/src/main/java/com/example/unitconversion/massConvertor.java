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

public class massConvertor extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.massconvertor);


        EditText pounds = (EditText) findViewById(R.id.pounds);
        EditText kgram = (EditText) findViewById(R.id.kgram);
        EditText hectogram = (EditText) findViewById(R.id.hectogram);
        EditText gram = (EditText) findViewById(R.id.gram);
        EditText centi = (EditText) findViewById(R.id.centi);
        EditText decagram = (EditText) findViewById(R.id.decagram);
        EditText milegram = (EditText) findViewById(R.id.milegram);


        Button clearAll = (Button) findViewById(R.id.clearAllMass);
        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pounds.setText("");
                kgram.setText("");
                hectogram.setText("");
                gram.setText("");
                centi.setText("");
                decagram.setText("");
                milegram.setText("");
            }
        });


        Button findMass = (Button) findViewById(R.id.massFinder);
        findMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pounds.length() != 0)
                {
                    double value = Double.parseDouble(pounds.getText().toString());
                    //pounds.setText(String.valueOf(value*0.4536));
                    kgram.setText(String.valueOf(value*0.4536));///done
                    hectogram.setText(String.valueOf(value*4.536));///Done
                    gram.setText(String.valueOf(value*453.592)); /// Done
                    centi.setText(String.valueOf(value/50)); ///Done
                    decagram.setText(String.valueOf(value/45.3592)); /// Done /// 200
                    milegram.setText(String.valueOf(value/453592)); ///Done

                } else if (kgram.length() != 0)
                {
                    double value = Double.parseDouble(kgram.getText().toString());
                    pounds.setText(String.valueOf(value*2.20462));
                    //kgram.setText(String.valueOf(value*0.4536));///done
                    hectogram.setText(String.valueOf(value*10));///Done
                    gram.setText(String.valueOf(value*1000)); /// Done
                    centi.setText(String.valueOf(value*100000)); ///Done
                    decagram.setText(String.valueOf(value*100)); /// Done /// 200
                    milegram.setText(String.valueOf(value*1000000)); ///Done
                } else if (hectogram.length() != 0)
                {
                    double value = Double.parseDouble(hectogram.getText().toString());
                    pounds.setText(String.valueOf(value*0.220462));
                    kgram.setText(String.valueOf(value*0.1));///done
                    //hectogram.setText(String.valueOf(value*10));///Done
                    gram.setText(String.valueOf(value*100)); /// Done
                    centi.setText(String.valueOf(value*10000)); ///Done
                    decagram.setText(String.valueOf(value*10)); /// Done /// 200
                    milegram.setText(String.valueOf(value*100000)); ///Done
                } else if (gram.length() != 0)
                {
                    double value = Double.parseDouble(gram.getText().toString());
                    pounds.setText(String.valueOf(value*0.00220462));
                    kgram.setText(String.valueOf(value*0.001));///done
                    hectogram.setText(String.valueOf(value*0.01));///Done
                    //gram.setText(String.valueOf(value*100)); /// Done
                    centi.setText(String.valueOf(value*100)); ///Done
                    decagram.setText(String.valueOf(value*0.1)); /// Done /// 200
                    milegram.setText(String.valueOf(value*1000)); ///Done
                } else if (centi.length() != 0)
                {
                    double value = Double.parseDouble(centi.getText().toString());
                    pounds.setText(String.valueOf(value/45360));
                    kgram.setText(String.valueOf(value/100000));///done
                    hectogram.setText(String.valueOf(value*0.0001));///Done
                    gram.setText(String.valueOf(value*0.01)); /// Done
                    //centi.setText(String.valueOf(value*100)); ///Done
                    decagram.setText(String.valueOf(value*0.001)); /// Done /// 200
                    milegram.setText(String.valueOf(value*10)); ///Done
                } else if (decagram.length() != 0)
                {
                    double value = Double.parseDouble(decagram.getText().toString());
                    pounds.setText(String.valueOf(value*0.0220462));
                    kgram.setText(String.valueOf(value*0.01));///done
                    hectogram.setText(String.valueOf(value*0.1));///Done
                    gram.setText(String.valueOf(value*10)); /// Done
                    centi.setText(String.valueOf(value*1000)); ///Done
                    //decagram.setText(String.valueOf(value*0.001)); /// Done /// 200
                    milegram.setText(String.valueOf(value*10000)); ///Done
                } else if (milegram.toString().length() != 0)
                {
                    double value = Double.parseDouble(milegram.getText().toString());
                    pounds.setText(String.valueOf(value/453600));
                    kgram.setText(String.valueOf(value/1000000));///done
                    hectogram.setText(String.valueOf(value/100000));///Done
                    gram.setText(String.valueOf(value/0.001)); /// Done
                    centi.setText(String.valueOf(value/0.1)); ///Done
                    decagram.setText(String.valueOf(value/10000)); /// Done /// 200
                    //milegram.setText(String.valueOf(value*10000)); ///Done
                } else {
                    Toast.makeText(massConvertor.this, "Something is wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });


        Button backHome = (Button) findViewById(R.id.backToConversionTools);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(massConvertor.this, moreConversionTools.class);
                startActivity(intent);
            }
        });

    }
}

