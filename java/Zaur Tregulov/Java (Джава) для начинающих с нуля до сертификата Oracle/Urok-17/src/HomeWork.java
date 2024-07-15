public class HomeWork {
    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

    public static void email(String str){
        int a = 0;
        int b = 0;
        int c = 0;
        while(c < str.length()-1){
            a = str.indexOf("@", c);
            b = str.indexOf(".", c);
            a = str.indexOf(";",c+1);
            System.out.println(str.substring(a+1, b));
        }
    }
}
