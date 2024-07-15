package Interfaces;

interface A{
    void abc();

    default void def(){
        System.out.println("This is def() method");
    }

    default void ghi(){
        System.out.println("This is ghi() method");
    }
}

class B implements A{
    @Override
    public void abc() {
        System.out.println("This is abc() method");
    }
}

public class Test4 {
    public static void main(String[] args) {
        B b = new B();
        b.abc();
        b.def();
        b.ghi();
    }
}
