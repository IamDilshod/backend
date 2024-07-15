package Urok_27;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("./text1.txt.txt");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis.read());
    }
}
