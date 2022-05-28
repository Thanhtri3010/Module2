package _17_binaryfile_serializtion.bai_tap.product_management.service;

import _17_binaryfile_serializtion.bai_tap.product_management.WriteAndRead;
import _17_binaryfile_serializtion.bai_tap.product_management.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IProduct {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "IphoneX", "Apple", 1500));
        productList.add(new Product(2, "Iphone8", "Apple", 1200));
        productList.add(new Product(3, "Iphone7", "Apple", 1000));
        WriteAndRead.writeFile(productList);

    }

    @Override
    public void display() {
        productList = WriteAndRead.readFile();
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập Tên Sản Phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập Hãng Sản Xuất");
        String production = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        int id = productList.get(productList.size() - 1).getId() + 1;
        Product product = new Product(id, name, production, price);
        productList.add(product);
        WriteAndRead.writeFile(productList);

    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩn bạn muốn tìm");
        String inputName = scanner.nextLine();
        for (Product item : productList) {
            if (item.getName().contains(inputName)) {
                System.out.println(item);
            }
        }
        System.out.println("Không tìm thấy sản phẩm");
    }
}
