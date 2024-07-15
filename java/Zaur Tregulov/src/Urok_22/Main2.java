package Urok_22;

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
}

class Doctor extends Employee{
    String spezalisatsiya;

    void lechit(){
        System.out.println("Lechit...");
    }
}

class Teacher extends Employee{
    int countPupil;

    void uchit(){
        System.out.println("Uchit...");
    }
}

class Driver extends Employee{
    String nameCar;

    void drive(){
        System.out.println("Driving...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.age=35;
//        doctor.name="Ivanov";
        doctor.spezalisatsiya="Xirurg";
        doctor.sleep();
        System.out.println(doctor.name);
    }
}
