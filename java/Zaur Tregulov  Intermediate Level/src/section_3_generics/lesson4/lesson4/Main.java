package section_3_generics.lesson4.lesson4;

import java.util.ArrayList;
import java.util.List;

//4. Введение в generics
class Car{}

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add(new Car());
        list.add(23);
        list.add(new StringBuilder("one"));

        System.out.println(list.get(0));

        System.out.println("-----------------------------");

        List list1 = new ArrayList();
        list1.add("bir");
        list1.add("ikki");
        list1.add("uch");

        for (Object s : list1){
            System.out.println(((String) s).length());
        }

        System.out.println("-----------------------------");

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");

        for (String s: list2){
            System.out.println(s.length());
        }
    }
}