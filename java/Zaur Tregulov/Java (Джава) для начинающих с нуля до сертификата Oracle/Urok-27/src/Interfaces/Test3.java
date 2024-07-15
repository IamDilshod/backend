package Interfaces;

class Employee{
    double salary = 100;
    String name = "Kolya";
    int age;
    int exprience;

    void eat(){
        System.out.println("Employee is eating...");
    }

    void sleep(){
        System.out.println("Employee is sleeping...");
    }
}

class Teacher extends Employee implements HelpAble {
    int countOfPupils;

    void teach(){
        System.out.println("Teacher is eating...");
    }

    @Override
    public void help() {
        System.out.println("Teacher is helping...");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Teacher is tushit Pojar...");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}

class Driver extends Employee implements HelpAble, Swim_able{
    String nameOfMachine;

    void drive(){
        System.out.println("Driver is driving...");
    }

    @Override
    public void help() {
        System.out.println("Driver is helping..." + a);
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver is tushit Pojar...");
    }

    @Override
    public void swim() {
        System.out.println("Driver is swimming...");
    }
}

interface HelpAble {
    public final static int a = 12;
    public abstract void help();
    void tushitPojar();
    default void swim(){
        System.out.println("HelpAble swim");
    };
}

interface Swim_able{
    default void swim(){
        System.out.println("Swim_able swim");
    }
}

public class Test3 {
    public static void main(String[] args) {
        HelpAble helpAble = new Driver();
//        helpAble.tushitPojar();
        helpAble.swim();
    }
}
