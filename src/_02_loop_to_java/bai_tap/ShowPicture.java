package _02_loop_to_java.bai_tap;

import java.util.Scanner;

public class ShowPicture {
    public static void main(String[] args) {
        int choice= -1;
        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i <3 ; i++) {
                        for (int j = 0; j <7 ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }

                    System.out.println("");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }

                    for (int i = 1; i < 6; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("\t");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("*   ");
                        }
                        System.out.println("");
                    }

                    System.out.println("");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("\t");
                        }
                        for (int j = 5; j > i; j--) {
                            System.out.print("*   ");
                        }
                        System.out.println("");
                    }break;
                case 3:
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");


            }
        }
    }
}
