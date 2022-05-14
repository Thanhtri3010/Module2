package _06_inheritace.bai_tap.point_and_moveablepoint;

public class MoveTest {
    public static void main(String[] args) {
        Point moveablePoint = new MoveablePoint();
        moveablePoint = new MoveablePoint(6, 9);
        System.out.println(moveablePoint);

    }
}
