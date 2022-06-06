package bai_tap_them.cong_ty_abc.models;

import bai_tap_them.cong_ty_abc.comma.Comma;

public class ManagementStaff extends Person {
    private double basicSalary;
    private double coefficientsSalary;

    public ManagementStaff() {
    }

    @Override
    public String getInfo() {
        return super.getId() + Comma.COMMA +
                super.getEmployeeCode() + Comma.COMMA +
                super.getName() + Comma.COMMA +
                super.getAge() + Comma.COMMA +
                super.getAddress() + Comma.COMMA +
                this.getBasicSalary() + Comma.COMMA +
                this.getCoefficientsSalary();
    }

    public ManagementStaff(double basicSalary, double coefficientsSalary) {
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagementStaff(int id, String employeeCode, String name, String age, String address, double basicSalary, double coefficientsSalary) {
        super(id, employeeCode, name, age, address);
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "ManagementStaff{" + super.toString() +
                "basicSalary=" + basicSalary +
                ", coefficientsSalary=" + coefficientsSalary +
                '}';
    }
}
