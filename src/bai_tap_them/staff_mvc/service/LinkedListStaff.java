package bai_tap_them.staff_mvc.service;

import bai_tap_them.staff_mvc.model.DailyWorker;
import bai_tap_them.staff_mvc.model.ManagementStaff;
import bai_tap_them.staff_mvc.model.ProductionStaff;
import bai_tap_them.staff_mvc.model.Staff;
import bai_tap_them.staff_mvc.util.SortBySalary;
import bai_tap_them.staff_mvc.util.SortNameAscending;
import bai_tap_them.staff_mvc.util.SortNameDescending;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListStaff implements IStaffService {
    public static List<Staff> listStaff = new LinkedList<>();

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
 * không nên dùng fori cho linkedlist vì nó truy xuất phần tử chậm hơn vì phải duyệt mảng lại từ đầu
 * nên sử dùng LinkedList vì khi thêm hoặc xóa chỉ cần cắt và gắn các nối liên kết ko cần sắp xếp lại mảng như arrayList nên sẽ nhanh hơn
 * nên sử dụng LinkedList thay vì arraylist vào việc thêm xoá vì LinkedList có tốc độ sử lý nhanh hơn
 */
