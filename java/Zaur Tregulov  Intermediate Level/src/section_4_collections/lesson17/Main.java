package section_4_collections.lesson17;

import java.util.LinkedList;

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 3);
        Student st2 = new Student("Felix", 2);
        Student st3 = new Student("Rihanna", 4);
        Student st4 = new Student("Helena", 3);
        Student st5 = new Student("Mario", 1);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
        System.out.println(linkedList);

    }
}
