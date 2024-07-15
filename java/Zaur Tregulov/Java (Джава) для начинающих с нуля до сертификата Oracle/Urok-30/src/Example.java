import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

// Type inference
public class Example {
    public static void main(String[] args) {
        var num1 = "67";
        System.out.println(num1);
        num1 = "34";
        System.out.println(num1);
        num1 = "salom";

        var car = new Car("audi", 1000);
        System.out.println(car.carName);

//        var str;
//        str=90;
        System.out.println(foobar(3));

        var t = foobar(5);


    }

    public static int foobar(int a){
        var b = a;
        return b*b;
    }

}

class Car{
    String carName;
    int year;

    public Car(String carName, int year) {
        this.carName = carName;
        this.year = year;
    }
}
