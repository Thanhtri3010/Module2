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
    private Scanner scanner = new Scanner(System.in);
    public static final String PATH_MANAGEMENT = "src/bai_tap_them/cong_ty_abc/data/management.csv";

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

        System.out.println("nhập lương cơ bản");
        int basicSalary = Regex.regexpositiveNumber();

        System.out.println("Nhập hệ số lương");
        int coefficientsSalary = Regex.regexpositiveNumber();

        ManagementStaff managementStaff = new ManagementStaff(id, employeeCode, name, age, address, basicSalary, coefficientsSalary);
        managementStaffList.add(managementStaff);
        ReadAndWirte.writeManagementStaff(PATH_MANAGEMENT, managementStaffList);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void delete() {
        managementStaffList.clear();
        managementStaffList = ReadAndWirte.readManagementStaff(PATH_MANAGEMENT);
        System.out.println("nhập mã nhân viên muốn xoá");
        String delete = scanner.nextLine();
        boolean check = false;


    }

    @Override
    public void search() {
        System.out.println("Nhập tên nhân viên muốn tìm kiếm");
        String name = scanner.nextLine();
        boolean check = false;
        for (ManagementStaff item : managementStaffList) {
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
