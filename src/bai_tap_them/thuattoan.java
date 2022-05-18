package bai_tap_them;

import java.util.Scanner;

public class thuattoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số");
        int number;
        int count = 0;
        number = Integer.parseInt(input.nextLine());
        for (int i = 26; i < number; i++) {
            if (i % 2 == 0) {
                count++;
                if (count == 3) {
                    System.out.println("-" + i);
                    count = 0;
                } else {
                    System.out.println(i);
                }
            }

        }
    }
}
