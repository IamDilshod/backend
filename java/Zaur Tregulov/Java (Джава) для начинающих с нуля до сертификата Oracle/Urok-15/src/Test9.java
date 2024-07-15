public class Test9 {
    public static void main(String[] args) {
        int a = 5;

        // B uyerda bir narsaga e'tibor berish kerak. while ni ichiga "a" kiradi,
        // uning qiymatini 1 ga oshirib a=6 qilib chiqadi. To'g'ri shart bajarilmaydi, ya'ni
        // 6 > 10 degan shart bajarilmasa ham.
        while (++a > 10){
            System.out.println(a);
            a++;
        }
        System.out.println(a); // 6 ni chiqaradi.
    }
}

