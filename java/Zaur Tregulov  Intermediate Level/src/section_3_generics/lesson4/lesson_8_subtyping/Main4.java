package section_3_generics.lesson4.lesson_8_subtyping;

class A<T extends Xyz&One&Two>{
    private T value;

    A(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "{" + "value=" + value + "}";
    }
}

class Xyz{}
interface One{}
interface Two{}

class Foo extends Xyz implements One,Two{}

public class Main4 {
    public static void main(String[] args) {
        A<Foo> integerA = new A<Foo>(new Foo());
        System.out.println(integerA.toString());
    }
}
