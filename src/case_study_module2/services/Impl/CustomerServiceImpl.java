package case_study_module2.services.Impl;

import case_study_module2.models.Customer;
import case_study_module2.models.Employee;
import case_study_module2.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer item : customerList) {
            System.out.println(item);
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
        System.out.println("Nhập loại khách hàng");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == idEdit) {
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
                System.out.println("NNhập loại khách hàng");
                String typeCustomer = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                int id = customerList.get(customerList.size() - 1).getId() + 1;
                Customer customer = new Customer(id, name, age, sex, idCard, email, typeCustomer, address);
                customerList.set(i, customer);
                count++;
                System.out.println("Sửa thành công");
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void delete() {

    }
}
