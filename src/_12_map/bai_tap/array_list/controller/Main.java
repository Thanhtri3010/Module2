package _12_map.bai_tap.array_list.controller;

import _12_map.bai_tap.array_list.serice.IProductService;
import _12_map.bai_tap.array_list.serice.ProductService;

import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMain() {
        IProductService productService = new ProductService();
        do {
            System.out.println("-------------Product Management------------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product");
            System.out.println("5. Update Product");
            System.out.println("6. Exit");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
                    productService.displayListProduct();
                    System.out.println("1. Hiển thị danh sản phẩm tăng theo giá ");
                    System.out.println("2. Hiển thị danh sản phẩm giảm theo giá ");
                    int input = Integer.parseInt(scanner.nextLine());
                    if (input==1){
                        productService.sortAscendingByPrice();
                    }else if (input==2){
                        productService.sortByPrice();
                    }else {
                        System.out.println("Nhập sai");
                    }
                    break;
                case 2:
                    productService.addNewProduct();
                    break;
                case 3:
                    productService.removeProductById();
                    break;
                case 4:
                    productService.findProductByName();
                    break;
                case 5:
                    productService.updateProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
