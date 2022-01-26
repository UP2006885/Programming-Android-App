public class Node {

    private int ID;
    private int yesID;
    private int noID;
    private int maybeID;
    private String description;
    private String question;

    private Node yesNode;
    private Node noNode;
    private Node maybeNode;

    public Node getMaybeNode() {
        return maybeNode;
    }

    public void setMaybeNode(Node maybeNode) {
        this.maybeNode = maybeNode;
    }

    public int getMaybeID() {
        return maybeID;
    }

    public void setMaybeID(int maybeID) {
        this.maybeID = maybeID;
    }

    public Node(int ID, int yesID, int noID, int maybeID, String description, String question) {
        this.ID = ID;
        this.yesID = yesID;
        this.noID = noID;
        this.maybeID = maybeID;
        this.description = description;
        this.question = question;
    }

    public Node() {}

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public int getYesID() {return yesID;}
    public void setYesID(int yesID) {this.yesID = yesID; }
    public int getNoID() {return noID;}
    public void setNoID(int noID) {this.noID = noID;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description; }
    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}
    public Node getYesNode() {return yesNode;}
    public void setYesNode(Node yes) {this.yesNode = yes;}
    public Node getNoNode() {return noNode;}
    public void setNoNode(Node no) {this.noNode = no;}


    @Override
    public String toString() {
        return "nodeID:" + ID +
                ", yesID:" + yesID +
                ", noID:" + noID +
                ", description:'" + description + '\'' +
                ", question:'" + question + '\'';
    }


}
