package case_study_module2.services.Impl;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.function.Booking;
import case_study_module2.models.person.Customer;
import case_study_module2.services.BookingService;
import case_study_module2.services.exception.CheckException;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.ReadAndWirte2;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final String PATH_BOOKING = "src/case_study_module2/data/function/booking.csv";

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    public void displayBooking() {
        bookingSet = ReadAndWirte2.readBooking(PATH_BOOKING);
        for (Booking item : bookingSet) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNew() {
        bookingSet.clear();
        bookingSet = ReadAndWirte2.readBooking(PATH_BOOKING);
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

        facilityIntegerMap.put(facility, facilityIntegerMap.get(facility) + 1);
        Booking booking = new Booking(id, starDate, endDate, customer.getId(), facility.getIdFacility());

        bookingSet.add(booking);
        System.out.println("Đã booking thành công.");
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng");
        for (Customer item : customerList) {
            System.out.println(item);
        }
        System.out.println("Nhập id khách hàng");
        boolean check = true;
        int id = CheckException.checkparseInt();
        while (check) {
            for (Customer item : customerList) {
                if (id == item.getId()) {
                    check = false;
                    return item;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                id = CheckException.checkparseInt();
            }
        }
        return null;
    }

    public static Facility choosefacility() {
        facilityIntegerMap.clear();
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
