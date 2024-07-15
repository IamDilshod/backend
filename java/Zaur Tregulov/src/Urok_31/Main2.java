package Urok_31;

import java.util.ArrayList;

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        String s = GenMethod.getSecondElement(stringArrayList);
        System.out.println(s);

        System.out.println("---------------------");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(52);
        integerArrayList.add(93);
        integerArrayList.add(72);
        int i = GenMethod.getSecondElement(integerArrayList);
        System.out.println(i);
    }
}
