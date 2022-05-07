package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        System.out.println("nhập phần tử mảng 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("nhập phần tử " + (i + 1) + " :");
            array1[i] = Integer.parseInt(input.nextLine());
        }
        int[] array2 = new int[5];
        System.out.println("nhập phần tử mảng 2");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("phần tử " + (i + 1) + " :");
            array2[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("Mảng 1: ");
        for (int value1 : array1) {
            System.out.print(value1 + " ");
        }
        System.out.println("\n Mảng 2: ");
        for (int value2 : array2) {
            System.out.print(value2 + " ");
        }
        int[] array3 = new int[array1.length + array2.length];
        System.out.println("\n Mảng 3");
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length +i]=array2[i];
        }
        for (int i = 0; i <array3.length ; i++) {
            System.out.print(array3[i]+" ");

        }
    }
}
