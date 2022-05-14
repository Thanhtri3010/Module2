package _07_abstract_class_interface.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red", true, 5);
        shapes[1] = new Square(4.0, "blue", true);
        shapes[2] = new Rectangle(6.0, 5.0, "green", true);

        System.out.println("Before");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("After");
        double percent = Math.random() * 100;
        System.out.println("increase in size with ratio " + percent);

        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
