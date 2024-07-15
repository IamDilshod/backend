package Urok_29;

import java.time.*;

public class Test2 {
    public static void main(String[] args) {
        // LocalDate ni qiymati o'zgarmas(immutable) bo'ladi, xuddi String classi kabi.
        LocalDate localDate = LocalDate.of(2014, 5, 15);
        System.out.println(localDate); // 2014-05-15
        localDate.plusDays(5);
        System.out.println(localDate); // 2014-05-15. Hech qanday o'zgarish bo'lmayd, chunki
        // LocalDate classi immutabledir.

        System.out.println("------------------------------");

        LocalDate localDate1 = LocalDate.of(2020, 5, 30);
        System.out.println(localDate1); // 2020-05-30
        localDate1 = localDate1.plusDays(5); // Bu yerda esa biz localDate1 ni qiymatini yangilayapmiz
        System.out.println(localDate1); // 2020-06-04
    }
}
