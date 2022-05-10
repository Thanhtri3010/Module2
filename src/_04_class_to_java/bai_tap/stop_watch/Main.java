package _04_class_to_java.bai_tap.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        /*System.out.println(Arrays.toString(array));*/
        StopWatch classStopWatch = new StopWatch();
        classStopWatch.star();
        sort(array);
        classStopWatch.stop();
        System.out.println(Arrays.toString(array));
        System.out.println("Time:" + classStopWatch.getElapsedTime() + " Mili giây");
    }

    public static void sort(int... array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
