package _14_sort.bai_tap;

import java.util.Arrays;

public class SetInsertionSort {
    void sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        System.out.println(Arrays.toString(arr));
    }
}
