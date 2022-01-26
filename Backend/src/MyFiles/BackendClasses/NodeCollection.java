package MyFiles.BackendClasses;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.valueOf;

public class NodeCollection {
    private ArrayList<Node> nodes;

    public NodeCollection() throws FileNotFoundException {
        java.io.File file = new java.io.File("src/MyFiles/myCSV.csv");
        Scanner FileReference = new Scanner(file);
        nodes = new ArrayList<Node>();
        Node node;
        while (FileReference.hasNext()) {
            String line = FileReference.nextLine();
            node = mapFields(line);
            nodes.add(node);
        }
        FileReference.close();
    }

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

    public Node locateNodeBy(int nodeID) {
        for (Node n : nodes) {
            if (nodeID == n.getID()) {
                return n;
            }
        }
        return new Node();
    }

    @Override
    public String toString(){
        String str = "";
        for(Node n : nodes){
            str += n.toString() + "\n";
        }
        return str;
    }



}

