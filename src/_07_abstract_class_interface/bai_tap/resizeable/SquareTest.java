package _07_abstract_class_interface.bai_tap.resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area before increase: " + square.getArea());
        square.resize(Math.random() * 100);
        System.out.println("Area after increase: " + square.getArea());
    }
}
