package _11_queue.bai_tap.Reverse;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] array = {3, 0, 1, 0, 9, 9};
        for (Integer item : array) {
            stack.push(item);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
