package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = {"a", "b", "c", "d", "a", "a", "a", "b"};
        System.out.print("Nhập kí tự muốn tìm kiếm trong chuỗi: ");
        String inputStr = input.nextLine();
        int count = 0;for (int i = 0; i < str.length; i++) {
            if (str[i].equals(inputStr)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + inputStr + " trong chuỗi là: " + count);
    }
}
