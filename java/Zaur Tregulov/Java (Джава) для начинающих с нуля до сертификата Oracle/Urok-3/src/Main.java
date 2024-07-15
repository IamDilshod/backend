public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 3;
        int d = 1;

        boolean bool1 = a > b && c++ > d; // Bu yerda e'tibor qaratish lozim bo'lgan joy mavjud.
        // "&&" va "||" operatorlari "Short curcuit" operator deyiladi. Agar "&&" operatorini bilan
        // boshqa o'zgaruvchilarni solishtirsak, hamma o'zgaruchilarni TRUE va FALSE ga tekshirib chiqadi.
        // Agar bitta o'zgaruvchi false bo'lsa, o'sha false dan keyingi o'zgaruchilarni tekshirib
        // o'tirmasdan tashlab ketadi.
        //Agar "||" operatorini bilan
        // boshqa o'zgaruvchilarni solishtirsak, hamma o'zgaruchilarni TRUE va FALSE ga tekshirib chiqadi.
        // Agar bitta o'zgaruvchi true bo'lsa, o'sha true dan keyingi o'zgaruchilarni tekshirib
        // o'tirmasdan tashlab ketadi.

        // Yuqoridagi "c++" ifodasi bajariladi, sababi "&&" operatori, 1-turgan "a>b" dan true ni oladi
        // va keyingi qatorni ham tekshirib ko'radi false bo'lmasmikin deb. Agar birinchi ifodani o'zida,
        // false qaytganda edi, keyingi "c++ > d" ifodaNI TEKSHIRIB O'TIRMAS EDI  va "c++" dagi increment
        // bajarilmay qolardi.

        System.out.println(bool1);
        System.out.println(c);
    }
}

