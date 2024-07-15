public class Test1 {
    public static void main(String[] args) {
        int a = 5;
        if(a < 3); // IF dan keyin " ; " qo'yilsa, undan keyingi qator if ga tegishli emas.
        // Har qanday holatda ham if dan keyingi kodlar bajariladi.
        System.out.println("Hello friend");

        if(a > 3) // IF dan keyin " ; " qo'yilmasa, undan keyingi qator if ga tegishli bo'ladi.
            // if ni ichidagi shart bajarilgan holatda, if dan keyingi kodlar bajariladi.
            System.out.println("Hello, Java");
    }
}
