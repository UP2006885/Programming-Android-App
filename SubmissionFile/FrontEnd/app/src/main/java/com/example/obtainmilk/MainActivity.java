package com.example.obtainmilk;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //
    }

    public void onStartButtonClick(View view){
        Intent myIntent = new Intent(MainActivity.this, Interactivity.class);
        startActivity(myIntent);
    }

    public void onObjectiveButtonClick(View view){
        Intent myIntent = new Intent(MainActivity.this, Objective.class);
        startActivity(myIntent);
    }
}