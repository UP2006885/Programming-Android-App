package com.example.obtainmilk;

public class GoBack { // Basically a Stack.
    private int[] goBackArray = new int[100];;
    private int counter = 0;
    private int previousNodeID;

    public GoBack() {}

    public void push(int newNodeID){
        goBackArray[counter] = newNodeID;
        counter++;
    }

    public int pop(){
        counter--;
        previousNodeID = goBackArray[counter];
        return previousNodeID;
    }

    public int peek(){
        return goBackArray[counter-1];
    }
    public int length(){return counter;}
    public int size() {return goBackArray.length;}
}
