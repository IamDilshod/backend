public class StringMethods1 {
    public static void main(String[] args) {
        /** ----------- STRING methods -----------------*/
        String s1 = new String("privet");

        int len = s1.length();
        System.out.println(len);

        // charAt(index) bu method string dagi biror indexdagi char qiymatini qaytaradi.
        char c1 = s1.charAt(3);
        System.out.println(c1);
//         Agar stringda yo'q index ni kiritsak, masalan kattaroq index ni, xatolik beradi.
        //  "String index out of range: 10" nomli xatoni beradi.
//        char c2 = s1.charAt(10);
//        System.out.println(c2);

        // indexOf() methodi berilgan string yoki char qiymatni qaysi indexda turganini aniqlab
        // beradi.
        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); // Bu yerda "vet" qiymati, "privet" ning 3-indexidan boshlab
        // boshlangan. Shuning uchun javobi 3 bo'ladi.
        System.out.println(i2);

        // Agar stringda yo'q qiymatni qidirsak, unda bizga "-1" ni qaytaradi.
        int i3 = s1.indexOf("Z"); // Bu yerda bizga "-1" ni qaytaradi.
        System.out.println(i3);
    }
}
