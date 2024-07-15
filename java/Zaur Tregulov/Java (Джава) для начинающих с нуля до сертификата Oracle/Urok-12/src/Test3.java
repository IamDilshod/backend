public class Test3 {
    public static void main(String[] args) {
        int a = 500;
        boolean b = true;

        if(a < 200){
            int x = 9;
            System.out.println("1");
        } else if(a < 400){
            int x = 3;
            System.out.println("2");
        } else if (b == true){
            int x = 6;
            System.out.println("3 true");
        }
    }
}
