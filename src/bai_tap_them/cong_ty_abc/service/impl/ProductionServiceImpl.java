package bai_tap_them.cong_ty_abc.service.impl;

import bai_tap_them.cong_ty_abc.models.ProductionStaff;
import bai_tap_them.cong_ty_abc.service.ProductionService;
import bai_tap_them.cong_ty_abc.service.exception.Regex;
import bai_tap_them.cong_ty_abc.utils.ReadAndWirte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductionServiceImpl implements ProductionService {
    private static List<ProductionStaff> productionStaffList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String PATH_PRODUCTION = "src/bai_tap_them/cong_ty_abc/data/production.csv";

    @Override
    public void display() {
        productionStaffList.clear();
        productionStaffList = ReadAndWirte.readProduction(PATH_PRODUCTION);
        for (ProductionStaff item : productionStaffList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        productionStaffList.clear();
        productionStaffList = ReadAndWirte.readProduction(PATH_PRODUCTION);

        System.out.println("Nhập id");
        String id = scanner.nextLine();

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String age = scanner.nextLine();
        Regex.regexAge(age);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập số sản phẩm");
        int productNumber = Regex.regexpositiveNumber();

        System.out.println("Nhập giá sản phẩm");
        int productPrice = Regex.regexpositiveNumber();

        ProductionStaff productionStaff = new ProductionStaff(id, employeeCode, name, age, address, productNumber, productPrice);
        productionStaffList.add(productionStaff);
        ReadAndWirte.writeProduction(PATH_PRODUCTION, productionStaffList);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {
        System.out.println("Nhập tên nhân viên muốn tìm kiếm");
        String name = scanner.nextLine();
        boolean check = false;
        for (ProductionStaff item : productionStaffList) {
            if (name.contains(item.getName())) {
                System.out.println(item);
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên nhân viên");
        }
    }
}
