class Car{
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("Svet mashini: "+color+" Motor: "+engine+" Skorost: "+speed);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="white";
        car.engine="V6";
        car.speed=60;

        car.showInfo();
        car.gaz(30);
        car.showInfo();
        car.tormoz(20);
        car.showInfo();
        car.tormoz(30);
        car.showInfo();
    }
}


