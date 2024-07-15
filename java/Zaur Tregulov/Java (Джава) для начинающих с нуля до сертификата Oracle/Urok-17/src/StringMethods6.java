public class StringMethods6 {
    public static void main(String[] args) {
        String s1 = "Privet,";
        String s2 = "drug";
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);

        System.out.println("------------------------------------");
        int a = 3;
        int b = 4;
        String s10 = "ok";
        System.out.println(a+b+s10); // Agar boshida number kelsa, birinchi ularni matematik
        // hisoblaydi. Stringni esa shunchaki ulab qo'yadi.


        System.out.println(""+a+b+s10); // Bu vaziyatda esa, eng boshida string turgani uchun,
        // "a" va "b" sonlarni string sifatida ko'radi va ularni matematik qo'shmaydi,
        // balki shunchaki ulab qo'yadi


        System.out.println(""+(a+b)+s10); // Agar stringdan keyin turgan sonlarni matematik
        // qo'shish uchun ularni qavsga olish kerak.


        int c = 45;
        boolean isStatus = false;
//        System.out.println(c + isStatus); // Bu yerda int va boolean ni concat qila olmaymiz
        // + operatori bilan. Chunki ular har xil tiplardir.


        String s100 = null;
        s100 += "OK";
        System.out.println(s100); // nullOK

    }
}
