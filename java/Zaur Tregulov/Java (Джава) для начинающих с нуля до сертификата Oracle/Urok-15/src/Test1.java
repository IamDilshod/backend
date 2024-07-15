public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        boolean b = true;

        while (b){
            System.out.println(a);
            if(a % 3 == 0 && a % 7 == 0){
                break;
            }
            a++;
        }
    }
}
