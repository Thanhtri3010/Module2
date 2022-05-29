package case_study_module2.services.Impl;

import case_study_module2.models.people.Employee;
import case_study_module2.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        employeeList.add(new Employee(1,"Hiếu",21,"nam","12456","hieu@gmail","Nhân viên","CSKH",1000));
        employeeList.add(new Employee(2,"Thuận",25,"nam","124567","thuan@gmail","Nhân viên","CSKH",1000));
        employeeList.add(new Employee(3,"Đạt",29,"nam","124568","dat@gmail","Trường Phòng","CSKH",1000));
        employeeList.add(new Employee(4,"Lâm",18,"nam","124569","lam@gmail","Nhân viên","CSKH",1000));

    }

    @Override
    public void display() {
        for (Employee item:employeeList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNew() {
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
        System.out.println("Nhập chức vụ");
        String level = scanner.nextLine();
        System.out.println("Nhập vị trí");
        String position = scanner.nextLine();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <employeeList.size() ; i++) {
            if (employeeList.get(i).getId()==idEdit){
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
                System.out.println("Nhập chức vụ");
                String level = scanner.nextLine();
                System.out.println("Nhập vị trí");
                String position = scanner.nextLine();
                System.out.println("Nhập lương");
                int salary = Integer.parseInt(scanner.nextLine());
                int id = employeeList.get(employeeList.size()-1).getId()+1;
                Employee employee = new Employee(id,name, age, sex, idCard, email, level, position, salary);
                employeeList.set(i,employee);
                count++;
                System.out.println("Sửa thành công");
            }
        }
        if (count==0){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void delete() {

    }
}
