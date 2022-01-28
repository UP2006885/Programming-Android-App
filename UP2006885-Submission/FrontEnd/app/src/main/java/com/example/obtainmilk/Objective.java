package com.example.obtainmilk;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Objective extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objective);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //
    }

    public void GoBackButtonClick(View view){
        Intent myIntent = new Intent(Objective.this, MainActivity.class);
        startActivity(myIntent);
    }
}