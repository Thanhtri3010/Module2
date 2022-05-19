package _11_queue.bai_tap.check_brackets;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Nhập biểu thức cần xét");
        String str = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    flag = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (!flag || !bStack.isEmpty()) {
            System.out.println("???");
        } else {
            System.out.println("Well");
        }
    }
}
