package bai_tap_them.school.models;

import case_study_module2.comma.Comma;

public class Teacher extends Person{
    private double salary;
    private double teachingHours;

    public Teacher() {
    }

    @Override
    public String getInfo() {
        return super.getId()+ Comma.COMMA+
                super.getName()+Comma.COMMA+
                super.getSex()+Comma.COMMA+
                super.getAge()+Comma.COMMA+
                super.getAddress()+Comma.COMMA+
                this.getSalary()+Comma.COMMA+
                this.getTeachingHours();
    }

    public Teacher(double salary, double teachingHours) {
        this.salary = salary;
        this.teachingHours = teachingHours;
    }

    public Teacher(int id, String name, String sex, String age, String address, double salary, double teachingHours) {
        super(id, name, sex, age, address);
        this.salary = salary;
        this.teachingHours = teachingHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    @Override
    public String toString() {
        return "Giảng viên {" +
                "Lương một giờ dạy=" + salary +
                ", số giờ dạy=" + teachingHours +
                '}';
    }
}
