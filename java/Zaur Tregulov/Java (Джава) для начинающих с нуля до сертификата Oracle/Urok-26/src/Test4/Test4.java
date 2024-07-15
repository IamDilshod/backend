package Test4;

public class Test4 {
    public static void main(String[] args) {
        Animal animal = new Mouse();
        animal.showInfo();
    }
}

class Animal{
    String showName(){
        return "Animal";
    }

    void showInfo(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal{
    String showName(){
        return "Mouse";
    }
}
