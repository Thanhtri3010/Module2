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
            System.out.println(element.getKey() + " S??? l???n s??? d???ng" + element.getValue());
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
        System.out.println("Nh???p id");
        String id = RegexData.regexServiceCodeVilla();

        System.out.println("Nh???p t??n");
        String name = RegexData.regexName();

        System.out.println("Nh???p di???n t??ch");
        double area = RegexData.regexArea();

        System.out.println("Nh???p gi?? ti???n");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nh???p s??? l?????ng ng?????i");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nh???p ki???u thu??");
        String rentStyle = RegexData.regexName();

        System.out.println("Nh???p ti??u chu???n");
        String standard = RegexData.regexName();

        System.out.println("Nh???p di???n t??ch h??? b??i");
        double areaPool = RegexData.regexArea();

        System.out.println("nh???p s??? t???ng");
        int floor = RegexData.regexNumberOfFloors();

        Villa villa = new Villa(id, name, area, price, people, rentStyle, standard, areaPool, floor);
        facilityMap.put(villa, 0);
        String line = "";

        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/villa.csv", line);
        System.out.println("???? th??m m???i villa th??nh c??ng");
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
        System.out.println("Nh???p id");
        String id = RegexData.regexServiceCodeHouse();

        System.out.println("Nh???p t??n");
        String name = RegexData.regexName();

        System.out.println("Nh???p di???n t??ch");
        double area = RegexData.regexArea();

        System.out.println("Nh???p gi?? ti???n");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nh???p s??? l?????ng ng?????i");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nh???p ki???u thu??");
        String rentStyle = RegexData.regexName();

        System.out.println("Nh???p ti??u chu???n ph??ng");
        String roomStandard = RegexData.regexName();

        System.out.println("nh???p s??? t???ng");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(id, name, area, price, people, rentStyle, roomStandard, floor);
        facilityMap.put(house, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/house.csv", line);
        System.out.println("???? th??m m???i house th??nh c??ng");
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
        System.out.println("Nh???p id");
        String id = RegexData.regexServiceCodeRoom();

        System.out.println("Nh???p t??n");
        String name = RegexData.regexName();

        System.out.println("Nh???p di???n t??ch");
        double area = RegexData.regexArea();

        System.out.println("Nh???p gi?? ti???n");
        int price = RegexData.regexRentalCosts();

        System.out.println("Nh???p s??? l?????ng ng?????i");
        int people = RegexData.regexNumberPeople();

        System.out.println("Nh???p ki???u thu??");
        String rentStyle = RegexData.regexName();

        System.out.println("Nh???p d???ch v??? mi???n ph??");
        String freeService = scanner.nextLine();

        Room room = new Room(id, name, area, price, people, rentStyle, freeService);
        facilityMap.put(room, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> element : facilityMap.entrySet()) {
            line += element.getKey().getInfo() + "," + element.getValue() + "\n";
        }
        ReadAndWrite.writeFile("src/case_study_module2/data/facility/room.csv", line);
        System.out.println("???? th??m m???i room th??nh c??ng");
    }
}
