public class Test7 {
    public static void main(String[] args) {
        // for ni ichida foobar() f-yani chaqirish ham mumkin.
        for(int i=0; i<5; i++, foobar(100)){
            System.out.println(i);
        }
    }

    static void foobar(int n){
        System.out.println(n);
    }
}
