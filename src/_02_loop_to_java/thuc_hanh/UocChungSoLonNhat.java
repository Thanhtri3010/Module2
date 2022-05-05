package _02_loop_to_java.thuc_hanh;

import java.util.Scanner;

public class UocChungSoLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số a ");
        a = input.nextInt();
        System.out.println("nhập số b ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không phải là uớc chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("uớc chung lớn nhất là: " + a);
    }
}
