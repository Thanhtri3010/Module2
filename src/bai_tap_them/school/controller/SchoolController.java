package bai_tap_them.school.controller;

import bai_tap_them.school.service.Impl.StudentsServiceImpl;
import bai_tap_them.school.service.Impl.TeacherServiceImpl;
import bai_tap_them.school.service.exception.CheckException;

public class SchoolController {
    static StudentsServiceImpl studentsService = new StudentsServiceImpl();
    static TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public static void displayMenu() {
        while (true) {
            System.out.println("1. Hiển thị danh sách giảng viên hoặc học sinh\n" +
                    "2. Thêm mới giảng viên hoặc sinh viên\n" +
                    "3.Xoá giảng viên hoặc học sinh\n" +
                    "4. Sắp xếp giảng viên hoặc học sinh\n" +
                    "5. Chỉnh sửa giảng viên hoặc học sinh\n" +
                    "6. Thoát");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    displayAdd();
                    break;
                case 3:
                    displayDelete();
                    break;
                case 4:
                    displaySort();
                    break;
                case 5:
                    displayEdit();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");
            }
        }
    }

    public static void display() {
        while (true) {
            System.out.println("1\t hiển thị học sinh\n" +
                    "2\thiển thị giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    studentsService.display();
                    break;
                case 2:
                    teacherService.display();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");

            }
        }
    }

    public static void displayAdd() {
        while (true) {
            System.out.println("1\t Thêm mới học sinh\n" +
                    "2\t Thêm mới giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    studentsService.add();
                    break;
                case 2:
                    teacherService.add();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");
            }
        }
    }


    public static void displayDelete() {
        while (true) {
            System.out.println("1\t Xoá học sinh\n" +
                    "2\t Xoá giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    studentsService.delete();
                    break;
                case 2:
                    teacherService.delete();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");

            }
        }
    }

    public static void displaySort() {
        while (true) {
            System.out.println("1\t Sắp xếp học sinh\n" +
                    "2\tSắp xếpgiảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    studentsService.sort();
                    break;
                case 2:
                    teacherService.sort();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");
            }
        }
    }

    public static void displayEdit() {
        while (true) {
            System.out.println("1\t Chỉnh sửa học sinh\n" +
                    "2\t Chỉnh sửa giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice) {
                case 1:
                    studentsService.edit();
                    break;
                case 2:
                    teacherService.edit();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");

            }
        }
    }
}
