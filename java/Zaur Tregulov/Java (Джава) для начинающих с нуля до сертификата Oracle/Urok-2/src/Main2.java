public class Main2 {
    public static void main(String[] args) {
        // byte ni chegarasi => [-128 ; 127] shu oralig'da bo'ladi.
        // Agar shu oraliqdan tashqari qiymat bersak, xatolik beradi.
        byte b1 = 31;
//        byte b2 = 452; // Xato, chunki oraliqdagi son emas
        // byTe=4; // bunday, yozsak xatolik beradi.



        // short ni chegarasi => [-32768 ; 32767] shu oralig'da bo'ladi.
        // Agar shu oraliqdan tashqari qiymat bersak, xatolik beradi.
        short s1 = 9028;
//        short s2 = 45900; // Xato, chunki oraliqdagi son emas

        float d = 90.89f;
        float b = 34.098f;
        System.out.println(d+b);

        // int ni chegarasi => [-2147483648 ; 2147483647] shu oralig'da bo'ladi.
        // Agar shu oraliqdan tashqari qiymat bersak, xatolik beradi.
        int i1 = 932;
        int i2 = 9023847;
//        int i3 = 2_340_094_240; // Xato, chunki oraliqdagi son emas

        // long ni chegarasi => [-9223372036854775808 ; 9223372036854775807]
        // Agar shu oraliqdan tashqari qiymat bersak, xatolik beradi.
        long l1 = 4353;
        long l2 = 2_340_094_240L;
        long l3 = 200_000_000_000_000L;

        // int type byte, short, long uchun default type hisoblanadi. Bu nima degani?
        // Yuqorida e'tibor bergan bo'lsangiz, l1 dagi sonning oxiriga "L" ni qo'shmadik,
        // lekin l2 va l3 ga qo'shdik. Agar l2 va l3 ga qo'shmasak xatolik beradi. Sababi,
        // int type nig chegarasidagi son long type ga yozilsa "L" kerak emas, xuddi
        // l1 ga yozilgani kabi. Demak long type uchun int type chegarasiga sig'adigan son
        // yozilsa, xatolik bermaydi, lekin undan kattaroq son berilsa, xatolik beradi.

        //Shu narsa float va double da ham bor. Keyingi Main.java da berilgan.

        char c1 = 'H';
        char c2 = 'f';
        char c3 = ' ';
        char c4 = 65; //"A". char sonni olishi mumkin, bu holatda 65-o'rinda turgan UNI Codedagi
        // simvolni ko'rsatadi.
        System.out.println(c4);

        char c5 = '\u0065';
        System.out.println(c5);
    }
}
