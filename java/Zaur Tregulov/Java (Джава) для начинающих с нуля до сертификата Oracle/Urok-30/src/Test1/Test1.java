package Test1;

import java.util.ArrayList;

class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("oneee");
        if(obj instanceof Car){
            Car car = (Car)obj;
            return color.equals(car.color) && engine.equals(car.engine);
        }
        return false;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Car car1 = new Car("red", "V4");
        Car car2 = new Car("red", "V4");
        Car car3 = new Car("black", "V8");
        Car car4 = new Car("black", "V8");

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        System.out.println(list.contains(car4));
    }
}
