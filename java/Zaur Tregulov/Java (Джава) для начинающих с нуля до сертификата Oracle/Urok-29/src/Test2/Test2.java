package Test2;

public class Test2 {
    int a = 5;
    public static void main(String[] args) {
        Employee employee = new Doctor();
        Doctor doctor = (Doctor) employee;
        System.out.println(doctor.name);
        System.out.println(doctor.id);
    }
}

class Employee {
    String name = "Employee";
    int id = 92;
    String specialization = "Employee specialization";

    void sleep(){}
    void eat(){}
}

class Doctor extends Employee{
    String doctorAddress = "London, Ave street";
    void lechit(){
        System.out.println("Doctor is treating...");
    }
}

class Xirurg extends Doctor{
    String skalpel = "Skalpel Xirurga";

    void operatsiya(){
        System.out.println("Xirurg is doing operation...");
    }
}

class Driver extends Employee{
    void drive(){
        System.out.println("Driver is driving...");
    }}

class Teacher extends Employee{
    void teach(){
        System.out.println("Teacher is teaching...");
    }
}