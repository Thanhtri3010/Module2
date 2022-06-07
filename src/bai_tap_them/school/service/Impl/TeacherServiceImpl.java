package bai_tap_them.school.service.Impl;

import bai_tap_them.school.models.Teacher;
import bai_tap_them.school.service.TeacherService;
import bai_tap_them.school.service.exception.CheckException;
import bai_tap_them.school.service.exception.Regex;
import bai_tap_them.school.utils.PersonDateComparator;
import bai_tap_them.school.utils.PersonNameComparator;
import bai_tap_them.school.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    private static List<Teacher> teachersList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public static final String PATH_TEACHER = "src/bai_tap_them/school/data/teacher.csv";

    @Override
    public void display() {
        teachersList.clear();
        teachersList = ReadAndWriteFile.readTeacher(PATH_TEACHER);
        for (Teacher item : teachersList) {
            System.out.println(item);
        }

    }

    @Override
    public void add() {
        teachersList.clear();
        teachersList = ReadAndWriteFile.readTeacher(PATH_TEACHER);

        int id = 1;
        if (!teachersList.isEmpty()) {
            id = teachersList.size() + 1;
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

        System.out.println("Nhập lương một giờ dạy");
        Double salary = Regex.regexPositiveNumber();

        System.out.println("Nhập số giờ dạy");
        Double teachingHours = Regex.regexPositiveNumber();

        ReadAndWriteFile.writeTeacher(PATH_TEACHER, teachersList);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void delete() {
        teachersList.clear();
        teachersList = ReadAndWriteFile.readTeacher(PATH_TEACHER);
        System.out.println("Nhập id muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 0; i < teachersList.size(); i++) {
            if (teachersList.get(i) instanceof Teacher && id == teachersList.get(i).getId()) {
                System.out.println("Bạn có chắc chắn muốn xóa hay không?");
                System.out.println("1. có");
                System.out.println("2. không");

                int inputChoose = Integer.parseInt(scanner.nextLine());

                switch (inputChoose) {
                    case 1:
                        teachersList.remove(i);
                        System.out.println("đã xóa thành công");
                        count++;
                        break;
                    case 2:
                        count++;
                        break;
                }
            }
        }
        ReadAndWriteFile.writeTeacher(PATH_TEACHER, teachersList);
    }

    @Override
    public void sort() {
        teachersList.clear();
        teachersList = ReadAndWriteFile.readTeacher(PATH_TEACHER);
        System.out.println("1\t Sắp xếp theo tên\n" +
                "2\t Sắp xếp theo ngày sinh\n" +
                "\t Enter your choice\n");
        int choice = CheckException.checkparseInt();
        if (choice == 1) {
            Collections.sort(teachersList, new PersonNameComparator());
            for (Teacher item : teachersList) {
                System.out.println(item);
            }
        } else if (choice == 2) {
            Collections.sort(teachersList, new PersonDateComparator());
            for (Teacher item : teachersList) {
                System.out.println(item);
            }
        } else {
            System.out.println("lựa chọn không đúng");
        }

    }

    @Override
    public void edit() {
        teachersList.clear();
        teachersList = ReadAndWriteFile.readTeacher(PATH_TEACHER);
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teachersList.size(); i++) {
            if (teachersList.get(i).getId() == idEdit) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();

                System.out.println("Nhập giới tính");
                String sex = menuSex();

                System.out.println("Nhập ngày sinh");
                String age = scanner.nextLine();
                Regex.regexAge(age);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();

                System.out.println("Nhập lương một giờ dạy");
                Double salary = Regex.regexPositiveNumber();

                System.out.println("Nhập số giờ dạy");
                Double teachingHours = Regex.regexPositiveNumber();


                int id = idEdit;

                Teacher teachers = new Teacher(id, name, sex, age, address, salary, teachingHours);
                teachersList.set(i, teachers);

                count++;
                ReadAndWriteFile.writeTeacher(PATH_TEACHER, teachersList);
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
