package _07_abstract_class_interface.thuc_hanh.comparable;

import _07_abstract_class_interface.thuc_hanh.interface_comparable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        _07_abstract_class_interface.thuc_hanh.interface_comparable.Circle circle = new _07_abstract_class_interface.thuc_hanh.interface_comparable.Circle();
        System.out.println(circle);

        circle = new _07_abstract_class_interface.thuc_hanh.interface_comparable.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5,"indigo",false);
        System.out.println(circle);
    }
}
