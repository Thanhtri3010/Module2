package _05_static_method.bai_tap.bai_1;

public class Circle {
    private double radius = 4.0;
    private String color = "red";
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(2, radius) * PI;
    }
}
