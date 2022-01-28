package com.example.obtainmilk;

public class Node {
    // Variables
    // IDs
    private int ID; // ID
    private int YesID; // YES
    private int NoID; // NO
    private int OptionalID; // MAYBE
    // Strings
    private String description;
    private String question;
    // Node Links.
    private Node YesNode;
    private Node NoNode;
    private Node OptionalNode;

    // Constructor.
    public Node(int ID, int yesID, int noID, int optionalID, String description, String question) {
        this.ID = ID;
        this.YesID = yesID;
        this.NoID = noID;
        this.OptionalID = optionalID;
        this.description = description;
        this.question = question;
    }
    public Node() {} // A second consturctor which enables us to initilize the Node class without inputing data.

    //Gets & Setters
    // IDs
    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public int getYesID() {return YesID;}
    public void setYesID(int ID) {this.YesID = ID;}
    public int getNoID() {return NoID;}
    public void setNoID(int ID) {this.NoID = ID;}
    public int getOptionalID() {return OptionalID;}
    public void setOptionalID(int ID) {this.OptionalID = ID;}
    // Text (Strings).
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}
    // Nodes
    public Node getYesNode(){return YesNode;}
    public void setYesNode(Node YesNode){this.YesNode = YesNode;}
    public Node getNoNode(){return NoNode;}
    public void setNoNode(Node NoNode){this.NoNode = NoNode;}
    public Node getOptionalNode(){return OptionalNode;}
    public void setOptionalNode(Node OptionalNode){this.OptionalNode = OptionalNode;}

    // ToString Method.
    @Override
    public String toString() {
        return "ID:" + ID +
                ", yesID:" + YesID +
                ", noID:" + NoID +
                ", OptionalID:" + OptionalID +
                ", description:'" + description + '\'' +
                ", question:'" + question + '\'';
    }
}