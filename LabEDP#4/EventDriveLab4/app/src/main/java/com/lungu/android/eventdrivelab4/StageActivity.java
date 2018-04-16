package com.lungu.android.eventdrivelab4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class StageActivity extends AppCompatActivity  {

    public static int level;
    CustomView stage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);

        level=getIntent().getIntExtra("LEVEL",0);
        stage=(CustomView)findViewById(R.id.stage);

        stage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                float x=event.getX();
                float y=event.getY();
                Log.i("X ",String.valueOf(x));
                Log.i("Y ",String.valueOf(y));

                Coordinates newCoordinates=new Coordinates((int)x,(int)y);
                CustomView.ballsList.add(new Ball(newCoordinates,2,5, Color.RED));

                return false;
            }
        });
    }


}
