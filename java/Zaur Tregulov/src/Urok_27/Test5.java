package Urok_27;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("a = " + foo());
    }

    static StringBuilder foo(){
        StringBuilder a = new StringBuilder("9");
        try {
            File file = new File("fileDoesntExist.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (IOException ex){
            System.out.println("Catch block a = " + a);
            return a;
        }finally {
            a.append(" 10");
            System.out.println("Finally block a = " + a);
        }

        return a;
    }
}
