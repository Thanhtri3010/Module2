package bai_tap_them.school.service.exception;

import java.util.Scanner;

public class CheckException {
    static Scanner scanner = new Scanner(System.in);

    public static int checkparseInt() {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Nhập lại: ");
            }
        }
        return value;
    }

    public static Double checkparseDouble() {
        double value;
        while (true) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Nhập lại: ");
            }
        }
        return value;
    }

    public static String checkString() {
        String value;
        while (true) {
            try {
                value = scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Nhập lại: ");
            }
        }
        return value;
    }
}
