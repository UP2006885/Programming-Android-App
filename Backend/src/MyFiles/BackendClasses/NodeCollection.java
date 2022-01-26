package MyFiles.BackendClasses;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.valueOf;

public class NodeCollection {
    // Array list for storing nodes.
    private ArrayList<Node> nodes;
    public ArrayList<Node> arrayList(){
        return nodes;
    }

    // Uses CSV to map nodes.
    public NodeCollection() throws FileNotFoundException {
        java.io.File file = new java.io.File("src/MyFiles/myCSV.csv");
        Scanner FileReference = new Scanner(file);
        nodes = new ArrayList<Node>();
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