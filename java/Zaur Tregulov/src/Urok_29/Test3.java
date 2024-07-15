package Urok_29;

import java.time.LocalTime;

public class Test3 {
    public static void main(String[] args) {
        // LocalTime ni qiymati o'zgarmas(immutable) bo'ladi, xuddi String classi kabi.
        LocalTime localTime = LocalTime.of(3, 16, 5);
        System.out.println(localTime);
        localTime = localTime.plusHours(4);
        System.out.println(localTime);
    }
}
