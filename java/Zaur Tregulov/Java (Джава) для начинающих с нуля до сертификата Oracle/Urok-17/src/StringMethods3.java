public class StringMethods3 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        // substring() methodi bilan stringdan xohlagan qismini kesib olishimmiz mumkin.
        String s10 = s1.substring(3); // Bu yerda 3-index dan boshlab oxirigacha kesib oladi.
        System.out.println(s10); // "defgabcd"
        System.out.println(s1); // Asl string "s1" o'z holicha turibdi o'zgarmagan.
        // Chunki, string immutable hisoblanadi.

        String s11 = s1.substring(3, 7); // Bu yerda 3-indexdan boshlab, 7-indexgacha kesib
        // oladi. Lekin 7-index kirmaydi.
        System.out.println(s11); // "defg"

        String s12 = s1.substring(3,23); // Agar oralig'imizdan kattaroq son berilsa,
        // kesib olish uchun, unda xatolik beradi
        System.out.println(s12); // Error


    }
}
