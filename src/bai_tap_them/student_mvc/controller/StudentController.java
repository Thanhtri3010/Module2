package bai_tap_them.student_mvc.controller;


import bai_tap_them.student_mvc.service.StudentService;
import bai_tap_them.student_mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {

    public static Scanner scanner = new Scanner(System.in);
    //      Dependency Injection
    static StudentService studentService = new StudentServiceImpl();

    public static void menu() {


        int choose = -1;
        while (choose != 5) {
            System.out.println(" Quản lý học sinh");
            System.out.println(" 1.Danh sách học sinh");
            System.out.println(" 2.Thêm học sinh");
            System.out.println(" 3.Xóa học sinh");
            System.out.println(" 4.Tìm kiếm học sinh");
            System.out.println(" 5.Thoát chương trình");
            System.out.println("Chọn option: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    studentService.displayListStudent();
                    break;
                case 2:
                    studentService.addNewStudent();
                    break;
                case 3:
                    studentService.removeStudent();
                    menu();
                    break;
            }
        }

    }


}
