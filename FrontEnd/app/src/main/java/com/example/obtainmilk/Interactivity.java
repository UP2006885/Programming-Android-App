package com.example.obtainmilk;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

public class Interactivity extends AppCompatActivity {
    NodeMap nodeMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactivity);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        InputStream in_s = getCSVRes();
        nodeMap = new NodeMap(in_s);
        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.

    }

    protected InputStream getCSVRes(){
        Resources res = getResources();
        return res.openRawResource(R.raw.mycsv);

    }

    // Buttons
    public void yesClickHandler(View view){
        nodeMap.decision(1);
        System.out.println("Button1-Yes");
        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.

    }

    public void noClickHandler(View view){
        nodeMap.decision(2);
        System.out.println("Button2-No");
        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.
    }

    public void MaybeClickHandler(View view){
        nodeMap.decision(3);
        System.out.println("Button3-Maybe");
        // ------
        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.
    }

    public void BackClickHandler(View view){
        nodeMap.decision(4);
        System.out.println("Button4-Back");
        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.
    }

    public void loadClickHandler(View view){




        loadDataText(); // Loads the Description, Question & Stack length to activity. and runs Check option which updates the maybe button dependant on choices available.
    }

    public void loadDataText(){
        String description = nodeMap.currentNode().getDescription();
        String question = nodeMap.currentNode().getQuestion();
        ((TextView)findViewById(R.id.TextDescription)).setText(description);
        ((TextView)findViewById(R.id.TextQuestion)).setText(question);
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));
        checkOption();
    }

    public void checkOption(){
        Button button = findViewById(R.id.button2);

        if(nodeMap.currentNode().getOptionalID() != 34){
            button.setBackgroundColor(Color.parseColor("#F5ED00"));
        } else {button.setBackgroundColor(Color.parseColor("#B5BEC6"));}
    }
}