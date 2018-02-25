package com.example.lungumihail.labedp1;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button customButton = (Button) findViewById(R.id.customButton);
        final TextView customText = (TextView) findViewById(R.id.customText);


        customButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customText.setTextSize(15);
            }
        });

    }







}


