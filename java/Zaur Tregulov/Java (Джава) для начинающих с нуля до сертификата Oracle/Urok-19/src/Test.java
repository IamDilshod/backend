import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        arr[1] = 90;
        System.out.println(arr[1]);
        int scores[] = new int[10];
        System.out.println(scores[1]);

        char ch[] = new char[5];
        System.out.println(ch[0]);

        System.out.println(ch.length);

//        String str[] = new String[3];
//        System.out.println(str[0].charAt(0));

        System.out.println("-----------------------");
        int [] b; // agar array yaratilsa, lekin unga hech qanday boshlang'ich qiymat berilmasa,
        // u holda bu arrayni reference null ga pointer qilayotgan bo'ladi.
//        System.out.println(b);

        System.out.println("///////");

        ArrayList<String> al = new ArrayList<>(10);
        al.add(0, "one");
        al.add(1, "two");
        al.add(2, "three");

        for(String s : al){
            System.out.println(s);
        }

    }


}
