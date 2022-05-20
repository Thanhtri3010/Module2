package _11_queue.bai_tap.demerging;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<Demerging> queueNu = new LinkedList<>();
        Queue<Demerging> queueNam = new LinkedList<>();
        List<Demerging> person = new ArrayList<>();
        person.add(new Demerging("Nguyệt", false, 1999));
        person.add(new Demerging("Trí", true, 1993));
        person.add(new Demerging("Vy", false, 1992));
        person.add(new Demerging("Linh", false, 1991));
        Collections.sort(person);
        for (Demerging item: person) {
            System.out.println(item);
        }
        for (Demerging demerging : person) {
            if (!demerging.isGender()) {
                queueNu.add(demerging);
            } else {
                queueNam.add(demerging);
            }
        }
        System.out.println();
        while (!queueNu.isEmpty()) {
            System.out.println(queueNu.poll());
        }
        while (!queueNam.isEmpty()) {
            System.out.println(queueNam.poll());
        }
    }
}
