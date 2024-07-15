class Main {
    public static void main(String[] args) {
        System.out.println("salom");
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Test");
        Car car=new Car();
        car.id=534;
        Car car1 = car;
        System.out.println(car.id);
        System.out.println(car1.id);
        car1.id=9999;
        System.out.println(car.id);
        System.out.println(car1.id);

    }
}

class Car{
    int id;
    String engine;
}



