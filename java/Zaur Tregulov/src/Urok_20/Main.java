package Urok_20;

import java.util.ArrayList;
import Urok_22.*;

public class Main {
    public static void main(String[] args) {
        String s1= "one";
        String s2= "two";
        String s3= "three";

        ArrayList<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (String s : list){
            System.out.println(s);
        }

        System.out.println("--------------------");

        list.remove(new String("two"));

        for (String s : list){
            System.out.println(s);
        }
    }
}

class Dog extends Anim{

    Dog(String name){
        super(name);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Simba");
        System.out.println(" dog " + d.name);
    }
}