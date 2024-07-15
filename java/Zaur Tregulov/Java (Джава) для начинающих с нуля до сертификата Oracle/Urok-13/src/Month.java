public class Month {
    public static void dayQuantity(int monthNumber){
        switch (monthNumber){
            case 2:
                System.out.println("28 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            default:
                System.out.println("No such month");
//                break;
//                Ehtiyot bo'lish kerak default dan keyin break yo'q. Defaultga tushadigan shart
//                bo'lganda, defaultdan keyingi case ishlab ketadi. Buning oldini olish uchun
//                default da ham break ishlatish kerak.
            case 14:
                System.out.println("SASASAD");
        }
    }

    public static void main(String[] args) {
        Month.dayQuantity(4);
        dayQuantity(2);
        dayQuantity(13);
    }

    public static void ffoo(){
        final int a;
        a=9;

        if(a > 8){
            System.out.println("ddd");
        }
    }
}
