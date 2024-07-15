public class Test {
    public static void main(String[] args) {
        // null ni case ga berib bo'lmaydi, xatolik beradi ya'ni
        // case null: bu xato deganidir.
        String day = "sunday";
        switch (day){
            case "monday":
//                System.out.println("I work by 18:00");
//                break;
            case "tuesday":
//                System.out.println("I work by 18:00");
//                break;
            case "wensday":
//                System.out.println("I work by 18:00");
//                break;
            case "thursday":
//                System.out.println("I work by 18:00");
//                break;
            case "friday":
                System.out.println("I work by 18:00");
                break;
            case "saturday":
                System.out.println("I work by 15:00");
                break;
            case "sunday":
                System.out.println("I don't work");
                break;
            default:
                System.out.println("There is not such a day");
        }
    }
}
