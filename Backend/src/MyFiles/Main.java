package MyFiles;
import MyFiles.BackendClasses.*;

import java.io.FileNotFoundException;

import static java.lang.Integer.valueOf;



public class Main {
    static NodeCollection NodeCollection;
    public static void main(String[] args) {
	// write your code here
        try {
            NodeCollection = new NodeCollection();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(NodeCollection.toString());
    }
}
