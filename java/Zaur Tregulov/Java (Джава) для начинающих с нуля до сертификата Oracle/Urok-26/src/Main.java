public class Main {

//    public Employee foo(){
//        return new Xirurg();
//    }

    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        System.out.println(emp1.name);
        System.out.println(emp1.id);
        System.out.println(emp1.specialization);
        emp1.eat();
        emp1.sleep();
//        emp1.lechit();

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor doctor =  new Xirurg();
        System.out.println(doctor.id);
        System.out.println(doctor.name);
        System.out.println(doctor.specialization);
        doctor.eat();
        doctor.sleep();
        doctor.lechit();
//        doctor.operatsiya();
        Employee emp4 = new Xirurg();


    }
}

class Employee {
    String name;
    int id;
    String specialization;

    void sleep(){}
    void eat(){}
}

class Doctor extends Employee{
    void lechit(){}
}

class Xirurg extends Doctor{
    String skalpel;

    void operatsiya(){}
}

class Driver extends Employee{
    void drive(){}
}

class Teacher extends Employee{
    void teach(){}
}
