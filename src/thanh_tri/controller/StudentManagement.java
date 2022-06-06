package thanh_tri.controller;

import thanh_tri.service.exception.CheckException;
import thanh_tri.service.impl.StudentServiceImpl;
import thanh_tri.service.impl.TeacherServiceImpl;

public class StudentManagement {
    public static void displayMenu() {
        StudentServiceImpl studentService = new StudentServiceImpl();
        while (true) {
            System.out.println("-------Chương trình quản lý sinh viên---------\n" +
                    "\t1. Thêm mới giảng viên hoặc sinh viên \n" +
                    "\t2. Xoá giảng viên hoặc học sinh \n" +
                    "\t3. Hiển thị danh sách giảng viên hoặc học sinh \n" +
                    "\t4. Tìm kiếm giảng viên hoặc học sinh \n" +
                    "\t5. Thoát chương trình \n" +
                    "\t Chọn chức năng: ");
            int choice = CheckException.checkparseInt();
            switch (choice){
                case 1:
                    displayAdd();
                    break;
                case 2:
                    displayDelete();
                    break;
                case 3:
                    studentService.display();
                    break;
                case 4:
                    studentService.search();
                    break;
                default:
                    System.out.println("nhập sai vui lòng nhập lại");
            }
        }
    }
    public static void displayAdd(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        while (true){
            System.out.println("1\tThêm mới học sinh\n" +
                    "2\tThêm mới giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice){
                case 1:
                    studentService.add();
                    break;
                case 2:
                    teacherService.add();;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhập sai vui lòng nhập lại");
            }
        }
    }public static void displayDelete(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        while (true){
            System.out.println("1\tXoá học sinh\n" +
                    "2\tXoá giảng viên\n" +
                    "3\tReturn main menu\n");
            int choice = CheckException.checkparseInt();
            switch (choice){
                case 1:
                    studentService.delete();
                    break;
                case 2:
                    teacherService.delete();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("nhập sai vui lòng nhập lại");
            }
        }
    }
}
