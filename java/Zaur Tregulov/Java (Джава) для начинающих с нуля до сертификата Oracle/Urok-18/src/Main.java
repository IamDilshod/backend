import java.io.StringBufferInputStream;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("123");
//        StringBuilder stringBuilder2 = stringBuilder1;
//        System.out.println(stringBuilder1 == stringBuilder2);

        StringBuilder stringBuilder3 = new StringBuilder(stringBuilder1);
        System.out.println(stringBuilder1 == stringBuilder3);
        String s = new String("ok");

        stringBuilder1.append(true);
    }
}
