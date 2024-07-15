public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        // Bu yerda while loop imiz "infinitive loop" hisoblanadi. Sababi 5 har doim 10 dan
        // kichikdir va "a" ni qiymati oshmayapti, doim 10 ga teng va bu shart har doim
        // true ni qaytaradi. Biz har doim  "Hello" yozuvini ko'ramiz, lekin "World" ni
        // umuman ko'rmaymiz. Sababi inifinitive loop ni hisobiga.
        while(a < 10){
            System.out.println("Hello");
        }
        System.out.println("World");
    }
}
