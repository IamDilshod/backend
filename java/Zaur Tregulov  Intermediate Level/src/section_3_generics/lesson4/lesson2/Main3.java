package section_3_generics.lesson4.lesson2;

import java.util.*;

class Student{
    int id;
    String name;
    String surname;
    int salary;

    public Student(int id, String name, String surname, int salary) {
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
}

class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student st1, Student st2) {
        if (st1.id == st2.id){
            return 0;
        } else if (st1.id < st2.id){
            return -1;
        } else{
            return 1;
        }
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student st1, Student st2) {
        return st1.surname.compareTo(st2.surname);
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        Student st1 = new Student(100, "Zaur", "Tregulov", 23000);
        Student st2 = new Student(20, "Ivan", "Petrov", 29000);
        Student st3 = new Student(35, "Alex", "Fernand", 14500);

        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println("Before Comparision " + list);

        Collections.sort(list, new IdComparator());
        System.out.println("After Comparision " + list);

    }
}
