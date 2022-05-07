package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Độ dài vượt quá 20.");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("nhập số cần xoá khỏi mảng");
        int del = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < array.length; j++) {
            if (array[j] == del && del != array[array.length - 1]) {
                array[j] = array[j + 1];
                for (int k = j + 1; k < array.length - 1; k++) {
                    array[k] = array[k + 1];
                }
                array[array.length - 1] = 0;
                j--;
            }else if (del == array[array.length-1]){
                array[array.length -1 ] = 0;
            }
        }
        System.out.println("mảng mới là:");
        for (int j = 0; j <array.length ; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
