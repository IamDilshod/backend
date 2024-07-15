package section_3_generics.lesson4.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("hello");
        list.add("abc");

        System.out.println("Before sort ");
        System.out.println(list);

        System.out.println("After sort ");
        Collections.sort(list);
        System.out.println(list);
    }
}
