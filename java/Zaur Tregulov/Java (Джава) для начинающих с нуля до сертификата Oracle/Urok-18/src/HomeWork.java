public class HomeWork {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = new StringBuilder("12345");
        System.out.println(equal(sb1, sb2));
        System.out.println(equal(sb1, sb3));
        System.out.println(equal(new StringBuilder(""), new StringBuilder("")));
        System.out.println(equal(new StringBuilder(), new StringBuilder()));
    }

    public static boolean equal(StringBuilder sb1, StringBuilder sb2){
        // Agar ular bitta object bo'lsa, ular tengdir
        if(sb1 == sb2){
            return true;
        }

        // Agar atigi bittasi null ga teng bo'lsa, ular teng emas
        if(sb1 == null || sb2 == null){
            return false;
        }

        // return sb1.toString().equals(sb2.toString());

        boolean isEqual = true;
        if(sb1.length() == sb2.length()){
            for(int i=0; i<sb1.length(); i++){
                if(sb1.charAt(i) != sb2.charAt(i)){
                    isEqual = false;
                }
            }
        } else{
            isEqual = false;
        }

        return isEqual;
    }
}
