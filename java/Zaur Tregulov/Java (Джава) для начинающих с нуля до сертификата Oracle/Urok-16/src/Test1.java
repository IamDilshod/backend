public class Test1 {
    public static void main(String[] args) {
        String s1 = "As sly as a fox, as strong as an ox";
        int pos = 0;
        String target = "as";

        while (true){
            int foundPos = s1.indexOf(target, pos);

            if(foundPos==-1){
                break;
            }

            System.out.println(foundPos);
            pos = foundPos + 1;
        }
    }
}
