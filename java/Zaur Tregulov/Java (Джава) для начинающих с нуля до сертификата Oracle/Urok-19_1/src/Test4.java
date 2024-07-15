public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7,8};
        arr1[5-3] = 90;
        System.out.println(arr1[2]);

        arr1[arr1.length] = 35; // Error: ArrayIndexOutOfBoundsException
        System.out.println(arr1);

        String[] strings = new String[2];
        strings[0] = "salom";
        strings[1] = "hayot";
        strings[2] = "java";
    }
}
