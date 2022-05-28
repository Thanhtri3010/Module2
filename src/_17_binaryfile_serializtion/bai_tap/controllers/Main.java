package _17_binaryfile_serializtion.bai_tap.controllers;

import _17_binaryfile_serializtion.bai_tap.service.IProduct;
import _17_binaryfile_serializtion.bai_tap.service.ProductImpl;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static IProduct product = new ProductImpl();

    public static void main(String[] args) {
        do {
            System.out.println("1. Thêm mới sản phẩm\n" +
                    "2. Hiển thị sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "4. Thoát khỏi chương trình\n");
            switch (scanner.nextInt()) {
                case 1:
                    product.add();
                    break;
                case 2:
                    product.display();
                    break;
                case 3:
                    product.search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        } while (true);
    }
}
