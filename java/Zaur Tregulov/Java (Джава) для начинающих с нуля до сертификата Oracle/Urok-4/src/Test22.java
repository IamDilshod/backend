public class Test22 {
    double a;
    final int ff=0;
    static final String str="hello";

    Test22(int a){
        this.a=a;
    }

    public static void main(String[] args) {
        Test22 obj = new Test22(4);
        Test22 obj2 = new Test22(55);

        System.out.println(obj.a);
        System.out.println(obj2.a);

        System.out.println("------------------");
        obj.a=90909;
        System.out.println(obj.a);
        System.out.println(obj2.a);
    }

    public static void foobar(int a, int b){

    }
}
