package Test2;

class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }

    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        if (o instanceof  Car){
            return color.equals(car.color) && engine.equals(car.engine);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V8");
        Car car4 = new Car("black", "V8");

        System.out.println(car1==car2); // false
        System.out.println(car1.equals(car2)); // false

        System.out.println("----------------------");

        System.out.println(car1);
    }
}
