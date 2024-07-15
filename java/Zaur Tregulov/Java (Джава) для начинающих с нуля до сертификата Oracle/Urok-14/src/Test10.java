public class Test10 {
    public static void main(String[] args) {
        // Biz siklni har safar 1 ga(i++) emas, balki boshqa songa ham oshirsak ham bo'ladi.
        // Masalan, i+=2, i+=3, i+=4,....
        for(int i=2; i<=30; i+=2){
            System.out.println(i);
        }
    }
}
