package case_study_module2.services.Impl;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.faciity.House;
import case_study_module2.models.faciity.Room;
import case_study_module2.models.faciity.Villa;
import case_study_module2.services.FacilityService;
import case_study_module2.services.exception.RegexData;
import case_study_module2.utils.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements FacilityService {
    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();

    @Override
    public void display() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/villa.csv");
        facilityMap.clear();
        for (String[] item : listStr) {
            Villa villa = new Villa(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
            int used = Integer.parseInt(item[9]);
            facilityMap.put(villa, used);
        }
        listStr.clear();
        listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/house.csv");
        for (String[] item : listStr) {
            House house = new House(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7]));
            int used = Integer.parseInt(item[8]);
            facilityMap.put(house, used);
        }
        listStr.clear();
        listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/room.csv");
        for (String[] item : listStr) {
            Room room = new Room(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6]);
            int used = Integer.parseInt(item[7]);
            facilityMap.put(room, used);
            ;
        }
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            System.out.println(element.getKey() + " Số lần sử dụng" + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
        for (Facility facility : facilityMap.keySet()) {
            if (facilityMap.get(facility) > 4) {
                System.out.println(facility);
            }
        }
    }

    @Override
    public void addNewVilla() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/villa.csv");
        facilityMap.clear();
        for (String[] item : listStr) {
            Villa villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7]), Integer.parseInt(item[8]));
            int used = Integer.parseInt(item[9]);
            facilityMap.put(villa, used);
        }
        System.out.println("Nhập id");
        String id = RegexData.regexServiceCodeVilla();

        System.out.println("Nhập tên");
        String name = RegexData.regexName();

        System.out.println("Nhập diện tích");
        double area = RegexData.regexArea();

        System.out.println("Nhập giá tiền");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nhập số lượng người");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nhập kiểu thuê");
        String rentStyle = RegexData.regexName();

        System.out.println("Nhập tiêu chuẩn");
        String standard = RegexData.regexName();

        System.out.println("Nhập diện tích hồ bơi");
        double areaPool = RegexData.regexArea();

        System.out.println("nhập số tầng");
        int floor = RegexData.regexNumberOfFloors();

        Villa villa = new Villa(id, name, area, price, people, rentStyle, standard, areaPool, floor);
        facilityMap.put(villa, 0);
        String line = "";

        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/villa.csv", line);
        System.out.println("Đã thêm mới villa thành công");
    }

    @Override
    public void addNewHouse() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/house.csv");
        facilityMap.clear();
        for (String[] item : listStr) {
            House house = new House(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6], Integer.parseInt(item[7]));
            int used = Integer.parseInt(item[8]);
            facilityMap.put(house, used);
        }
        System.out.println("Nhập id");
        String id = RegexData.regexServiceCodeHouse();

        System.out.println("Nhập tên");
        String name = RegexData.regexName();

        System.out.println("Nhập diện tích");
        double area = RegexData.regexArea();

        System.out.println("Nhập giá tiền");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nhập số lượng người");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nhập kiểu thuê");
        String rentStyle = RegexData.regexName();

        System.out.println("Nhập tiêu chuẩn phòng");
        String roomStandard = RegexData.regexName();

        System.out.println("nhập số tầng");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(id, name, area, price, people, rentStyle, roomStandard, floor);
        facilityMap.put(house, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/house.csv", line);
        System.out.println("Đã thêm mới house thành công");
    }

    @Override
    public void addNewRoom() {
        List<String[]> listStr = ReadAndWrite.readTextFile("src/case_study_module2/data/facility/room.csv");
        facilityMap.clear();
        for (String[] item : listStr) {
            Room room = new Room(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4]), item[5], item[6]);
            int used = Integer.parseInt(item[7]);
            facilityMap.put(room, used);
        }
        System.out.println("Nhập id");
        String id = RegexData.regexServiceCodeRoom();

        System.out.println("Nhập tên");
        String name = RegexData.regexName();

        System.out.println("Nhập diện tích");
        double area = RegexData.regexArea();

        System.out.println("Nhập giá tiền");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nhập số lượng người");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nhập kiểu thuê");
        String rentStyle = RegexData.regexName();

        System.out.println("Nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();

        Room room = new Room(id, name, area, price, people, rentStyle, freeService);
        facilityMap.put(room, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/room.csv", line);
        System.out.println("Đã thêm mới room thành công");
    }
}
