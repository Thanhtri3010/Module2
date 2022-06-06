package bai_tap_them.cong_ty_abc.models;

import bai_tap_them.cong_ty_abc.comma.Comma;

public class ManagementStaff extends Person {
    private int basicSalary;
    private int coefficientsSalary;

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

    public ManagementStaff(int basicSalary, int coefficientsSalary) {
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagementStaff(int id, String employeeCode, String name, String age, String address, int basicSalary, int coefficientsSalary) {
        super(id, employeeCode, name, age, address);
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(int coefficientsSalary) {
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
