package com.example.lungumihail.labedp2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Button alertDialogButton;
    LinearLayout main_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_view = findViewById(R.id.mainActivityLayout);

        alertDialogButton = (Button)findViewById(R.id.alertDialogButton);
        alertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("FAF-161");
                builder.setMessage("Lungu Mihai");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Yes Button Clicked",Toast.LENGTH_LONG).show();
                        // My code
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

            AlertDialog alert=builder.create();
            alert.show();

            }

                                             });



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button buttonGoToListView=(Button)findViewById(R.id.button_go_to_list_view);
        buttonGoToListView.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View viewId){
                        Intent INT=new Intent(MainActivity.this,ListViewActivity.class);
                        INT.putExtra("hello", "Hello");
                        startActivity(INT);
                    }

                }
        );



    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        LinearLayout main_view1;
        switch (keyCode) {

            case KeyEvent.KEYCODE_VOLUME_DOWN:
                main_view1=(LinearLayout) findViewById(R.id.mainActivityLayout);
                main_view1.setBackgroundColor(Color.WHITE);
                break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                main_view1=(LinearLayout) findViewById(R.id.mainActivityLayout);
                main_view1.setBackgroundColor(Color.RED);
                break;
        }

        return true;

        //return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_red:
                if(item.isChecked()){
                    item.setChecked(Boolean.FALSE);
                }else{
                    item.setChecked(Boolean.TRUE);
                    main_view.setBackgroundColor(Color.RED);
                }
                return true;// true- we handled this event
            case R.id.menu_green:
                if(item.isChecked()){
                    item.setChecked(Boolean.FALSE);
                }else{
                    item.setChecked(Boolean.TRUE);
                    main_view.setBackgroundColor(Color.GREEN);
                }
                return true;// true- we handled this event
            case R.id.menu_yellow:
                if(item.isChecked()){
                    item.setChecked(Boolean.FALSE);
                }else{
                    item.setChecked(Boolean.TRUE);
                    main_view.setBackgroundColor(Color.YELLOW);
                }
                return true;// true- we handled this event
            default:
                return super.onOptionsItemSelected(item);


        }

    }



}
