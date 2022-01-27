package com.example.obtainmilk;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class NodeMap {
    // Variables
    NodeCollection nodeCollection;
    GoBack goBackStack = new GoBack();

    private Node head;
    private Node currentNode;

    // Getters/Setters
    public Node currentNode() { return currentNode;}
    public void noDecision(){
        currentNode = currentNode.getYesNode();
    }

    // Switch statement for user input
    public void decision(int inputID) {
        switch (inputID){
            case 1:
                goBackStack.push(currentNode.getID());
                currentNode = currentNode.getYesNode();
                break;
            case 2:
                goBackStack.push(currentNode.getID());
                currentNode = currentNode.getNoNode();
                break;
            case 3:
                if(currentNode.getOptionalID() == 34){
                    System.out.println("Invalid Choice");
                }else{
                    goBackStack.push(currentNode.getID());
                    currentNode = currentNode.getOptionalNode();
                }
                break;
            case 4: // Go back feature.
                if(goBackStack.length() != 0){
                    currentNode = nodeCollection.locateNodeBy(goBackStack.pop()); // Uses previously stored Id to get the previous node.
                } else {
                    System.out.println("Stack is Empty");
                }
                break;
        }
    }

    // Building Map
    public NodeMap(InputStream in_s)  {
        try {
            nodeCollection = new NodeCollection(in_s);
            head = nodeCollection.get(0);
        } catch (FileNotFoundException e) {
            //message
            return;
        }
        buildMap(nodeCollection);
        currentNode = head;
    }
    private void buildMap(NodeCollection NodeCollection)   {
        if (NodeCollection == null) {return;}
        for(Node source : NodeCollection.arrayList()){
            int yesID = source.getYesID();
            int noID = source.getNoID();
            int optionalID = source.getOptionalID();
            Node yesNode = NodeCollection.locateNodeBy(yesID);
            Node noNode = NodeCollection.locateNodeBy(noID);
            Node optionalNode = NodeCollection.locateNodeBy(optionalID);
            source.setYesNode(yesNode);
            source.setNoNode(noNode);
            source.setOptionalNode(optionalNode);
        }
    }
}