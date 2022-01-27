package MyFiles.BackendClasses;
import java.util.Scanner;

public class Console {
    Scanner input = new Scanner(System.in);;
    // Example code for printing the descriptions/questions, while there is a current code.
    public Console(NodeMap map){
        while (map.currentNode() != null) {
            System.out.println(map.currentNode().getDescription());
            System.out.println(map.currentNode().getQuestion());

            // Resets program if a question is -, which is used to indicate a win or loss.
            if (map.currentNode().getQuestion().equals("-")) {
                endOfSim();
                map.noDecision();
            } else { // Gets user input for next Node.
                map.decision(getID("Yes or No? (press 1 for Yes or 2 No, 3 for maybe. Press 4 to go Back)"));
            }
        }
    }

    // Methods
    public void endOfSim(){ // Used for reseting program and catching any exceptions.
        System.out.println("Press Enter key to continue...");
        try { System.in.read();}
        catch(Exception e) {}
    }
    public int getID(String prompt){ // Used for getting user input.
        System.out.println(prompt);
        return input.nextInt();
    }
}
