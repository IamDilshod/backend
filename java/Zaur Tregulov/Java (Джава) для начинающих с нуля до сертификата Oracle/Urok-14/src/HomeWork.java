public class HomeWork {
    public static void main(String[] args) {
        time();
    }

    static void time(){
        OUTER: for(int hour=0; hour<=6; hour++){

        MIDDLE: for(int minut=0; minut<=59; minut++){

            INNER: for(int second=0; second<=59; second++){
                System.out.println(hour + ":" + minut + ":" + second);
                }
            }
        }
    }
}
