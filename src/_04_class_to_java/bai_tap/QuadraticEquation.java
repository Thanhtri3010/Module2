package _04_class_to_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    public double getRoot3() {
        return -b / (2 * a);
    }

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
