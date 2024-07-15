class Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10);

        switch (student.grade){
            case 2:
                System.out.println('2');
//                break;
//          E'tibor berish kerak bo'lgan joyi bor "default" bilan ishlayotganda, Agar
//          "default" ga tushadigan qiymat berilsa, defaultdan keyingi shartlar bajariladi.
//          Qachongachaki break uchramaguncha!!!
            default:
                System.out.println("Xatolik");
            case 3:
                System.out.println('3');
//                break;
            case 4:
                System.out.println('4');
                break;
            case 5:
                System.out.println('5');
                break;

        }
    }
}
