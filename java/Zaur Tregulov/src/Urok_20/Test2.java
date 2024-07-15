package Urok_20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("one"));
        list1.add(new StringBuilder("two"));
        list1.add(new StringBuilder("three"));

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("four"));
        list2.add(new StringBuilder("five"));

        list1.addAll(list2);
        for (StringBuilder s : list1) {
            System.out.println(s);
        }

        System.out.println("------------------");

        list2.get(1).append("!");

        for (StringBuilder s : list1) {
            System.out.println(s);
        }
    }
}
