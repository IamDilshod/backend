package drugoy;

public class Student {
    String name;
    int course;
    static int count;
    static int f;

    Student(String name, int course){
        this.name=name;
        this.course=course;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public void foo(){
        count++;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3);
        Student student2 = new Student("Dima", 4);
        Student student3 = new Student("Marina", 1);

        System.out.println("f => " + f);
        System.out.println(Student.count);
        System.out.println(getCount());
        student1.foo();
        System.out.println(getCount());
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student("Mariya", 1);
        System.out.println(student);
        System.out.println(Student.count);
        System.out.println(Student.getCount());
    }
}