package com.example.obtainmilk;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    NodeMap nodeMap;
    TextView tvDescription = (TextView) findViewById(R.id.TextDescription);
    TextView tvQuestion = (TextView) findViewById(R.id.TextQuestion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputStream in_s = getCSVRes();
        nodeMap = new NodeMap(in_s);

    }
    protected InputStream getCSVRes(){
        Resources res = getResources();
        return res.openRawResource(R.raw.mycsv);
    }

    // Buttons
    public void yesClickHandler(View view){
        nodeMap.decision(1);
        // Updates Text.
        tvDescription.setText(nodeMap.currentNode().getDescription());
        tvQuestion.setText(nodeMap.currentNode().getQuestion());

    }

    public void noClickHandler(View view){
        nodeMap.decision(2);
        // Updates Text.
        tvDescription.setText(nodeMap.currentNode().getDescription());
        tvQuestion.setText(nodeMap.currentNode().getQuestion());
    }

    public void MaybeClickHandler(View view){
        nodeMap.decision(3);
        // Updates Text.
        tvDescription.setText(nodeMap.currentNode().getDescription());
        tvQuestion.setText(nodeMap.currentNode().getQuestion());
    }
}