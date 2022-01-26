package MyFiles.BackendClasses;

public class NodeMap {
    // Variables
    private Node head;
    private Node currentNode;
    // Getters and Setters
    public Node getHead() {return head;}
    public void setHead(Node Head) {this.head = Head;}
    public Node getCurrentNode() {return currentNode;}
    public void setCurrentNode(Node currentNode) {this.currentNode = currentNode;}

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
