import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
//      String s = new String("salom dunyo va web java");
//        System.out.println(s.length());
//        int d = s.length();

//        char ch = s.charAt(2);
//        System.out.println(ch);
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }
//        for (char s1: s.toCharArray()){
//            System.out.println(s1);
//        }

//        int position = s.indexOf("o");
//        System.out.println(position);

//        System.out.println(s);
//        String s1 =s.trim();
//        System.out.println(s1);

//        String s1 = s.substring(1);
//        System.out.println(s1);
//        System.out.println(s);
//
//        System.out.println(s.contains(""));

//        System.out.println(s.startsWith("salom"));
//        System.out.println(s.startsWith("d", 5));

//        System.out.println(s.endsWith("java"));

//        System.out.println(s.replace("o", "X"));
//        System.out.println(s);
//
//
//        String str1 = "Salom dunyo";
//        String str2 = str1.toUpperCase().toLowerCase();
//        System.out.println(str1 == str2);
//        System.out.println(str2);
//        String str3 = str1.toLowerCase();
//        String str4 = "salom dunyo";
//        System.out.println(str3==str4);
//
//
//        char stra = str1.toLowerCase().toUpperCase().charAt(1);
//        System.out.println(stra);

        String str1 = "salom";
        String str2 = "Salom";
        String str4 = new String("salom");
        String str3 = new String("salom");

//        System.out.println(str1==str2);
//        System.out.println(str3.equals(str2));
//        System.out.println(str3.equalsIgnoreCase(str4));
        String str5 = new String(str1);
        System.out.println(str5==str1);

    }
}
