package com.bhuiyan.tempcalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText edCelcius,edFarhenheit;
    Button celtoFerButton, fertoCelButtton;
    TextView tvDisplay1, tvDisplay2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCelcius = findViewById(R.id.edCelcius);
        edFarhenheit = findViewById(R.id.edFarhenheit);
        celtoFerButton = findViewById(R.id.celtoFerButton);
        fertoCelButtton = findViewById(R.id.fertoCelButtton);
        tvDisplay1 = findViewById(R.id.tvDisplay1);
        tvDisplay2 = findViewById(R.id.tvDisplay2);


        celtoFerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celcius = edCelcius.getText().toString();
                float cel = Float.parseFloat(celcius);

                float CeltoFer = (float) ((float)cel*1.8+32);
                tvDisplay1.setText("Fahrenheit value is: "+CeltoFer);
            }
        });

        fertoCelButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fahrenheit = edFarhenheit.getText().toString();
                float fer = Float.parseFloat(Fahrenheit);

                float FertoCel = (fer-32)*5/9;
                tvDisplay2.setText("Celsius value is: "+FertoCel);
            }
        });






    }
}