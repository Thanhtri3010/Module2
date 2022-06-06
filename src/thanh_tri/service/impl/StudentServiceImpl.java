package thanh_tri.service.impl;


import thanh_tri.models.Students;
import thanh_tri.service.StudentsService;
import thanh_tri.service.exception.Regex;
import thanh_tri.utils.ReadAndWirte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentsService {
    private static List<Students> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public static final String PATH_STUDENT = "src/thanh_tri/data/students.csv";

    @Override
    public void display() {
        studentList.clear();
        studentList = ReadAndWirte.readStudent(PATH_STUDENT);
        for (Students item : studentList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        studentList.clear();
        studentList = ReadAndWirte.readStudent(PATH_STUDENT);
        System.out.println("Nhập Id học sinh");
        String id = Regex.getRegexCodeStudent();

        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh học sinh");
        String age = Regex.getRegexDateOfBirth();

        System.out.println("Nhập giới tính học sinh");
        String sex = menuSex();

        System.out.println("Nhập tên lớp");
        String nameClass = scanner.nextLine();

        System.out.println("Nhập điểm môn học");
        float point = Float.parseFloat(scanner.nextLine());

        Students students = new Students(id, name, age, sex, nameClass, point);
        studentList.add(students);

        ReadAndWirte.writeStuden(PATH_STUDENT, studentList);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã học sinh muốn xoá");
    }

    @Override
    public void search() {
        System.out.println("Nhập tên học sinh muốn tìm kiếm");
        String name = scanner.nextLine();

        boolean check = false;
        for (Students item : studentList) {
            if (name.contains(item.getName())) {
                System.out.println(item);
            } else {
                check = true;
            }
        }
        if (check)
            System.out.println("Không tìm thấy tên học sinh");
    }

    public String menuSex() {
        while (true) {
            System.out.println("--------Nhập giới tính---------\n" +
                    "\t1. Nam \n" +
                    "\t2. Nữ \n" +
                    "\t3. Giới tính thứ 3 \n" +
                    "\tEnter: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                case 3:
                    return "Giới tính thứ 3";
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }
    }
}
