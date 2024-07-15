package Urok_30_part2;

import java.util.*;
import java.util.function.*;

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> ourCar = createThreeCars(() -> new Car("Audi", "black", 4.5));
        System.out.println(ourCar);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();

        for (int i=0; i<3; i++){
            al.add(carSupplier.get());
        }

        return al;
    }
}
