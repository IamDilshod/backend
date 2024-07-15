package Urok_20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("one"));
        list.add(new String("two"));
        list.add(new String("three"));

        System.out.println(list.indexOf(new String("two"))); // 1
        System.out.println(list.contains(new String("two"))); // true

        System.out.println("-------------------");

        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("one"));
        list2.add(new StringBuilder("two"));
        list2.add(new StringBuilder("three"));

        System.out.println(list2.indexOf(new StringBuilder("two"))); // -1
        System.out.println(list2.contains(new StringBuilder("two"))); // false
    }
}
