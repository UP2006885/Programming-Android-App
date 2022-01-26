package MyFiles.BackendClasses;

public class Node {
    private int ID; // ID
    private int YesID; // YES
    private int NoID; // NO
    private int OptionalID; // MAYBE

    private String description;
    private String question;

    // Constructor.
    public Node(int ID, int yesID, int noID, int optionalID, String description, String question) {
        this.ID = ID;
        this.YesID = yesID;
        this.NoID = noID;
        this.OptionalID = optionalID;
        this.description = description;
        this.question = question;
    }

    //Gets & Setters
    // IDs
    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}
    public int getYesID() {return YesID;}
    public void setYesID(int ID) {this.YesID = ID;}
    public int getNoID() {return NoID;}
    public void setNoID(int ID) {this.NoID = ID;}
    public int getOptionalID() {return OptionalID;}
    public void setOptionalID(int ID) {this.OptionalID = ID;}

    // Text (Strings).
    public String getDescription() {return description;}
    public void getDescription(String description) {this.description = description;}
    public String getQuestion() {return question;}
    public void getQuestion(String question) {this.question = question;}
    // ---



}
