package Test3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);

        System.out.println("-----------------");

        Number num1 = new Integer(87);
//        int num2 = (int) num1;
        int num2 = (Integer) num1;


    }
}
