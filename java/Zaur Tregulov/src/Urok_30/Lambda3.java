package Urok_30;

interface Foo1{
    String foo(String str);
}

public class Lambda3 {
    public static void main(String[] args) {
        foobar(str -> str+ " hello");

        Foo1 d = str -> str + " !!!";

        System.out.println(d.foo("sssssddddddd"));
    }

    public static void foobar(Foo1 foo1){
        System.out.println(foo1.foo("salom"));
    }
}
