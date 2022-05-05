package _02_loop_to_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in");
        int number;
        number = Integer.parseInt(input.nextLine());
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
