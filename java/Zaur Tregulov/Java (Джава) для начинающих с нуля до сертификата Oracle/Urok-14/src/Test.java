public class Test {
    public static void main(String[] args) {
//        int i=0;
        // Bu yerda "i" 2 marta e'lon qilinyapti bitta main() methodni ichida. Shuning
        // uchun xatolik beradi. O'zi aslida initilization jarayoni bir marta "int i=1"
        // deb e'lon qilinadi. Boshqa qaytib "int i=2, int i=3, int i=4,..." deb e'lon
        // ham qilmaydi, initilization ham qilmaydi.
        for(int i=1; i<10; i++){
            System.out.println("Hello");
        }

        // Bu yerda ham "i" e'lon qilinyapti, lekin xatolik bermayapti. Sababi for loop ni
        // ichidagi "i" for loop uchun local e'lon qilinyapti, for loopdan tashqarida
        // ko'rinmaydi. Shuning uchun, for loop dan keyin "i" e'lon qilish mumkin.
        int i = 0;
        System.out.println("i => " + i);
    }
}
