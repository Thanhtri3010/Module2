package bai_tap_them.cong_ty_abc.controller;

import bai_tap_them.cong_ty_abc.service.impl.ManagementServiceImpl;
import bai_tap_them.cong_ty_abc.service.impl.ProductionServiceImpl;
import thanh_tri.service.exception.CheckException;


public class StaffController {
    static ManagementServiceImpl managementService = new ManagementServiceImpl();
    static ProductionServiceImpl productionService = new ProductionServiceImpl();

    public static void displayMenu() {
        while (true) {
            System.out.println("1. Hiển thị danh sách nhân viên\n" +
                    "2. Thêm mới nhân viên\n" +
                    "3. Xóa theo mã nhân viên\n" +
                    "4. Tìm kiếm nhân viên\n" +
                    "5. Thoát");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");

            }
        }
    }

    public static void display() {
        while (true) {
            System.out.println("1. Hiển thị nhân quản lý\n" +
                    "2. Hiểm thị nhân viên sản xuất\n" +
                    "3.Quay trở lại menu chính");

            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    managementService.display();
                    break;
                case 2:
                    productionService.display();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("nhập không đúng vui lòng nhập lại");
            }
        }
    }

    public static void add() {
        while (true) {
            System.out.println("1. Thêm mới nhân quản lý\n" +
                    "2. Thêm mới nhân viên sản xuất\n" +
                    "3.Quay trở lại menu chính");

            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    managementService.add();
                    break;
                case 2:
                    productionService.add();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("nhập không đúng vui lòng nhập lại");
            }
        }
    }

    public static void search() {
        while (true) {
            System.out.println("1. Tìm kiếm nhân quản lý\n" +
                    "2. Tìm kiếm nhân viên sản xuất\n"+
                    "3.Quay trở lại menu chính");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    managementService.search();
                    break;
                case 2:
                    productionService.search();
                    break;
                case 3:
                    displayMenu();
                    break;
                default:
                    System.out.println("nhập không đúng vui lòng nhập lại");
            }
        }
    }

    public static void delete() {
        while (true) {
            System.out.println("1. Xoá nhân quản lý\n" +
                    "2. Xoá nhân viên sản xuất\n"+
                    "3.Quay trở lại menu chính");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    managementService.delete();
                    break;
                case 2:
                    productionService.delete();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhập không đúng vui lòng nhập lại");
            }
        }
    }
}
