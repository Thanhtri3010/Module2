package product_management.service;

import product_management.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Ihpone X", 1000, 10, "Apple"));
        productList.add(new Product(2, "Ihpone 11", 222, 10, "Apple"));
        productList.add(new Product(3, "Ihpone 12", 333, 10, "Apple"));
        productList.add(new Product(4, "Ihpone 13", 444, 10, "Apple"));
    }

    @Override
    public void addNewProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập Số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();

        int id = productList.get( productList.size() - 1 ).getId() + 1;
        Product product = new Product(id, name, price, amount, production);
        productList.add(product);
        System.out.println("Đã thêm thành công");



    }

    @Override
    public void displayListProduct() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    @Override
    public void removeProductById() {

    }

    @Override
    public void findProductByName() {

    }
}
