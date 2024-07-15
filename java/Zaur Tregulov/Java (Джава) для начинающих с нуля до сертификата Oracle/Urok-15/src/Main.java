public class Main {
    public static void main(String[] args) {
        int i=0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        // Bu yerda "i" ni qiymati 11 ga teng. Sababi "i" ni oxirgi qiymati 11 ga teng
        // bo'lib, shart bajarilmagani uchun chiqib ketadi!!! Bundan tashqari, "i" o'zgaruvchi
        // main() methodni ichida e'lon qilingan.
        System.out.println(i);
    }
}
