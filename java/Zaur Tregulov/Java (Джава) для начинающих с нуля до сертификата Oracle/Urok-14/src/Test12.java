public class Test12 {
    public static void main(String[] args) {
        OUTER:for (int i=0; i<10; i++){
            INNER:for(int j=0; j<10; j++){
                System.out.println("i => " + i + " j => " + j);
                if(j==5){
                    break OUTER;
                }
            }
        }
    }
}
