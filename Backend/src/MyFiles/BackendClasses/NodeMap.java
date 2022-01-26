package MyFiles.BackendClasses;
import java.io.FileNotFoundException;

public class NodeMap {
    // Variables
    private Node head;
    private Node currentNode;

    // Getters/Setters
    public Node currentNode() { return currentNode;}
    public void noDecision(){
        currentNode = currentNode.getYesNode();
    }

    // Switch statement for user input
    public void decision(int inputID) {
        switch (inputID) {
            case 1 -> currentNode = currentNode.getYesNode();
            case 2 -> currentNode = currentNode.getNoNode();
            case 3 -> currentNode = currentNode.getOptionalNode();
        }
    }

    // Building Map
    public NodeMap()  {
        NodeCollection nodeCollection;
        try {
            nodeCollection = new NodeCollection();
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