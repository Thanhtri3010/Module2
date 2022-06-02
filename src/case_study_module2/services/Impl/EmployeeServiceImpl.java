package case_study_module2.services.Impl;

import case_study_module2.models.person.Employee;
import case_study_module2.services.EmployeeService;
import case_study_module2.utils.ReadAndWirte2;
import case_study_module2.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static final String EMPLOYEE_FILE_PATH = "src/case_study_module2/data/person/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        employeeList.clear();
        employeeList = ReadAndWirte2.readEmployee(EMPLOYEE_FILE_PATH);
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        employeeList.clear();
        employeeList = ReadAndWirte2.readEmployee(EMPLOYEE_FILE_PATH);

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính");
        String sex = scanner.nextLine();

        System.out.println("Nhập chứng minh");
        String idCard = scanner.nextLine();

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        String level = menuLevel();

        String position = menuPosition();

        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
        ReadAndWirte2.writeEmployee(EMPLOYEE_FILE_PATH, employeeList);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void edit() {
        employeeList.clear();
        employeeList = ReadAndWirte2.readEmployee(EMPLOYEE_FILE_PATH);
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == idEdit) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();

                System.out.println("Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập giới tính");
                String sex = scanner.nextLine();

                System.out.println("Nhập chứng minh");
                String idCard = scanner.nextLine();

                System.out.println("Nhập email");
                String email = scanner.nextLine();

                String level = menuLevel();

                String position = menuPosition();

                System.out.println("Nhập lương");
                int salary = Integer.parseInt(scanner.nextLine());
                int id = idEdit;
                Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
                employeeList.set(i, employee);
                count++;
                ReadAndWirte2.writeEmployee(EMPLOYEE_FILE_PATH, employeeList);
                System.out.println("Sửa thành công");
                break;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    public String menuLevel() {
        while (true) {
            System.out.println("--------Nhập trình độ nhân viên---------\n" +
                    "\t1. Trung cấp \n" +
                    "\t2. Cao đẳng \n" +
                    "\t3. Đại học \n" +
                    "\t4. Sau đại học \n" +
                    "\tEnter: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Đại học";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }
    }

    public String menuPosition() {
        while (true) {
            System.out.println("--------Nhập vị trí nhân viên---------\n" +
                    "\t1. Lễ tân \n" +
                    "\t2. Phục vụ \n" +
                    "\t3. Chuyên viên \n" +
                    "\t4. Giám sát \n" +
                    "\t5. Quản lý \n" +
                    "\t6. Giám đốc \n" +
                    "\tEnter: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục Vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám Sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám Đốc";
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }
    }
}
