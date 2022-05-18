package bai_tap_them.student_mvc.model;


import java.io.Serializable;

public class Student extends Person implements Serializable {

    private static String className = "C0222G1";
    private  int id;
    private double point;


    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        } else {
            Student student = (Student) obj ;
            if ( student.id == student.getId() ){
                return true;
            } else {
                return false;
            }
        }
    }

    public void check(){
        System.out.println( super.gioiTinh() );
    }

    public static void main(String[] args) {

        new Student().check();
    }

    public Student(int id, double point) {
        this.id = id;
        this.point = point;
    }

    //    Nếu cùng tham số -> lỗi
//    Nếu khác tham số -> Có thể khác kiểu dữ liệu trả về.
    public String checkPoint() {
        return "Giỏi";
    }

    public int checkPoint(int point) {
        return 1;
    }

    @Override
    public String gioiTinh() {
        return "Tùy chọn";
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(double point) {
        this.point = point;
    }

    public Student(String name, int age, boolean gender, int id, double point) {
        super(name, age, gender);
        this.id = id;
        this.point = point;
    }
    public Student(String name, int age, boolean gender,  double point) {
        super(name, age, gender);
        this.point = point;
    }
    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Student.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", point=" + point +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//        if ( this.getName().compareTo(o.getName()) > 0 ){
//            return 1;
//        } else if ( this.getName().compareTo(o.getName()) < 0 ){
//            return -1;
//        } else {
//            return 0;
//        }
//    }

}
