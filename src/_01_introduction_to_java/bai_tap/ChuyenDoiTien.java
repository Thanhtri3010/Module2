package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền chuyển đổi USD:");
        double vnd = 23000;
        double usd;
        usd = scanner.nextDouble();
        double exchange = usd*vnd;
        System.out.println("Số tiền là: "+ exchange+ "2VND");

    }
}
