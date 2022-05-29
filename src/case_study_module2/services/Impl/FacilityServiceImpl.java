package case_study_module2.services.Impl;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.faciity.House;
import case_study_module2.models.faciity.Room;
import case_study_module2.models.faciity.Villa;
import case_study_module2.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility,Integer> element: facilityIntegerMap.entrySet()){
            System.out.println("Service "+ element.getKey()+" Số lần thuê" + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
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
        System.out.println("Nhập tiêu chuẩn");
        String standard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double areaPool= Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số tầng");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa =new Villa(id,name,area,price,people,rentStyle,standard,areaPool,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");
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
        House house = new House(id, name, area,price,people, rentStyle,roomStandard,floor);
        facilityIntegerMap.put(house,0);
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
        Room room = new Room(id, name, area,price,people,rentStyle,freeService);
        facilityIntegerMap.put(room,0);
        System.out.println("Đã thêm mới room thành công");
    }
}
