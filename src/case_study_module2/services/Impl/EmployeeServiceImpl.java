package case_study_module2.services.Impl;

import case_study_module2.models.person.Employee;
import case_study_module2.services.EmployeeService;
import case_study_module2.services.exception.RegexData;
import case_study_module2.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/person/employee.csv");
        employeeList.clear();
        for (String[] item : listStr) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], Integer.parseInt(item[2]), item[3], item[4], item[5], item[6], item[7], Integer.parseInt(item[8]));
            employeeList.add(employee);
        }
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/person/employee.csv");
        for (String[] item : listStr) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], Integer.parseInt(item[2]), item[3], item[4], item[5], item[6], item[7], Integer.parseInt(item[8]));
            employeeList.add(employee);
        }

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

        String level = null;
        while (level == null) {
            System.out.println("--------Nhập trình độ nhân viên---------\n" +
                    "\t1. Trung cấp \n" +
                    "\t2. Cao đẳng \n" +
                    "\t3. Đại học \n" +
                    "\t4. Sau đại học \n" +
                    "\tEnter: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao đẳng";
                    break;
                case 3:
                    level = "Đại học";
                case 4:
                    level = "Sau đại học";
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }

        String position = null;
        while (position == null) {
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
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Phục Vụ";
                    break;
                case 3:
                    position = "Chuyên viên";
                    break;
                case 4:
                    position = "Giám Sát";
                    break;
                case 5:
                    position = "Quản lý";
                    break;
                case 6:
                    position = "Giám Đốc";
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }

        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
        String line = "";
        for (Employee item : employeeList) {
            line += item.getId() + ","
                    + item.getName() + ","
                    + item.getAge() + ","
                    + item.getSex() + ","
                    + item.getIdCard() + ","
                    + item.getEmail() + ","
                    + item.getLevel() + ","
                    + item.getPosition() + ","
                    + item.getSalary() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/person/employee.csv", line);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void edit() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/person/employee.csv");
        for (String[] item : listStr) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], Integer.parseInt(item[2]), item[3], item[4], item[5], item[6], item[7], Integer.parseInt(item[8]));
            employeeList.add(employee);
        }
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

                String level = null;
                while (level == null) {
                    System.out.println("--------Nhập trình độ nhân viên---------\n" +
                            "\t1. Trung cấp \n" +
                            "\t2. Cao đẳng \n" +
                            "\t3. Đại học \n" +
                            "\t4. Sau đại học \n" +
                            "\tEnter: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            level = "Trung cấp";
                            break;
                        case 2:
                            level = "Cao đẳng";
                            break;
                        case 3:
                            level = "Đại học";
                            break;
                        case 4:
                            level = "Sau đại học";
                            break;
                        default:
                            System.out.println("Nhập sai vui lòng nhập lại");
                    }
                }

                String position = null;
                while (position == null) {
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
                            position = "Lễ tân";
                            break;
                        case 2:
                            position = "Phục Vụ";
                            break;
                        case 3:
                            position = "Chuyên viên";
                            break;
                        case 4:
                            position = "Giám Sát";
                            break;
                        case 5:
                            position = "Quản lý";
                            break;
                        case 6:
                            position = "Giám Đốc";
                            break;
                        default:
                            System.out.println("Nhập sai vui lòng nhập lại");
                    }
                }
                System.out.println("Nhập lương");
                int salary = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setName(name);
                employeeList.get(i).setAge(age);
                employeeList.get(i).setSex(sex);
                employeeList.get(i).setIdCard(idCard);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPosition(position);
                employeeList.get(i).setSalary(salary);
                String line = "";
                for (Employee item : employeeList) {
                    line += item.getId() + ","
                            + item.getName() + ","
                            + item.getAge() + ","
                            + item.getSex() + ","
                            + item.getIdCard() + ","
                            + item.getEmail() + ","
                            + item.getLevel() + ","
                            + item.getPosition() + ","
                            + item.getSalary() + "\n";
                }
                ReadAndWrite.writeFile("src/case_study_module2/data/person/employee.csv", line);
                count++;
                System.out.println("Sửa thành công");
                break;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

}
