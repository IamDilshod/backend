package Tests;

import Contacts.Homework;

public class HomeworkTest {
    public static void main(String[] args) {
        Homework homework = new Homework("Alex");
//        Homework homework1 = new Homework(56);
        System.out.println(homework.getId());
        System.out.println(homework.getSurname());
        System.out.println(homework.getSalary());
    }
}
