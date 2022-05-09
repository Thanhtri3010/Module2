package _03_array_to_java.bai_tap;

import java.util.Scanner;

public class LargestElement2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Nhập chiều rộng mảng");
        int n = Integer.parseInt(input.nextLine());

        int [][] array2D = new int[m][];
        for (int i = 0; i <m; i++) {
            array2D[i]= new int[n];
            for (int j = 0; j <n ; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                array2D[i][j]=Integer.parseInt(input.nextLine());
            }
        }
        int max = array2D[0][0];
        int indexI = 0;
        int indexJ = 0;
        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i <array2D.length ; i++) {
            for (int j = 0; j <array2D[i].length ; j++) {
                if (array2D[i][j] > max) {
                    max = array2D[i][j];
                    indexI = i;
                    indexJ = j;
                }
                System.out.print(array2D[i][j] + " ");
            }

        }
        System.out.println(" \n Phần tử lớn nhất là " + max + ", ở vị trí " + indexI + "-" + indexJ);
    }
}
