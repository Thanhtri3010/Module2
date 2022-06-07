package bai_tap_them.school.models;

import case_study_module2.comma.Comma;

public class Student extends Person{
    private String studentCode;
    private double point;

    public Student() {
    }

    @Override
    public String getInfo() {
        return super.getId()+ Comma.COMMA+
                super.getName()+Comma.COMMA+
                super.getSex()+Comma.COMMA+
                super.getAge()+Comma.COMMA+
                super.getAddress()+Comma.COMMA+
                this.getStudentCode()+Comma.COMMA+
                this.getPoint();
    }

    public Student(String studentCode, double point) {
        this.studentCode = studentCode;
        this.point = point;
    }

    public Student(int id, String name, String sex, String age, String address, String studentCode, double point) {
        super(id, name, sex, age, address);
        this.studentCode = studentCode;
        this.point = point;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Học sinh{" + super.toString()+
                "Mã sinh viên='" + studentCode + '\'' +
                ", điểm=" + point +
                '}';
    }
}

