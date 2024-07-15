public class StringMethods4 {
    public static void main(String[] args) {
        String s1 = new String("      abcdef     ghijk          ");

        // trim() methodi string ning 2 tomonidagi probel(whitespace) larni o'chiradi,
        // lekin stringlar orasidagini o'chirmaydi
        String s10 = s1.trim();
        System.out.println(s10);
    }
}
