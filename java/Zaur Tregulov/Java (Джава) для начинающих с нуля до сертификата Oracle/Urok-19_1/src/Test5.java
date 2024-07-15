public class Test5 {
    public static void main(String[] args) {
//        sum("OK", 1,2,3,4,5);
//        sum("Hello",  new int[]{4,5,6}); // Massiv bersak ham bo'ladi.
//        sum("All right", null); // null berib bo'lmaydi, sababi a.length da
        // null ni lengthi yo'q.

        sum(4, 1,2,3,4);

    }

    public static void sum(int s, int  ...a){
        int S = 0;
        for (int i=0; i<a.length; i++){
            S += a[i];
        }

        System.out.println(S);
    }
}
