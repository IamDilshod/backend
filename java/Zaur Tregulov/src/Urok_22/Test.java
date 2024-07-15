package Urok_22;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "St1");
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println("----------------------------");

        Student s = foobar(student);
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println("----------------------------");

        System.out.println(student.id);
        System.out.println(student.name);

    }

    public static Student foobar(Student s){
        s.id=9099;
        s.name="AAAA";

        return s;
    }
}
