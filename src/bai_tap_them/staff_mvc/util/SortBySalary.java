package bai_tap_them.staff_mvc.util;

import bai_tap_them.staff_mvc.model.Staff;

import java.util.Comparator;

public class SortBySalary implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        if (o1.salaryStaff() - o2.salaryStaff() > 0) {
            return 1;
        } else if (o1.salaryStaff() - o2.salaryStaff() < 0) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
/**
 * Nên sử dụng Comparator vì sắp xếp theo 2 tiêu chí lương và tên
 * Bắt buộc sử dụng Comparator khi sắp xếp theo nhiều tiêu chí
 * còn Comparable khi sắp xếp 1 tiêu chí
 */