package Interfaces;

interface Title{
    static void foo(){
        System.out.println("foo() method");
    }
}

public class Test6{
    public static void main(String[] args) {
        Title.foo();
    }
}
