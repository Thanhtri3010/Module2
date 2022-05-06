package _02_loop_to_java.bai_tap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số n");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("số nguyên tố nhỏ hơn n là: ");
        if (n >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
