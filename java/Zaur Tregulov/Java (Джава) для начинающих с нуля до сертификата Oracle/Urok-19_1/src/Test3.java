import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,4,-8};
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("----------------");
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
