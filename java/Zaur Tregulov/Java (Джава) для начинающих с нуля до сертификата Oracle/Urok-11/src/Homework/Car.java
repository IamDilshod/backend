package Homework;

public class Car {
    public String color;
    public String engine;
    public int doorCount;


}

class CarTest{
    public static void changeDoorCount(Car car, int doorCount){
        car.doorCount = doorCount;
    }

    public static void changeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
}