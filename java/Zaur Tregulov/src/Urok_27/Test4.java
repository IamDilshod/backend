package Urok_27;
import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("a = " + foo());
    }

    static int foo(){
        int a = 9;
        try {
            File file = new File("fileDoesntExist.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException ex){
            System.out.println("Catch block a = " + a);
            return a;
        } finally {
            a = 10;
            System.out.println("Finally block a = " + a);
        }

        return a;
    }
}
