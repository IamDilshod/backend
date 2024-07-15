package drugoy;

public class Example {
    final static int a=56;
    final int b;

    Example(int num){
        this.b=num;
    }

    public static void main(String[] args) {
        Example example = new Example(4);
        System.out.println(example.a);
    }
}
