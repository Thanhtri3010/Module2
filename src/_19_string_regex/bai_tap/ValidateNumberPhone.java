package _19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số điện thoại hợp lệ theo mẫu: (xx)-(0xxxxxxxxx)"+
                "\n số điện thoại hợp lệ: (84)-(0978489648)\n" +
                "\n" +
                " Không hợp lệ: (a8)-(22222222)");
        String phone;
        phone = scanner.nextLine();
        String regex = "^(09|08)+[0-9]{8}";
        String regex1 = "^\\([0-9]{2}\\)\\-\\((0)[0-9]{9}\\)$";
        while (!phone.matches(regex1) && !phone.matches(regex)) {
            System.out.println("Nhập không đúng định dạng vui lòng nhập lại");
            phone =scanner.nextLine();
        }
        System.out.println("Đã nhập thành công số điện thoại " + phone);
    }
}
