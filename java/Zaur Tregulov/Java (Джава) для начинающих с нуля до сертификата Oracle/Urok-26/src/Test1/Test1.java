package Test1;

public class Test1 {
    public static void main(String[] args) {
        Employee emp = new Teacher();
    }
}

class A{}
class B extends A{};

class Employee {
    String name;
    int id;
    String specialization;

    void sleep(){
        System.out.println("Employee sleeping...");
    }
    protected void eat(){
        System.out.println("Employee eating...");
    }

    public Employee foo(){
        return new Employee();
    }

    public A bar(){
        return new A();
    }
}

class Teacher extends Employee {
    public int kolichestvoUchenikov;

    void teach(){
        System.out.println("Teacher uchit...");
    }

    public void eat(){
        System.out.println("Teacher is eating...");
    }

    public Teacher foo(){
        return new Teacher();
    }

    public B bar(){
        return new B();
    }
}