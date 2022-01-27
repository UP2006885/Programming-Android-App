package com.example.obtainmilk;

import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
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

        System.out.println(nodeMap.currentNode().getID());
        System.out.println(nodeMap.currentNode().getDescription());
        System.out.println(nodeMap.currentNode().getQuestion());
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));
    }

    protected InputStream getCSVRes(){
        Resources res = getResources();
        return res.openRawResource(R.raw.mycsv);
    }

    // Buttons
    public void yesClickHandler(View view){
        nodeMap.decision(1);
        System.out.println("Button1-Yes");
        // ------
        String description = nodeMap.currentNode().getDescription();
        String question = nodeMap.currentNode().getQuestion();
        ((TextView)findViewById(R.id.TextDescription)).setText(description);
        ((TextView)findViewById(R.id.TextQuestion)).setText(question);
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));



    }

    public void noClickHandler(View view){
        nodeMap.decision(2);
        System.out.println("Button2-No");
        // ------
        String description = nodeMap.currentNode().getDescription();
        String question = nodeMap.currentNode().getQuestion();
        ((TextView)findViewById(R.id.TextDescription)).setText(description);
        ((TextView)findViewById(R.id.TextQuestion)).setText(question);
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));


    }

    public void MaybeClickHandler(View view){
        nodeMap.decision(3);
        System.out.println("Button3-Maybe");
        // ------
        String description = nodeMap.currentNode().getDescription();
        String question = nodeMap.currentNode().getQuestion();
        ((TextView)findViewById(R.id.TextDescription)).setText(description);
        ((TextView)findViewById(R.id.TextQuestion)).setText(question);
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));

    }

    public void BackClickHandler(View view){
        nodeMap.decision(4);
        System.out.println("Button4-Back");
        // ------
        String description = nodeMap.currentNode().getDescription();
        String question = nodeMap.currentNode().getQuestion();
        ((TextView)findViewById(R.id.TextDescription)).setText(description);
        ((TextView)findViewById(R.id.TextQuestion)).setText(question);
        ((TextView)findViewById(R.id.textGoBackCount)).setText(String.valueOf(nodeMap.goBackStack.length()));
    }
}