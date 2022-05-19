package _11_queue.bai_tap.binary_to_decimal;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số thập phân");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num = num / 2;
        }
        System.out.println("Giá trị nhị phân là");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
