public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(String surname3, int age3){
        surname=surname3;
        age=age3;
    }

    Employee(int id2, String surname2, int age2){
        this(surname2, age2);
        id=id2;
//        Employee(surname2, age2);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4){
        this(id4, surname4, age4);
        salary=salary4;
        department=department4;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ivanov", 34);
        System.out.println(employee.id);
        System.out.println(employee.surname);
        System.out.println(employee.age);

        System.out.println("--------------------");

        Employee employee2 = new Employee("Petrov", 4);
        System.out.println(employee2.department);

        System.out.println("--------------------");

        Employee employee3 = new Employee(3, "Pavlov", 53, 100.45, "IT");
        System.out.println(employee3.surname);

    }
}
