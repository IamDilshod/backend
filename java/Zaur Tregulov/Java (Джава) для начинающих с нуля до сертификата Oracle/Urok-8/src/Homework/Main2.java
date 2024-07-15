package Homework;

public class Main2 {
    static final float PI = 3.14f;

    public float showSquare(int radius){
        float square = PI*radius*radius;
        return square;
    }

    public static float showSquareStatic(int radius){
        float square = 2*PI*radius;
        return square;
    }
}

class Main2Test{
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        System.out.println(main2.showSquare(3));
        System.out.println(Main2.showSquareStatic(4));
    }
}
