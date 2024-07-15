package Urok_22;
// Encapsulation
class Person{
    final String sex;
    private String name;
    private StringBuilder surName;
    private int age;
    private int mass;

    Person(String sex){
        this.sex=sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurName(StringBuilder surName) {
        this.surName = surName;
    }

    public StringBuilder getSurName() {
        // Bu yerda biz yangi StringBuilder objectini yaratamiz. Asl objectga
        // tegishmasdan, uning o'rniga yangi yaratilgan objectni qaytaramiz.
        StringBuilder sb = new StringBuilder(surName);
        return sb;

        // Bu yerda esa asl objectni qaytaramiz.
//        return surName;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setMass(int mass) {
        if (mass > 0){
            this.mass = mass;
        }
    }

    public int getMass() {
        return mass;
    }
}

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("male");
        alex.setSurName(new StringBuilder("Chester"));
        System.out.println(alex.getSurName());
        alex.getSurName().append(" hola");
        System.out.println(alex.getSurName());
    }
}
