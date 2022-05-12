package _05_static_method.bai_tap.bai_2;

public class TestStudent {
    public static void main(String[] args) {
        Student student =new Student();
        student.setName(" Thành Tri");
        student.setClasses(" CO3 ");
        System.out.println(student.getName()+student.getClasses());
    }
}
