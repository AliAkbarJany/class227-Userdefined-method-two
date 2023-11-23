package com.rafsan.class227userdefinedmethodtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,buttonToast,buttonCount;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        buttonToast = findViewById(R.id.buttonToast);
        buttonCount = findViewById(R.id.buttonCount);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeAlertDialog();
            }
        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Hello, Rafsan" , 20000);
            }
        });

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countMethod(30,70,10);
            }
        });

    }

    //<<<<<<<<<<<<<<<<<<<< User defined METHOD/FUNCTION >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    // Method with (PARAMETER)....................
    private void showToast(String myString , int salary){

        Toast.makeText(MainActivity.this, myString+ "\n your salary is = "+ salary, Toast.LENGTH_LONG).show();

    }


    private  void countMethod(int a,int b, int c){

        int sum;
        sum=a+b+c;

        textView.setText("Sum is = "+sum);

    }


    private void makeAlertDialog(){

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Welcome Title")
                .setMessage("welcome to our METHOD/FUNCTION journey")
                .show();

    }

}