package Urok_30;

interface StringFunction{
    String run(String str);
}

public class Lambda1 {
    public static void main(String[] args) {
        StringFunction strFormat1 = str -> str + " !!!";
        StringFunction strFormat2 = str -> str + " 4444";

        printString("salom", strFormat1);

        printString("hello", str -> str + " ****");
    }

    public static void printString(String str, StringFunction strFormat){
        String result = strFormat.run(str);
        System.out.println(result);
    }
}
