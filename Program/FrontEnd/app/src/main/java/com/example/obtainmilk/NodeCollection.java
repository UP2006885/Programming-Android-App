package com.example.obtainmilk;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import static java.lang.Integer.valueOf;

public class NodeCollection {
    // Array list for storing nodes.
    private CustomArrayList<Node> nodes;
    public CustomArrayList<Node> arrayList(){return nodes;}

    // Uses CSV to map nodes.
    public NodeCollection(InputStream in_s) throws FileNotFoundException {

        Scanner FileReference = new Scanner(in_s);
        nodes = new CustomArrayList<Node>();
        Node node;
        // While theres data in CSV this loop continues, and calls mapFields to store that data in nodes.
        // These nodes are then inserted into an ArrayList.
        while (FileReference.hasNext()) {
            String line = FileReference.nextLine();
            node = mapFields(line);
            nodes.add(node);
        }
        FileReference.close();
    }

    // Uses CSV and stores the correct split data in nodes.
    Node mapFields(String line) {
        String[] stringArray = line.split(",");
        Node n = new Node();
        n.setID(valueOf(stringArray[0]));
        n.setYesID(valueOf(stringArray[1]));
        n.setNoID(valueOf(stringArray[2]));
        n.setOptionalID(valueOf(stringArray[3]));
        n.setDescription(stringArray[4]);
        n.setQuestion(stringArray[5]);
        return n;
    }

    // Checks Node ID.
    public Node locateNodeBy(int nodeID) {
        for (Node n : nodes) {
            if (nodeID == n.getID()) {
                return n;
            }
        }
        return new Node();
    }
    public Node get(int index){ return nodes.get(index); }

    // to String method for outputting data.
    @Override
    public String toString(){
        String str = "";
        for(Node n : nodes){
            str += n.toString() + "\n";
        }
        return str;
    }
}