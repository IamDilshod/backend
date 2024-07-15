public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int summa = test.sum(5, 4, 6);
        System.out.println(summa);
    }
}

class Test{
    int sum(int a, int b, int c) {
        int result = a+b+c;
        return result;

    }
}
