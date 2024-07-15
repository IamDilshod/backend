package Test3;

class A{
    static String s="";

    {
        s += "A";
    }

    static {
        s += "B";
    }

    {
        s += "C";
    }
}

public class Test2 {
    public static void main(String[] args) {
        System.out.println(A.s);
        System.out.println(A.s);

        A a = new A();
        A a1 = new A();

        System.out.println(A.s);
    }
}
