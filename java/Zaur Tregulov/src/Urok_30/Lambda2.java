package Urok_30;

interface Foo{
    int foo(String str);
}

public class Lambda2 {
    public static void main(String[] args) {
        bar(str -> str.length());
    }

    public static void bar(Foo f){
        System.out.println(f.foo("hello"));
    }
}
