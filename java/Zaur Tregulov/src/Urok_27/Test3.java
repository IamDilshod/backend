package Urok_27;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try{
            File file = new File("text.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e){
            System.out.println("Exception catched 1");
        } catch (RuntimeException e){
            System.out.println("Exception catched 2");
        } catch (Throwable e){
            System.out.println("Exception catched 3");
        }
    }
}
