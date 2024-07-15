package Urok_20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("four");
        list2.add("five");

        list1.addAll(list2);
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("------------------");

        list2.set(1, "FIVE");


        for (String s : list1) {
            System.out.println(s);

        }
    }
}
