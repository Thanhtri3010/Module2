package case_study_module2.services.Impl;

import case_study_module2.models.Facility;
import case_study_module2.models.Villa;
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

    }

    @Override
    public void addNewRoom() {

    }
}
