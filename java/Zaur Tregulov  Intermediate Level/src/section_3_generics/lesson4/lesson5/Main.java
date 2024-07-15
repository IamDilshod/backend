package section_3_generics.lesson4.lesson5;

// 5.  Parameterized class

class Info<T>{
    public T value;

    Info(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "{ " + value + " }";
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("One");
        System.out.println(stringInfo.toString());
        System.out.println(stringInfo.getValue());

        System.out.println("---------------------");

        Info<Integer> integerInfo = new Info<>(34);
        System.out.println(integerInfo.toString());
        System.out.println(integerInfo.getValue());
    }
}
