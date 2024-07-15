package section_3_generics.lesson4.lesson6_parametrizedMethod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        String str = GenericsMethod.getElement(stringList, 1);
        System.out.println(str);

        System.out.println("----------------");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(34);
        integerArrayList.add(67);
        integerArrayList.add(23);
        int i = GenericsMethod.getElement(integerArrayList, 0);
        System.out.println(i);
    }
}

class GenericsMethod{
    public static <T> T getElement(ArrayList<T> al, int index){
        return al.get(index);
    }
}