package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập chiều rộng mảng");
        int n = Integer.parseInt(input.nextLine());

        int[][] array2D = new int[m][];
        for (int i = 0; i <m; i++) {
            array2D[i]= new int[n];
            for (int j = 0; j <n ; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                array2D[i][j]=Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i <array2D.length; i++) {
            for (int j = 0; j <array2D[i].length ; j++) {
                System.out.print(array2D[i][j] + " ");
            }
        }
        System.out.println("\n");
        System.out.println("nhập cột muốn tính tông:");
        int total = 0;
        int column = Integer.parseInt(input.nextLine());
        for (int i = 0; i <array2D.length ; i++) {
            total += array2D[i][column];
        }
        System.out.println("Tổng cột là: " +column +" là " + total);
    }
}
