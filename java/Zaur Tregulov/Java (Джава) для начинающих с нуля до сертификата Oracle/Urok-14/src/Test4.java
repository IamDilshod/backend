public class Test4 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("After for loop");

        // Bu yerda xatolik beradi. Sababi "i" o'zgaruvchisi e'lon qilinmagan. For loop ni
        // ichidagi e'lon qilingan "i", o'sha for loop uchun local o'zgaruvchi bo'ladi.
        // For loop dan tashqarida undan foydalanib bo'lmaydi. Shuning uchun xatolik beradi:
//        System.out.println("i => " + i);
    }
}
