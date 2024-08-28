import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Student alisher = new Student("Alisher", 19);
        Student lola = new Student("Lola", 22);
        Student john = new Student("Lola", 22);

        al.add(alisher);
        al.add(lola);
        System.out.println(al);

        al.remove(john);
        System.out.println(al);
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student) obj;
            return this.name.equals(student.name)
                    && this.age == student.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" + this.name + " = " + this.age + "}";
    }
}

