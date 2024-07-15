package Urok_22;

class Animal{
    protected String name = "Anim";

    Animal(){
        System.out.println("Animal");
    }

    protected void foobar(){
        System.out.println(this.name);
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog");
    }
}

class Puppy extends Dog{
    Puppy(){
        System.out.println("Puppy");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();

    }
}
