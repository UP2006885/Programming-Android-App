package com.example.obtainmilk;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    NodeMap nodeMap;

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
//        nodeMap.currentNode().getQuestion();
        TextView tvDescription = (TextView) findViewById(R.id.TextDescription);
        tvDescription.setText(getResources().getString(R.string.post_description));

    }

    public void noClickHandler(View view){
//        nodeMap.currentNode().getQuestion();
    }

    public void MaybeClickHandler(View view){
//        nodeMap.currentNode().getQuestion();
    }
}