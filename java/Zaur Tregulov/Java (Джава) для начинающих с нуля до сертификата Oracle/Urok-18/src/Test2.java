import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list.toString());

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("four");
        list2.add("five");

        System.out.println(list.contains(list2));
        System.out.println(list.toString());

    }
}
