package Urok_30.Youtube1;

interface Printable{
    void print();
}

class Cat implements Printable{
    @Override
    public void print() {
        System.out.println("Meow");
    }
}

class Dog implements Printable{
    @Override
    public void print() {
        System.out.println("Wow");
    }
}

public class Main {
    public static void main(String[] args) {

        printSound(()->{
            System.out.println("Wow");
        });

        printSound(()->{
            System.out.println("Meow");
        });

        Printable printable = ()->{
            System.out.println("Kiki");
        };
        printable.print();
//        Cat cat = new Cat();
//        cat.print();
//
//        Dog dog = new Dog();
//        dog.print();

    }

    public static void printSound(Printable printable){
        printable.print();
    }
}
