package bai_tap_them.staff_mvc.util;

import bai_tap_them.staff_mvc.model.Staff;

import java.util.Comparator;

public class SortNameDescending implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
