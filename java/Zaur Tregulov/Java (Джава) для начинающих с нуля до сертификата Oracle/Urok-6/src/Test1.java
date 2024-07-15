public class Test1 {
    public static void main(String[] args) {
        Audi audi = new Audi();
        System.out.println("------------");
        Audi audi1 = new Audi(2001);
    }
}

class Car{
    Car(){
        System.out.println("Car");
    }

    Car(int a){
        System.out.println("Car int a");
    }
}

class Audi extends Car{
    Audi(){
        super(90);
    }

    Audi(int a){
        super(a);
    }
}