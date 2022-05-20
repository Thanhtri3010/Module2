package _12_map.bai_tap.linked_list.serice;

import _12_map.bai_tap.linked_list.model.Product;
import _12_map.bai_tap.linked_list.utils.SortProductsDescending;
import _12_map.bai_tap.linked_list.utils.SortProductsInAscending;

import java.util.*;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new LinkedList<>();

    static {
        productList.add(new Product(1, "Iphone 7", 1000, 10, "Apple"));
        productList.add(new Product(2, "Iphone 8", 1100, 10, "Apple"));
        productList.add(new Product(3, "Iphone X", 1400, 10, "Apple"));
        productList.add(new Product(4, "Iphone XS", 1500, 10, "Apple"));
        productList.add(new Product(5, "S22 Ultra", 999, 10, "SamSung"));
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

        int id = productList.get(productList.size() - 1).getId() + 1;
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
        System.out.println("Nhập id muốn xoá");
        int idRemove = Integer.parseInt(scanner.nextLine());
        if ((idRemove - 1) >= productList.size()) {
            System.out.println("Không tìm thấy id");
        } else {
            productList.remove(idRemove - 1);
        }
        System.out.println("Xoá thành công");
    }

    @Override
    public void findProductByName() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
        String name = scanner.nextLine();
        int count = 0;
        for (Product item : productList) {
            if (item.getNameProduct().contains(name) || item.getProduction().contains(name)) {
                System.out.println(item);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void updateProduct() {
        System.out.println("Nhập id bạn muốn sửa: ");
        int inputUpdateId = Integer.parseInt(scanner.nextLine());
        int temp = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == inputUpdateId) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập Giá");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập Số lượng");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất");
                String production = scanner.nextLine();

                productList.get(i).setNameProduct(name);
                productList.get(i).setPrice(price);
                productList.get(i).setAmount(amount);
                productList.get(i).setProduction(production);
                temp++;
                System.out.println("successful update");
            }
        }
        if (temp == 0) {
            System.out.println("không tìm thấy id");
        }
    }

    @Override
    public void sortByPrice() {
        System.out.println("Danh Sách Sản Phẩm Giảm Theo Giá");
        Collections.sort(productList, new SortProductsDescending());
        for (Product item : productList) {
            System.out.println(item);

        }
    }

    @Override
    public void sortAscendingByPrice() {
        System.out.println("Danh Sách Sản Phẩm Tăng Theo Giá");
        Collections.sort(productList, new SortProductsInAscending());
        for (Product item : productList) {
            System.out.println(item);
        }
    }
}
