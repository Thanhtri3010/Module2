package case_study_module2.services.Impl;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.faciity.Villa;
import case_study_module2.models.function.Booking;
import case_study_module2.models.person.Customer;
import case_study_module2.services.BookingService;
import case_study_module2.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "Tri", 25, "Male", "12345",
                "tri@gmail.com", "Vip", "Đà Nẵng"));
        customerList.add(new Customer(2, "Tuyền", 21, "FeMale", "123123",
                "tuyen@gmail.com", "Vip", "Đà Nẵng"));
        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 100,
                10, "Day", "Vip", 15, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 2", 300, 200,
                10, "Day", "Normal", 15, 2), 0);
    }

    public Set<Booking> sendBooking(){
        return bookingSet;
    }

    @Override
    public void display() {
        for (Booking item: bookingSet) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNew() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = choosefacility();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, starDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Đã booking thành công.");
    }

    @Override
    public void edit() {

    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        for (Customer item : customerList) {
            System.out.println(item.toString());
        }
        System.out.println("Nhập id khách hàng");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer item : customerList) {
                if (id == item.getId()) {
                    check = false;
                    return item;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility choosefacility() {
        System.out.println("Danh sách dịch vụ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
