package MyFiles;
import MyFiles.BackendClasses.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.valueOf;
public class Main {
    static NodeCollection NodeCollection;
    public static void main(String[] args) {
        // write your code here
        NodeMap map = new NodeMap();
        Console c = new Console(map);
    }
}