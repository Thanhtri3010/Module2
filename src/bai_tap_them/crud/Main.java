package bai_tap_them.crud;

import java.util.Scanner;

public class Main {
    public static Product[] productsList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Block static");
        productsList[0] = new Product(1, "Iphone", 1000, 10, "Apple");
        productsList[1] = new Product(2, "S22 Ultra", 1000, 10, "SamSung");
        productsList[2] = new Product(3, "Xiaomi", 1000, 10, "China");
        productsList[3] = new Product(4, "Macbook", 1000, 10, "Apple");
        productsList[4] = new Product(5, "Dell", 1000, 10, "Intel");
    }

    public static void addNewProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất ");
        String production = scanner.nextLine();

        Product product = new Product(count + 1, name, price, amount, production);
        productsList[count] = product;
        count++;
    }

    public static void displayList() {
        for (Product item : productsList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void searchProduct() {
        System.out.println("Nhập tên hãng cần kìm kiếm ");
        String name = scanner.nextLine();
        int count = 0;
        for (Product item : productsList) {
            if (item != null) {
                if (item.getName().contains(name) || item.getProduction().contains(name)) {
                    System.out.println(item);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy ");
        }

    }

    public static void deleteProduct() {
        int count = 0;
        System.out.println("Nhập id muốn xoá");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.length; i++) {
            if (productsList[i] != null) {
                if (productsList[i].getId() == idDelete) {
                    productsList[i] = productsList[i + 1];
                    for (int j = i + 1; j < productsList.length && productsList[j + 1] != null; j++) {
                        productsList[j]= productsList[j+1];
                    }
                    System.out.println("Đã xoá");
                    count++;
                }
            }
        }if (count ==0){
            System.out.println("Không tìm thấy");
        }

    }
    public static void updateProduct(){
        int count = 0;
        System.out.println("Nhập id muốn sửa");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <productsList.length ; i++) {
            if (productsList[i]!=null){
                if (productsList[i].getId()==idUpdate){
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập số lượng ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập nhà sản xuất ");
                    String production = scanner.nextLine();
                    productsList[i]=new Product(i+i,name,price,amount,production);
                    System.out.println("Đã sửa");
                    count++;
                }
            }
        }if (count==0){
            System.out.println("Không tìm thấy");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("------------------Product Management----------------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Exit");
            System.out.println("Choose options");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display List");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add New");
                    addNewProduct();
                    break;
                case 3:
                    System.out.println("Searching");
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Delete");
                    deleteProduct();
                case 5:
                    System.out.println("Update");
                    updateProduct();
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
