public class StringMethods5 {
    public static void main(String[] args) {
        String s1 = new String("Hello world");

        String s10 = s1.replace('l', 'x'); // Bu yerda "l" harfini "x" harfiga
        // almashtiradi.
        System.out.println(s10);


        String s11 = s1.replace('s', 'R'); // Agar biz stringni ichida mavjud
        // bo'lmagan qiymatni boshqa bir qiymatga almashtirmoqchi bo'lsak, xatolik
        // bermaydi, faqat original stringni o'zini chiqarib qo'yadi.
        System.out.println(s11);


        String s12 = s1.replace("lo", "LO");
        System.out.println(s12);


        // replace() methodi bilan ishlaganda ehtiyot bo'lish kerak. Bu method string bilan string ni
        // yoki char bilan char ni almashtiradi. string bilan charni yoki aksini almashtirmaydi.
        // Aks holda ERROR beradi.
//        String s13 = s1.replace("lo", 'K'); // "no suitable method found for replace"
    }
}
