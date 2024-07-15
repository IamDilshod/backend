package section_3_generics.lesson4.lesson_8_subtyping;

import java.util.*;

class X{}

class Y extends X{};

public class Main {
    public static void main(String[] args) {
        X x = new Y();

//        List<X> list = new ArrayList<Y>();

//        List<Number> numberList = new ArrayList<Integer>();
//        numberList.add(34);
//        numberList.add(6.3);
    }
}


