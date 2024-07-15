package Test3;

class Test1{
    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher();
        Employee emp = new Teacher();
        System.out.println(emp.salary);
        System.out.println(employee.salary);
    }
}

class Food{}
class Fruit extends Food{}

class Employee {
    static double salary = 100;
    String name = "Alex";

    public Food eat(){
        System.out.println("Employee is eating...");
        return new Food();
    }

    private void sleep(){
        System.out.println("Employee is sleeping...");
    }
}

class Teacher extends Employee{
    int countPupil;
    static double salary = 200;

    public Food eat(){
        System.out.println("Teacher is eating...");
        return new Fruit();
    }

    void teach(){
        System.out.println("Teacher is teaching...");
    }

    void sleep() {
        System.out.println("Teacher is sleeping...");
    }
}
