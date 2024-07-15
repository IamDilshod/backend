package Urok_27;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("text1.txt.txt");

        try {
            FileInputStream fis = new FileInputStream(file);

        }
        catch (FileNotFoundException err){
            System.out.println("Error occured");
        }
        finally {
            System.out.println("Everytime is done!");
        }


    }
}
