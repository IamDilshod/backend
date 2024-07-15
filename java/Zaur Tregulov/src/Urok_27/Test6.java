package Urok_27;

public class Test6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException ex){
            String str = null;
            try{
                str.length();
            } catch (NullPointerException  exp){
                System.out.println("Catch 1");
            }
        } catch (NullPointerException ex){
            System.out.println("Catch 2");
        }
    }
}
