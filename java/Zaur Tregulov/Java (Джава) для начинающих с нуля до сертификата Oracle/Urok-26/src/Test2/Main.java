package Test2;

public class Main {
    void foo(Animal a){
        System.out.println("A");
    }

    void foo(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Animal animal = new Mouse();
        Mouse mouse = new Mouse();
//        Animal animal1 = new Animal();
        main.foo(animal);
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
//    @Override
    void getName(){
        System.out.println("Mouse");
    }
}