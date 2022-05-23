package bai_tap_them.staff_mvc.service;

import bai_tap_them.staff_mvc.model.DailyWorker;
import bai_tap_them.staff_mvc.model.ManagementStaff;
import bai_tap_them.staff_mvc.model.ProductionStaff;
import bai_tap_them.staff_mvc.model.Staff;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapStaff implements IStaffService {
    public static Map<Integer, Staff> staffMap = new LinkedHashMap<>();

    static {
        staffMap.put(1, new ManagementStaff("Tùng", 1997, "Đà nãng", 2000, 1.5));
        staffMap.put(2, new ProductionStaff("Nhung", 1998, "Pleiku", 20));
        staffMap.put(3, new DailyWorker("Tâm", 2001, "Daklak", 27));
    }

    @Override
    public void displayListStaff() {
        for (Map.Entry<Integer, Staff> item : staffMap.entrySet()) {
            System.out.println("Nv: " + item + "," + staffMap.get(item));
        }
    }

    @Override
    public void displayListManagement() {

    }

    @Override
    public void displayListDailyWorker() {

    }

    @Override
    public void displayListProduction() {

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
