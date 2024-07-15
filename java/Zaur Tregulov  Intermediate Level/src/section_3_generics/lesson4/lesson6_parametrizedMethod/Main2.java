package section_3_generics.lesson4.lesson6_parametrizedMethod;

public class Main2 {
    public static void main(String[] args) {
        OtherPair<String> otherPair = new OtherPair<>("hello", "ok");
        System.out.println(otherPair.getValue1());
    }
}

class OtherPair<V>{
    private V value1;
    private V value2;

    OtherPair(V value1, V value2){
        this.value1=value1;
        this.value2=value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}