package section_6_lambda.WithInterface;

import java.util.ArrayList;

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo{
    void printStudent(Student st){
        System.out.println(st.name + " " + st.sex + " " + st.age + " " + st.course + " " + st.avgGrade);
    }

    void testStudent(ArrayList<Student> list, StudentChecks studentChecks){
        for (Student student: list){
            if (studentChecks.check(student)){
                printStudent(student);
            }
        }
    }

}

interface StudentChecks{
    boolean check(Student student);
}

class StudentOverAge implements StudentChecks{
    @Override
    public boolean check(Student student) {
        return student.age > 25;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 'm', 24, 3, 78.98);
        Student st2 = new Student("Felix", 'm', 18, 1, 59.52);
        Student st3 = new Student("Helena", 'f', 20, 3, 85.43);
        Student st4 = new Student("Lisa", 'f', 27, 4, 90.34);
        Student st5 = new Student("Fernand", 'm', 31, 2, 67.35);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        StudentOverAge studentOverAge = new StudentOverAge();
        studentInfo.testStudent(list, studentOverAge);

        System.out.println("-----------------------");

        studentInfo.testStudent(list, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.age > 25;
            }
        });

        System.out.println("-------------------------");

        studentInfo.testStudent(list, student -> student.avgGrade < 70);
    }
}
