package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1 = (EditText) findViewById(R.id.num1);
        final EditText num2 = (EditText) findViewById(R.id.num2);
        final TextView result = (TextView) findViewById(R.id.result);

        Button soma = findViewById(R.id.soma);
        Button sub = findViewById(R.id.sub);
        Button mult = findViewById(R.id.mult);
        Button div = findViewById(R.id.div);

        soma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double valnum1 = Double.parseDouble(num1.getText().toString());
                double valnum2 = Double.parseDouble(num2.getText().toString());
                double resp = valnum1 + valnum2;
                result.setText("" + resp);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double valnum1 = Double.parseDouble(num1.getText().toString());
                double valnum2 = Double.parseDouble(num2.getText().toString());
                double resp = valnum1 - valnum2;
                result.setText("" + resp);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double valnum1 = Double.parseDouble(num1.getText().toString());
                double valnum2 = Double.parseDouble(num2.getText().toString());
                double resp = valnum1 * valnum2;
                result.setText("" + resp);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double valnum1 = Double.parseDouble(num1.getText().toString());
                double valnum2 = Double.parseDouble(num2.getText().toString());
                double resp = valnum1 / valnum2;
                result.setText("" + resp);
            }
        });
    }
}
