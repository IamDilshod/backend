package Urok_23;

class Animal{
    String showName(){
        return "Some Animal";
    }

    void showInfo(){
        System.out.println("Name of the animal: " + showName());
    }
}

class Mouse extends Animal{
    String showName(){
        return "Mouse";
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showInfo();
    }
}