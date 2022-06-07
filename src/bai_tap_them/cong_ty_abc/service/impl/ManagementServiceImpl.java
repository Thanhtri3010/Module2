package bai_tap_them.cong_ty_abc.service.impl;

import bai_tap_them.cong_ty_abc.models.ManagementStaff;
import bai_tap_them.cong_ty_abc.service.ManagementService;
import bai_tap_them.cong_ty_abc.service.exception.Regex;
import bai_tap_them.cong_ty_abc.utils.ReadAndWirte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementServiceImpl implements ManagementService {
    private static List<ManagementStaff> managementStaffList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    public static final String PATH_MANAGEMENT = "src/bai_tap_them/cong_ty_abc/data/employee.csv";

    @Override
    public void display() {
        managementStaffList.clear();
        managementStaffList = ReadAndWirte.readManagementStaff(PATH_MANAGEMENT);
        for (ManagementStaff item : managementStaffList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        managementStaffList.clear();
        managementStaffList = ReadAndWirte.readManagementStaff(PATH_MANAGEMENT);

        int id = 1;
        if (!managementStaffList.isEmpty()) {
            id = managementStaffList.size() + 1;
        }

        System.out.println("Nhập mã nhân viên");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập họ và tên");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String age = scanner.nextLine();
        Regex.regexAge(age);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("nhập lương cơ bản");
        double basicSalary = Regex.regexpositiveNumber();

        System.out.println("Nhập hệ số lương");
        double coefficientsSalary = Regex.regexpositiveNumber();

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, age, address, basicSalary, coefficientsSalary);
        managementStaffList.add(managementStaff);
        ReadAndWirte.writeManagementStaff(PATH_MANAGEMENT, managementStaffList);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void delete() {
        managementStaffList.clear();
        managementStaffList = ReadAndWirte.readManagementStaff(PATH_MANAGEMENT);
        System.out.print("Nhập id bạn muốn xoá: ");
        String delete = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < managementStaffList.size(); i++) {
            if (delete.equals(managementStaffList.get(i).getEmployeeCode())) {
                managementStaffList.remove(i);
                System.out.println("Đã xoá thành công!!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("mã không tồn tại !!");
        }
        ReadAndWirte.writeManagementStaff(PATH_MANAGEMENT, managementStaffList);

    }

    @Override
    public void search() {
        System.out.println("Nhập nhân viên muốn tìm kiếm");
        String inputSearch = scanner.nextLine();
        boolean check = false;
        for (ManagementStaff item : managementStaffList) {
            if (inputSearch.contains(item.getName()) ||
                    inputSearch.contains(item.getEmployeeCode()) ||
                    inputSearch.contains(item.getAge()) ||
                    inputSearch.contains(item.getAddress())) {
                System.out.println(item);
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }
}
