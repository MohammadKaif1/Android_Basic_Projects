package com.kaif1695.sum_of_two_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextTextPersonName3,editTextTextPersonName4;
    String number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4=findViewById(R.id.editTextTextPersonName4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1=editTextTextPersonName3.getText().toString();
                number2=editTextTextPersonName4.getText().toString();
                int a =Integer.parseInt(number1);
                int b = Integer.parseInt(number2);
                int sum = a+b;

                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();


            }
        });
    }
}