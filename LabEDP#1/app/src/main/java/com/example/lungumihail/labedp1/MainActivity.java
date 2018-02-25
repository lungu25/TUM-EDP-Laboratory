package com.example.lungumihail.labedp1;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button customButton = (Button) findViewById(R.id.customButton);
        final TextView customText = (TextView) findViewById(R.id.customText);
        Button defaultButton = (Button) findViewById(R.id.defaultButton);
        final TextView defaultText = (TextView) findViewById(R.id.defaultText);
        final EditText defaultEdit = (EditText) findViewById(R.id.defaultEdit);
        customButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customText.setTextSize(15);
                defaultText.setTextColor(0xFF0000);


            }
        });
        defaultButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                defaultText.setTextColor(0xFF00FF00);
                customText.setTextSize(40);
                defaultEdit.setTextColor(0xFF0000);
            }
        });




    }







}


