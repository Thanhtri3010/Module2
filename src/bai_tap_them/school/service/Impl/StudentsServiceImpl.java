package bai_tap_them.school.service.Impl;

import bai_tap_them.school.models.Student;
import bai_tap_them.school.service.StudentsService;
import bai_tap_them.school.service.exception.CheckException;
import bai_tap_them.school.service.exception.Regex;
import bai_tap_them.school.utils.PersonDateComparator;
import bai_tap_them.school.utils.PersonNameComparator;
import bai_tap_them.school.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentsServiceImpl implements StudentsService {
    private static List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public static final String PATH_STUDENT = "src/bai_tap_them/school/data/student.csv";

    @Override
    public void display() {
        studentList.clear();
        studentList = ReadAndWriteFile.readStudent(PATH_STUDENT);
        for (Student item : studentList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        studentList.clear();
        studentList = ReadAndWriteFile.readStudent(PATH_STUDENT);

        int id = 1;
        if (!studentList.isEmpty()) {
            id = studentList.size() + 1;
        }

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập giới tính");
        String sex = menuSex();

        System.out.println("Nhập ngày sinh");
        String age = scanner.nextLine();
        Regex.regexAge(age);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập mã sinh viên");
        String studentCode = Regex.getRegexCodeStudent();

        System.out.println("Nhập điểm trung bình");
        Double point = Double.parseDouble(scanner.nextLine());

        Student student = new Student(id, name, sex, age, address, studentCode, point);
        studentList.add(student);

        ReadAndWriteFile.writeStudent(PATH_STUDENT, studentList);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void delete() {
        studentList.clear();
        studentList = ReadAndWriteFile.readStudent(PATH_STUDENT);
        System.out.println("Nhập id muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i) instanceof Student && id == studentList.get(i).getId()) {
                System.out.println("Bạn có chắc chắn muốn xóa hay không?");
                System.out.println("1. có");
                System.out.println("2. không");

                int inputChoose = Integer.parseInt(scanner.nextLine());

                switch (inputChoose) {
                    case 1:
                        studentList.remove(i);
                        System.out.println("đã xóa thành công");
                        count++;
                        break;
                    case 2:
                        count++;
                        break;
                }
            }
        }
        ReadAndWriteFile.writeStudent(PATH_STUDENT, studentList);

    }

    @Override
    public void sort() {
        studentList.clear();
        studentList = ReadAndWriteFile.readStudent(PATH_STUDENT);
        System.out.println("1\t Sắp xếp theo tên\n" +
                "2\t Sắp xếp theo ngày sinh\n" +
                "\t Enter your choice\n");
        int choice = CheckException.checkparseInt();
        if (choice == 1) {
            Collections.sort(studentList, new PersonNameComparator());
            for (Student item : studentList) {
                System.out.println(item);
            }
        } else if (choice == 2) {
            Collections.sort(studentList, new PersonDateComparator());
            for (Student item : studentList) {
                System.out.println(item);
            }
        } else {
            System.out.println("lựa chọn không đúng");
        }

    }

    @Override
    public void edit() {
        studentList.clear();
        studentList = ReadAndWriteFile.readStudent(PATH_STUDENT);
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == idEdit) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();

                System.out.println("Nhập giới tính");
                String sex = menuSex();

                System.out.println("Nhập ngày sinh");
                String age = scanner.nextLine();
                Regex.regexAge(age);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();

                System.out.println("Nhập mã sinh viên");
                String studentCode = Regex.getRegexCodeStudent();

                System.out.println("Nhập điểm trung bình");
                Double point = Double.parseDouble(scanner.nextLine());

                int id = idEdit;

                Student student = new Student(id, name, sex, age, address, studentCode, point);
                studentList.set(i, student);

                count++;
                ReadAndWriteFile.writeStudent(PATH_STUDENT, studentList);
                System.out.println("Sửa thành công");
                break;

            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy id");
        }
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
