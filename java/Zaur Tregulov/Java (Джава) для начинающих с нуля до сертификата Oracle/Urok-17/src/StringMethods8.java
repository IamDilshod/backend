public class StringMethods8 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "hello world";
        // equals() va equalsIgnoreCase() methodlari bir xil ishlaydi, ya'ni
        // string larni teng yoki teng emasligini solishtiradi. Asosiy farqi shundaki,
        // deylik "text" va "TEXT" larni solishtirsak:
        // equals() methodi false qaytaradi,chunki
        // 2 lasi o'xshash bo'lgani bilan, katta-kichik harflarda farqi bor.
        // equalsIgnoreCase() methodi esa true qaytaradi, chunki katta-kichik harfga e'tibor bermaydi.
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
    }
}
