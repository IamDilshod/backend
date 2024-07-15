public class Test {
    public static void main(String[] args) {
        double d1 = 5.5;
        double d2 = 3.6;
        System.out.println(d1/d2);

        long l1 = 100L;
        int i1 = 32;
        i1 = (int) l1;
        System.out.println(i1);

        float f1 = 34.56F;
        double d3 = 45.34;
        f1 = (float)d3;
        d3 = f1;
        System.out.println(d3);
    }
}
