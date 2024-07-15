package Homework;

public class Main {
    public static int multiple(int a, int b, int c){
        return a*b*c;
    }

    public static void foo(int a, int b){
        System.out.println(a/b);
    }
}

class MainTest{
    public static void main(String[] args) {
        System.out.println( Main.multiple(1,2,3));
        Main.foo(4,2);
    }
}