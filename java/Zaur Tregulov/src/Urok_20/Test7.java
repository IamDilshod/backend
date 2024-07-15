package Urok_20;

public class Test7 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException ex){
            String str = null;
            str.length();
            System.out.println(arr[7]);
            System.out.println("Catch 1");
        } catch (NullPointerException ex){
            System.out.println("Catch 2");
        }
    }
}
