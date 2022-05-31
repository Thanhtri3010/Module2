package case_study_module2.controllers;

import case_study_module2.services.Impl.*;

import java.util.Scanner;

public class FuramaController {

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.print("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.print("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số nhập không có trong danh sách");
                    System.out.println("Nhập lại");
                    displayEmployeeMenu();
                    break;
            }
        }

    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.print("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                case 3:
                    customerService.edit();
                case 4:
                    return;
                default:
                    System.out.println("Số nhập không có trong danh sách");
                    System.out.println("Nhập lại");
                    displayCustomerMenu();
                    break;
            }
        }

    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.print("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số nhập không có trong danh sách");
                    System.out.println("Nhập lại");
                    displayFacilityMenu();
                    break;
            }
        }

    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.print("1\tAdd New Villa\n" +
                    "2\tAdd New House\n" +
                    "3\tAdd New Room\n" +
                    "4\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số nhập không có trong danh sách");
                    System.out.println("Nhập lại");
                    addNewFacilityMenu();
                    break;
            }
        }

    }


    public static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContactServiceImpl contactService = new ContactServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    bookingService.addNew();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:
                    contactService.addNew();
                    break;
                case 4:
                    contactService.display();
                    break;

            }
        }

    }

    public static void displayPromotionMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ){
                System.err.println("Bạn đã nhập sai định dạng vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
            }
        }

    }
}