package bai_tap_them.staff_mvc.service;

import bai_tap_them.staff_mvc.model.DailyWorker;
import bai_tap_them.staff_mvc.model.ManagementStaff;
import bai_tap_them.staff_mvc.model.ProductionStaff;
import bai_tap_them.staff_mvc.model.Staff;
import bai_tap_them.staff_mvc.util.SortBySalary;
import bai_tap_them.staff_mvc.util.SortNameAscending;
import bai_tap_them.staff_mvc.util.SortNameDescending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListStaff implements IStaffService {
    public static List<Staff> listStaff = new ArrayList<>();


    static {
        listStaff.add(new ManagementStaff("Thái", 30, "Đà Nẵng", 2000, 2));
        listStaff.add(new DailyWorker("Tân", 29, "Đà Nẵng", 26));
        listStaff.add(new ProductionStaff("Quốc", 24, "Hà Nội", 300));
        listStaff.add(new ManagementStaff("Mạnh", 29, "Hà Nội", 1000, 2));
        listStaff.add(new DailyWorker("Linh", 26, "HCM", 28));
        listStaff.add(new ProductionStaff("Tuyền", 22, "Hà Nội", 500));

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
        Collections.sort(listStaff, new SortBySalary());
        for (Staff item : listStaff) {
            System.out.println(item);
        }
    }

    @Override
    public void displaySortNameAscending() {
        Collections.sort(listStaff, new SortNameAscending());
        for (Staff item : listStaff) {
            System.out.println(item);
        }
    }

    @Override
    public void displaySortNameDescending() {
        Collections.sort(listStaff, new SortNameDescending());
        for (Staff item : listStaff) {
            System.out.println(item);
        }
    }
}
/**
 * Array list có thể thay đổi kích thuớc mảng sẽ tự tăng 50% so với mảng đầu nên không cần khai báo 1000 phần tử
 * nếu 1001 phần tử thì không có lỗi gì sảy ra vì mảng có thể tự thay đổi kích thuớc
 * Ưu điểm ArrayList:
 * kích thuớc có thể thay đổi, cung cấp nhiều method để thao tác
 * nhược điểm: chỉ lưu kiểu dữ liệu đối tượng. có cơ chế auto boxing để chuyển kiểu dữ liệu nguyên thuỷ sang đối tượng
 * tốc độ sử lý chậm
 */