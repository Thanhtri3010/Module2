package _11_queue.bai_tap.test_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String inputStr = scanner.nextLine().toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        char[] arr = inputStr.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            queue.add(arr[i]);
        }
        System.out.println("Stack: " + stack);
        System.out.println("Queue: " + queue);
        if (stack.pop().equals(queue.poll())) {
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng");
        }
    }
}
