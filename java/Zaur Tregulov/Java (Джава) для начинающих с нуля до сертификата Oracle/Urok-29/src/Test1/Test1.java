package Test1;

public class Test1 {
    public static void main(String[] args) {
        Employee employee1 = new Teacher();
        Employee employee2 = new Doctor();

//        employee1.sleep();
//        employee1.work();
//        employee1.help();

        Employee [] array = {employee1, employee2};

        for(Employee employee: array){
            employee.work();
        }
    }
}

abstract class Employee implements HelpAble{
    void sleep(){
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

interface HelpAble{
    void help();
}

class Teacher extends Employee{
    @Override
    public void sleep(){
        System.out.println("Teacher sleeps");
    }

    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Doctor extends Employee{
    @Override
    void sleep() {
        System.out.println("Doctor sleeps");
    }

    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}
