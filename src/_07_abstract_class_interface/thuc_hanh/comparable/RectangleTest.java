package _07_abstract_class_interface.thuc_hanh.comparable;

import _07_abstract_class_interface.thuc_hanh.interface_comparable.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        _07_abstract_class_interface.thuc_hanh.interface_comparable.Rectangle rectangle = new _07_abstract_class_interface.thuc_hanh.interface_comparable.Rectangle();
        System.out.println(rectangle);

        rectangle = new _07_abstract_class_interface.thuc_hanh.interface_comparable.Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
