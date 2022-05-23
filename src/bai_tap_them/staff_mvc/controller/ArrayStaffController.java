package bai_tap_them.staff_mvc.controller;


import bai_tap_them.staff_mvc.service.ArrayListStaff;
import bai_tap_them.staff_mvc.service.ArrayStaff;
import bai_tap_them.staff_mvc.service.IStaffService;

import java.util.Scanner;

public class ArrayStaffController {
    public static Scanner scanner = new Scanner(System.in);
    static IStaffService iStaffService = new ArrayStaff();
    static IStaffService arrayListStaff = new ArrayListStaff();

    public static void menu() {
        while (true) {
            System.out.println("1. Display List Staff");
            System.out.println("2. Display List Management Staff");
            System.out.println("3. Display List DailyWorker");
            System.out.println("4. Display List Production Staff");
            System.out.println("5. Display Sort ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iStaffService.displayListStaff();
                    break;
                case 2:
                    iStaffService.displayListManagement();
                    break;
                case 3:
                    iStaffService.displayListDailyWorker();
                    break;
                case 4:
                    iStaffService.displayListProduction();
                    break;
                case 5:
                    System.out.println("1. Display List Sort By Salary");
                    System.out.println("2. Display List Sort Name Ascending");
                    System.out.println("3. Display List Sort Name Descending");
                    int inputDisplay = Integer.parseInt(scanner.nextLine());
                    if (inputDisplay == 1) {
                        arrayListStaff.displaySortBySalary();
                    } else if (inputDisplay == 2) {
                        arrayListStaff.displaySortNameAscending();
                    } else if (inputDisplay == 3) {
                        arrayListStaff.displaySortNameDescending();
                    } else {
                        System.out.println("Enter Again");
                    }
                    break;
                default:
                    System.out.println("Enter again");
                    break;
            }
        }
    }
}
