package section_3_generics.lesson4.lesson2;

import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id){
//            return 0;
//        } else if (this.id < anotherEmp.id){
//            return -1;
//        } else{
//            return 1;
//        }

//        return this.id- anotherEmp.id;
        int result = this.name.compareTo(anotherEmp.name);
        // Agar bir xil ismlilar kelib qolsa, ularni familiyasi bilan solishtiramiz:
        if (result==0){
            result = this.surname.compareTo(anotherEmp.surname);
        }

        return result;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 23000);
        Employee emp2 = new Employee(20, "Ivan", "Petrov", 29000);
        Employee emp3 = new Employee(35, "Alex", "Fernand", 14500);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before Sorting");
        System.out.println(list);

        System.out.println("After Sorting");
        Collections.sort(list);
        System.out.println(list);
    }
}
