package MyFiles;
import MyFiles.BackendClasses.*;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String line0 = "0,0,1,-1,You wake up,Do you sleep in?";
        String line1 = "1,2,16,-1,You try to make breakfast but are out of milk,Do you ask roommate 1 John for some money for milk?";

        Node n0 = new Node();
        mapNode(n0, line0);
        Node n1 = new Node();
        mapNode(n1, line1);

        System.out.println(n0.toString());
        System.out.println(n1.toString());
    }

    public static void mapNode(Node n, String line){
        String[] stringArray = line.split(",");
        n.setID(valueOf(stringArray[0]));
        n.setYesID(valueOf(stringArray[1]));
        n.setNoID(valueOf(stringArray[2]));
        n.setOptionalID(valueOf(stringArray[3]));
        n.setDescription(stringArray[4]);
        n.setQuestion(stringArray[5]);
    }

}
