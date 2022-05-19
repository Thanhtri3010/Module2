package _11_queue.bai_tap.Reverse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập một chuỗi");
        String str = scanner.nextLine();
        String[] wWord = str.split("");
        System.out.println(Arrays.toString(wWord));
        for (String item : wWord) {
            wStack.push(item);
        }
        for (int i = 0; i < wWord.length; i++) {
            wWord[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(wWord));
    }
}
