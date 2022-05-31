package case_study_module2.services.Impl;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.faciity.House;
import case_study_module2.models.faciity.Room;
import case_study_module2.models.faciity.Villa;
import case_study_module2.services.FacilityService;
import case_study_module2.services.exception.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_FLOOR = "^[1-9]{1}$";


    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " Số lần thuê" + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        String id = inputId();

        String name = inputName();

        double area = Double.parseDouble(inputArea());

        int price = Integer.parseInt(inputTotalPay());

        int people = Integer.parseInt(inputPeople());

        String rentStyle = inputRentStyle();

        String standard = inputStandard();

        double areaPool = Double.parseDouble(inputAreaPool());

        int floor = Integer.parseInt(inputFloor());
        Villa villa = new Villa(id, name, area, price, people, rentStyle, standard, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới villa thành công");
    }

    private String inputId() {
        System.out.println("Nhập id mã dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, mã dịch vụ phải có dạng là SVVL-XXXX");
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, tên dịch vụ phải viết hoa chữ cái đầu");
    }

    private String inputArea() {
        System.out.println("Nhập diện tích: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích phải lớn hơn 30m2");
    }

    private String inputTotalPay() {
        System.out.println("Nhập giá tiền: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT, "Bạn đã nhập sai định dạng, giá tiền phải là số dương");
    }

    private String inputPeople() {
        System.out.println("Nhập số lượng người: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT, "Bạn đã nhập sai định dạng, số luợng người phải lớn hơn 0 và nhỏ hơn 20");
    }

    private String inputRentStyle() {
        System.out.println("Nhập kiểu thuê: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, kiểu thuê phải viết hoa chữ cái đầu");
    }

    private String inputStandard() {
        System.out.println("Nhập tiêu chuẩn: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "Bạn đã nhập sai định dạng, tiêu chuân phải viết hoa chữ cái đầu");
    }
    private String inputAreaPool() {
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "Bạn đã nhập sai định dạng, diện tích hồ bơi phải lớn hơn 30m2");
    }
    private String inputFloor() {
        System.out.println("Nhập số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FLOOR, "Bạn đã nhập sai định dạng, số tần phải lớn hơn 1 và nhỏ hơn 9 tầng");
    }


    @Override
    public void addNewHouse() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String rentStyle = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = scanner.nextLine();
        System.out.println("nhập số tầng");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(id, name, area, price, people, rentStyle, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới house thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id");
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập diện tích");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá tiền");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng người");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê");
        String rentStyle = scanner.nextLine();
        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        Room room = new Room(id, name, area, price, people, rentStyle, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới room thành công");
    }
}
