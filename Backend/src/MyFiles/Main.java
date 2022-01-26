package MyFiles;
import MyFiles.BackendClasses.*;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Test v2");

        String line = "1,2,16,-1,You try to make breakfast but are out of milk,Do you ask roommate 1 John for some money for milk?";
        String[] stringArray = line.split(",");
        Node n = new Node();

        n.setID(valueOf(stringArray[0]));
        n.setYesID(valueOf(stringArray[1]));
        n.setNoID(valueOf(stringArray[2]));

        n.setDescription(stringArray[3]);
        n.setQuestion(stringArray[4]);

        System.out.println(n.toString());

    }
}
