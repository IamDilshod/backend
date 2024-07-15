package Urok_23;

class Employee{
    String name="Kolya";
    int age;
    int exprience;

    void eat(){
        System.out.println("Eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }

    Employee foo(){
//        return new Employee();
        return new Doctor();
    }

    Employee bar(){
        return new Doctor();
    }
}

class Doctor extends Employee {
    String spezalisatsiya;

    void lechit(){
        System.out.println("Lechit...");
    }
}

class Teacher extends Employee {
    int countPupil;

    void uchit(){
        System.out.println("Uchit...");
    }
}

class Driver extends Employee {
    String nameCar;

    void drive(){
        System.out.println("Driving...");
    }
}

class Driver2 extends Driver{
    String s = "Driver 2";

    void driver2(){
        System.out.println("Driver2 2");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
