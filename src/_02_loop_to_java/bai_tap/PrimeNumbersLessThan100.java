package _02_loop_to_java.bai_tap;

import java.util.Scanner;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            boolean check = true;
            if (i < 2) {
                check = false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
