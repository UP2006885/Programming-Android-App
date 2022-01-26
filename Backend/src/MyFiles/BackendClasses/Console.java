package MyFiles.BackendClasses;

import java.util.Scanner;

public class Console {
    Scanner io;
    public Console(NodeMap map){
        io = new Scanner(System.in);
        while (map.currentNode() != null) {
            System.out.println(map.currentNode().getDescription());
            System.out.println(map.currentNode().getQuestion());
            if (map.currentNode().getQuestion().equals("-")) {
                pressEnterToContinue();
                map.noDecision();
            } else {
                map.decision(
                        fromConsoleGetInt("Yes or No? (press 1 for Yes or 2 No)")
                ) ;
            }
        }
    }
}
