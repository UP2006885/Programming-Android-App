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

        System.out.println(nodeMap.currentNode().getID());
        System.out.println(nodeMap.currentNode().getDescription());
        System.out.println(nodeMap.currentNode().getQuestion());

    }
    protected InputStream getCSVRes(){
        Resources res = getResources();
        return res.openRawResource(R.raw.mycsv);
    }

    // Buttons
    public void yesClickHandler(View view){
        nodeMap.decision(1);
        System.out.println("Button1-Yes");
        System.out.println(nodeMap.currentNode().getID());
        System.out.println(nodeMap.currentNode().getDescription());
        System.out.println(nodeMap.currentNode().getQuestion());

    }

    public void noClickHandler(View view){
        nodeMap.decision(2);
        System.out.println("Button2-No");
        System.out.println(nodeMap.currentNode().getID());
        System.out.println(nodeMap.currentNode().getDescription());
        System.out.println(nodeMap.currentNode().getQuestion());

    }

    public void MaybeClickHandler(View view){
        nodeMap.decision(3);
        System.out.println("Button3-Maybe");
        System.out.println(nodeMap.currentNode().getID());
        System.out.println(nodeMap.currentNode().getDescription());
        System.out.println(nodeMap.currentNode().getQuestion());
    }
}