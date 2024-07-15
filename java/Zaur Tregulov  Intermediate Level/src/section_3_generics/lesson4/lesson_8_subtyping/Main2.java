package section_3_generics.lesson4.lesson_8_subtyping;

class Info<T extends String>{
    private T value;

    Info(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "{" + "value=" + value + "}";
    }
}

class Bus{}

public class Main2 {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("hello");
        System.out.println(stringInfo.toString());

//        Info<Integer> integerInfo = new Info<>(34);
//        System.out.println(integerInfo.toString());
//
//        Info<Bus> busInfo = new Info<>(new Bus());
//        System.out.println(busInfo.toString());
    }
}

