public class StringMethods2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefabcdef");

        // Aslida indexOf() methodi eng 1-uchragan string yoki char ni topadi va boshqasini
        // qidirib o'tirmaydi. Ba'zida biza qaysidir indexdan boshlab qiymatni qidirish
        // kerak bo'lsa pastdagi kabi ishlatsak bo'ladi.
        int i1 = s1.indexOf("a", 4);
        System.out.println(i1);


        // startsWith() bu method string qandaydir qiymatdan boshlanadimi yo'qmi shuni
        // aniqlaydi. Agar boshlansa "true", aks holda "false" qaytaradi.
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1); // true, chunki "s1" string "abc" dan boshlanadi.

        boolean b2 = s1.startsWith("bc");
        System.out.println(b2); // false, chunki "s1" string "bc" dan boshlanmaydi.

        boolean b3 = s1.startsWith("abc",6 );
        System.out.println(b3); // true, chunki "s1" string 6-indexi "abc" dan boshlanadi.


        // endsWith() methodi stringni qanaqadir qiymat bilan tugagan yoki tugamaganligini
        // aniqlash uchun ishlatiladi. Agar shart bajarilsa "true" qiymat, aks holda
        // "false" qiymat qaytaradi.
        boolean b4 = s1.endsWith("ef");
        System.out.println(b4);
    }
}
