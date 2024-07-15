package Interfaces;

interface A1{
    default void def(){
        System.out.println("This is def() method in A1");
    }
}

interface A2 extends A1{
    default void def(){
        System.out.println("This is def() method in A2");
    }
}

class B1 implements A1, A2{
    A1 a1 = new B1();
//    a1.def();
}

public class Test5 {
    public static void main(String[] args) {

    }
}
