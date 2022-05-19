package _11_queue.bai_tap.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chữ");
        String str = scanner.nextLine().toLowerCase();
        Map<String, Integer> map = new TreeMap<>();
        String[] word = str.split(" ");
        int value = 1;
        for (String item: word) {
            if (!map.containsKey(item)){
                map.put(item, value);
            }else {
                map.replace(item,value+1);
                value++;
            }
        }
        System.out.println(map);
    }
}
