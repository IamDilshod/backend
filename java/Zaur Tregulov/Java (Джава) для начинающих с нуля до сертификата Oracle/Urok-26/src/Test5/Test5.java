package Test5;

public class Test5 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.showInfoAboutAnimal();
        mouse.showInfoAboutMouse();

    }
}

class Animal{
     protected String showName(){
        return "Animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {
    public String showName(){
        return "Mouse";
    }

    void showInfoAboutMouse(){
        System.out.println("Name of animal: " + showName());
    }
}
