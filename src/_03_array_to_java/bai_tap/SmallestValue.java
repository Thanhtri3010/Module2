package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int size = Integer.parseInt(input.nextLine());
        int[] array = new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Nhập giá trị: " + i +"\n" );
            array[i]= Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        int min =array[0];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
            if (min>array[i]){
                min=array[i];
                index= i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min + " tại vị trí " + index);
    }
}
