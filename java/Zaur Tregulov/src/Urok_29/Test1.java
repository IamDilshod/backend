package Urok_29;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014, 3, 7);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2014, Month.NOVEMBER, 8);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.of(4, 43, 3, 45553);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2014, 4, 24, 5, 6);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);
    }
}
