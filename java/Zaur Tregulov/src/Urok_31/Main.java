package Urok_31;

class Info<T>{
    private T value;

    Info(T value){
        this.value=value;
    }

    public String toString(){
        return "{{" + value + "}}";
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("apple");
        String s = stringInfo.getValue();
        System.out.println(stringInfo);

        Info<Integer> integerInfo = new Info<>(85);
        int i = integerInfo.getValue();
        System.out.println(integerInfo.getValue());
    }
}

