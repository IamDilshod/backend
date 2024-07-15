public class Test4 {
    void maximum(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("Maximum - " + a);
        } else if(b> a && b > c){
            System.out.println("Maximum - " + b);
        } else{
            System.out.println("Maximum - " + c);
        }
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.maximum(3,5,1);
    }
}
