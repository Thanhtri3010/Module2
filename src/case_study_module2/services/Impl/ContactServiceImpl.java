package case_study_module2.services.Impl;

import case_study_module2.models.function.Contract;
import case_study_module2.services.ContactService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Contract item : contractList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNew() {
//        Queue<Booking> bookingQueue = new LinkedList<>();
//        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
//        for (Booking item : bookingSet) {
//            bookingQueue.add(item);
//        }
//        while (!bookingQueue.isEmpty()) {
//            Booking booking = bookingQueue.poll();
//            Customer customer = booking.getCustomer();
//            System.out.println("Đang tạo hợp đồng cho booking có thông tin: " + booking);
//            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
//            System.out.println("Nhập id hợp đồng: ");
//            String id = scanner.nextLine();
//            System.out.println("Nhập số tiền trả trước: ");
//            String pre = scanner.nextLine();
//            System.out.println("Nhập số chi phí: ");
//            String pay = scanner.nextLine();
//            Contract contract = new Contract(id, booking, pre, pay, customer);
//            contractList.add(contract);
//            System.out.println("Đã tạo hợp đồng thành công: " + contract.toString());
//        }
    }


}
