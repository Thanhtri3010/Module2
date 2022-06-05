package case_study_module2.services.Impl;

import case_study_module2.models.person.Customer;
import case_study_module2.services.CustomerService;
import case_study_module2.utils.ReadAndWirte2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_CUSTOMER = "src/case_study_module2/data/person/customer.csv";

    @Override
    public void display() {
        customerList.clear();
        customerList = ReadAndWirte2.readCustomer(PATH_CUSTOMER);
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        customerList.clear();
        customerList = ReadAndWirte2.readCustomer(PATH_CUSTOMER);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính");
        String sex = menuSex();

        System.out.println("Nhập chứng minh");
        String idCard = scanner.nextLine();

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        String customerType = menuCustomerType();

        System.out.println("Nhập địa chỉ ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, age, sex, idCard, email, customerType, address);
        customerList.add(customer);

        ReadAndWirte2.writeCustomer(PATH_CUSTOMER, customerList);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {
        customerList.clear();
        customerList = ReadAndWirte2.readCustomer(PATH_CUSTOMER);
        int count = 0;
        System.out.println("Nhập Id muốn sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == idEdit) {
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();

                System.out.println("Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập giới tính");
                String sex = menuSex();

                System.out.println("Nhập chứng minh");
                String idCard = scanner.nextLine();

                System.out.println("Nhập email");
                String email = scanner.nextLine();

                String customerType = menuCustomerType();

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();

                int id = idEdit;

                Customer customer = new Customer(id, name, age, sex, idCard, email, customerType, address);
                customerList.set(i, customer);
                count++;

                ReadAndWirte2.writeCustomer(PATH_CUSTOMER, customerList);
                System.out.println("Sửa thành công");
                break;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
        }
    }

    public String menuCustomerType() {
        while (true) {
            System.out.println("--------Nhập loại khách hàng---------\n" +
                    "\t1. Diamond \n" +
                    "\t2. Platinium \n" +
                    "\t3. Gold \n" +
                    "\t4. Silver \n" +
                    "\t5. Member \n" +
                    "\tEnter: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
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
