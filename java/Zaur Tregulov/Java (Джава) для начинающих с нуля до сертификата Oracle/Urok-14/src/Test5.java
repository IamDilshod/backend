public class Test5 {
    public static void main(String[] args) {
        // Bu yerda bitta for loop da bir nechta o'zgaruvchidan foydalanish mumkin.
        // Masalan, "k" va "j" lardan. Lekin e'tibor beradigan joyi bor!!! Agar for loopda
        // 1-o'zgaruvchi qaysi tipda e'lon qilingan bo'lsa, keyingi o'zgaruvchilar ham
        // shu tipda bo'lishi kerak. Agar har xil bo'lsa, xatolik beradi  ya'ni =>
        // for(int i=0; byte j=2, short k=4; i<5; i++) <= bunday yozish xato!!!
        for (int i=0, j=2, k=4; i<5; i++){
            System.out.println("i => " + i);
            System.out.println("j => " + j);
            System.out.println("k => " + k);
        }
    }
}
