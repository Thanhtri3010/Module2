package bai_tap_them.staff_mvc.service;

import bai_tap_them.staff_mvc.model.DailyWorker;
import bai_tap_them.staff_mvc.model.ManagementStaff;
import bai_tap_them.staff_mvc.model.ProductionStaff;
import bai_tap_them.staff_mvc.model.Staff;

import java.util.Scanner;

public class ArrayStaff implements IStaffService {
    public static Scanner scanner = new Scanner(System.in);
    public static Staff[] listStaff = new Staff[1000];

    static {
        listStaff[0] = new ManagementStaff("Thái", 30, "Đà Nẵng", 2000, 2);
        listStaff[1] = new DailyWorker("Tân", 29, "Đà Nẵng", 26);
        listStaff[2] = new ProductionStaff("Quốc", 24, "Hà Nội", 300);
        listStaff[3] = new ManagementStaff("Mạnh", 29, "Hà Nội", 1000, 2);
        listStaff[4] = new DailyWorker("Linh", 26, "HCM", 28);
        listStaff[5] = new ProductionStaff("Tuyền", 22, "Hà Nội", 500);

    }

    @Override
    public void displayListStaff() {
        for (Staff item : listStaff) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListManagement() {
        for (Staff item : listStaff) {
            if (item instanceof ManagementStaff) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListDailyWorker() {
        for (Staff item : listStaff) {
            if (item instanceof DailyWorker) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayListProduction() {
        for (Staff item : listStaff) {
            if (item instanceof ProductionStaff) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displaySortBySalary() {

    }

    @Override
    public void displaySortNameAscending() {

    }

    @Override
    public void displaySortNameDescending() {

    }

}
/**
 * phải check null vì mảng cho sẳn có đền 1000 phần tử nếu sẽ hiện ra số phần tử còn lại là null
 * instanceof được sử dụng để kiểm tra một đối tượng có cùng kiểu dữ liệu đối tượng hay ko
 * 1001 nhân viên sẽ lỗi vì array là mảng có kích thuớc cố định không thay đổi
 */
