package _04_class_to_java.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập số b");
        double b = Integer.parseInt(input.nextLine());
        System.out.println("Nhập số c");
        double c = Integer.parseInt(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm "
                    + quadraticEquation.getRoot1() + "và "
                    + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm" + quadraticEquation.getRoot3());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
