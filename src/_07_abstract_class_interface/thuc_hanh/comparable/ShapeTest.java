package _07_abstract_class_interface.thuc_hanh.comparable;

import _07_abstract_class_interface.thuc_hanh.interface_comparable.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        _07_abstract_class_interface.thuc_hanh.interface_comparable.Shape shape = new _07_abstract_class_interface.thuc_hanh.interface_comparable.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
