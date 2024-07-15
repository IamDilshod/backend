package Urok_24;

public class Test {
    public static void main(String[] args) {}
}

abstract class A{
    int a = 9;

    abstract void foo();
    abstract void bar();
}

class B extends A{
    @Override
    void foo() {
        System.out.println("foo");
    }

    @Override
    void bar() {}
}

// Agar ota B class A abstract classni abstract methodlarini override qilgan bo'lsa,
// C da ularni override qilish shart emas.
class C extends B{
}
