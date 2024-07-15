package Urok_29;

import java.time.*;

public class Test4 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(2, 4, 8);
        LocalTime localTime2 = LocalTime.of(2, 9, 8);
        System.out.println(localTime1.isBefore(localTime2));
        System.out.println(localTime1.isAfter(localTime2));
    }
}
