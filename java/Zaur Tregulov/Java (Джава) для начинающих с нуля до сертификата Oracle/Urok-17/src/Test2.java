public class Test2 {
    public static void main(String[] args) {
        String email = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";

        int a = 0;
        int b = 0;
        int c = 0;

        while(c < ){
            a = email.indexOf("@", c);
            b = email.indexOf(".", c);
            c = email.indexOf(";", c + 1);
            System.out.println(email.substring(a, c+1));
        }
    }
}
