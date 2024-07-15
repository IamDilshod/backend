package Urok_27;

public class Test1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        try {
            System.out.println("All right");
            System.out.println(arr[5]);
            System.out.println("Good");
        }
        catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Error occur " + err);
        }
    }
}
