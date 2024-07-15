public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human{
    String name = "Ivan";
    Car car = new Car();

    public static void main(String[] args) {
        final Human human = new Human();
//        human.car.engine="V 885";
//        human = new Human();
        human.name="ssa";
        System.out.println(human.car.engine);
    }
}
