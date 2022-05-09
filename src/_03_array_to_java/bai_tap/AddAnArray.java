package _03_array_to_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9, 7, 2};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("nhập phần tử cần thêm");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        System.out.println("thêm tại vị trí");
        int index = Integer.parseInt(input.nextLine());
        for (int i = arr.length-1; i <index ; i--) {
            arr[i]=arr[i-1];
        }arr[index]=number;
        System.out.println(Arrays.toString(arr));
    }
}
