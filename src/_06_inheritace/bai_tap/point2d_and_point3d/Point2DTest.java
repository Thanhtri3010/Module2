package _06_inheritace.bai_tap.point2d_and_point3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(5, 8);
        System.out.println("Phần Tử X " + point2D.getX() + "Phần Tử Y " + point2D.getY());
    }
}
