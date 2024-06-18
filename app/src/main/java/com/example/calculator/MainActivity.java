package com.example.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    TextView tv1,tv2,tv3;
    EditText e1,e2;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tv1 = findViewById(R.id.t1);
//        tv2 = findViewById(R.id.t2);
        tv3 = findViewById(R.id.t3);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field one is empty..", Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field Two is empty..", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a + b;
//                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
//                i1.putExtra("Ans",c);
//                startActivity(i1);
                    tv3.setText("Addition is:=" + c);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field one is empty..", Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field Two is empty..", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a - b;
//                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
//                i1.putExtra("Ans",c);
//                startActivity(i1);
                    tv3.setText("Substraction is:=" + c);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field one is empty..", Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field Two is empty..", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a * b;
//                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
//                i1.putExtra("Ans",c);
//                startActivity(i1);
                    tv3.setText("Multiplication is:=" + c);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field one is empty..", Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field Two is empty..", Toast.LENGTH_SHORT).show();
                }
                else {
                    float a = Integer.parseInt(e1.getText().toString());
                    float b = Integer.parseInt(e2.getText().toString());
                    float c = a / b;
//                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
//                i1.putExtra("Ans",c);
//                startActivity(i1);
                    tv3.setText("Division is:=" + c);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field one is empty..", Toast.LENGTH_SHORT).show();
                }
                else if (e2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Field Two is empty..", Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(e1.getText().toString());
                    int b = Integer.parseInt(e2.getText().toString());
                    int c = a % b;
//                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
//                i1.putExtra("Ans",c);
//                startActivity(i1);
                    tv3.setText("modulo is:=" + c);
                }

            }
        });
    }

}