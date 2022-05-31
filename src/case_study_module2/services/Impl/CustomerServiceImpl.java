package case_study_module2.services.Impl;

import case_study_module2.models.person.Customer;
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

        String customerType = null;
        while (customerType == null) {
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
                    customerType="Diamond";
                    break;
                case 2:
                    customerType="Platinium";
                    break;
                case 3:
                    customerType = "Gold";
                    break;
                case 4:
                    customerType = "Silver";
                    break;
                case 5:
                    customerType = "Member";
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");
            }
        }
        System.out.println("Nhập địa chỉ ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, email, customerType, address);
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
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();

                System.out.println("Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập giới tính");
                String sex = scanner.nextLine();

                System.out.println("Nhập chứng minh");
                String idCard = scanner.nextLine();

                System.out.println("Nhập email");
                String email = scanner.nextLine();

                String customerType = null;
                while (customerType == null) {
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
                            customerType="Diamond";
                            break;
                        case 2:
                            customerType="Platinium";
                            break;
                        case 3:
                            customerType = "Gold";
                            break;
                        case 4:
                            customerType = "Silver";
                            break;
                        case 5:
                            customerType = "Member";
                            break;
                        default:
                            System.out.println("Nhập sai vui lòng nhập lại");
                    }
                }

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();

                int id = customerList.get(customerList.size() - 1).getId() + 1;
                Customer customer = new Customer(id, name, age, sex, idCard, email, customerType, address);
                customerList.set(i, customer);
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
