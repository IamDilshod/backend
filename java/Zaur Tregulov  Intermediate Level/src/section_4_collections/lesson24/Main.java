package section_4_collections.lesson24;

import java.util.*;

class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Fedor", 2);
        Student st2 = new Student("John", "Doe", 1);
        Student st3 = new Student("Andrei", "Roe", 3);

        Map<Student, Double> map = new HashMap<>();
        map.put(st1, 34.3);
        map.put(st2, 33.4);
        map.put(st3, 4.8);

        System.out.println(map);
        System.out.println("------------------------");

        Student st4 = new Student("Alex", "Fedor", 2);
        System.out.println(st1.equals(st4));
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
    }
}
