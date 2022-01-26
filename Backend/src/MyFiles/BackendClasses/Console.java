package MyFiles.BackendClasses;

import java.util.Scanner;

public class Console {
    Scanner input;
    public Console(NodeMap map){
       input = new Scanner(System.in);
        while (map.currentNode() != null) {
            System.out.println(map.currentNode().getDescription());
            System.out.println(map.currentNode().getQuestion());
            if (map.currentNode().getQuestion().equals("-")) {
                endOfSim();
                map.noDecision();
            } else {
                map.decision(getID("Yes or No? (press 1 for Yes or 2 No, 3 for maybe)"));
            }
        }
    }

    public  void endOfSim(){
        System.out.println("Press Enter key to continue...");
        try { System.in.read();}
        catch(Exception e) {}
    }

    public int getID(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

}
