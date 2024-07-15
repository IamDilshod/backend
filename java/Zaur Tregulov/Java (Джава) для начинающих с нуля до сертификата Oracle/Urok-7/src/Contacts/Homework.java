package Contacts;

public class Homework {
    private double salary;
    public String surname;
    int id;

    private Homework(double salary){
        this.salary=salary;
    }

    public Homework(String surname){
        this.surname=surname;
    }

    Homework(int id){
        this.id=id;
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
}
