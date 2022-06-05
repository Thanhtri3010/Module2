package case_study_module2.utils;

import case_study_module2.models.faciity.House;
import case_study_module2.models.faciity.Room;
import case_study_module2.models.faciity.Villa;
import case_study_module2.models.function.Booking;
import case_study_module2.models.function.Contract;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWirte2 {
    public static void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);
        try (
                FileWriter fileWriter = new FileWriter(pathFile, false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String data : list) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void writeCustomer(String pathFile, List<Customer> customers) {
        List<String> list = new ArrayList<>();
        for (Customer item : customers) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeEmployee(String pathFile, List<Employee> employees) {
        List<String> list = new ArrayList<>();
        for (Employee item : employees) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeVilla(String pathFile, List<Villa> villas) {
        List<String> list = new ArrayList<>();
        for (Villa item : villas) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeHouse(String pathFile, List<House> houses) {
        List<String> list = new ArrayList<>();
        for (House item : houses) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeRoom(String pathFile, List<Room> rooms) {
        List<String> list = new ArrayList<>();
        for (Room item : rooms) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }

    public static void writeBooking(String pathFile, Set<Booking> bookings) {
        List<String> list = new ArrayList<>();
        for (Booking item : bookings) {
            list.add(item.getInFo());
        }
        writeFile(pathFile, list);
    }

    public static void writeContract(String pathFile, List<Contract> contracts) {
        List<String> list = new ArrayList<>();
        for (Contract item : contracts) {
            list.add(item.getInfo());
        }
        writeFile(pathFile, list);
    }


    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals(""))
                    list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Customer> readCustomer(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Customer> customerList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            customerList.add(new Customer(Integer.parseInt(arr[0]),
                    arr[1],
                    Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7]));
        }
        return customerList;
    }

    public static List<Employee> readEmployee(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            employeeList.add(new Employee(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], Integer.parseInt(arr[8])));
        }
        return employeeList;
    }

    public static List<Villa> readVilla(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Villa> villaList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            villaList.add(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8])));
        }
        return villaList;
    }

    public static List<House> readHouse(String pathFile) {
        List<String> list = readFile(pathFile);
        List<House> houseList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            houseList.add(new House(arr[0],
                    arr[1],
                    Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3]),
                    Integer.parseInt(arr[4]),
                    arr[5],
                    arr[6],
                    Integer.parseInt(arr[7])));
        }
        return houseList;
    }

    public static List<Room> readRoom(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Room> roomList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            roomList.add(new Room(item[0], item[1], Integer.parseInt(item[2]), Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], item[6]));
        }
        return roomList;
    }

    public static Set<Booking> readBooking(String pathFile) {
        List<String> list = readFile(pathFile);
        Set<Booking> bookingSet = new TreeSet<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            bookingSet.add(new Booking(Integer.parseInt(item[0]), item[1], item[2], Integer.parseInt(item[3]), item[4]));
        }
        return bookingSet;
    }

    public static List<Contract> readContract(String pathFile) {
        List<String> list = readFile(pathFile);
        List<Contract> contractList = new ArrayList<>();
        String[] item = null;
        for (String str : list) {
            item = str.split(",");
            contractList.add(new Contract(Integer.parseInt(item[0]), Integer.parseInt(item[1]), Integer.parseInt(item[2]), Integer.parseInt(item[3]), Integer.parseInt(item[4])));
        }
        return contractList;
    }
}
