package section_3_generics.lesson4.lesson_8_subtyping;

class Gen{
    static <T,V extends Number> void display(T t, V v){
        System.out.println("t = " + t);
        System.out.println("v = " + v);
    }
}

class Animal{}

public class Main3 {
    public static void main(String[] args) {
        Gen.display("hello", 90);
        Gen.display(new Animal(), 32.9);
        Gen.display(5, 7);
//        Gen.display(34, "salom"); // V extends Number bo'lgani uchun, 2-parametrga
        // Number type yoki uning subclassini yozish kerak
    }
}
