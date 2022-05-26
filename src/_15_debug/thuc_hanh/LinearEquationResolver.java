package _15_debug.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = 0', vui lòng nhập các hằng số:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Giải pháp là: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("Giải pháp là tất cả x!");
            } else {
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
