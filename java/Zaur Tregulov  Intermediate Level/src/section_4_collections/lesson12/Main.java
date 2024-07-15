package section_4_collections.lesson12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list);
        System.out.println(list1);

        System.out.println(list == list1);
    }
}
