package bai_tap_them.staff_mvc.model;

import bai_tap_them.staff_mvc.service.Timekeeping;

public class ManagementStaff extends Staff implements Timekeeping {
    private double basicSalary;
    private double coefficientsSalary;

    public ManagementStaff() {
    }

    public ManagementStaff(double basicSalary, double coefficientsSalary) {
        this.basicSalary = basicSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagementStaff(String name, int age, String address, double basicSalary, double coefficientsSalary) {
        super(name, age, address);
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
    public double salaryStaff() {
        return this.basicSalary * this.coefficientsSalary;
    }

    @Override
    public String toString() {
        return "ManagementStaff{" + super.toString() +
                "basicSalary=" + basicSalary +
                ", coefficientsSalary=" + coefficientsSalary +
                '}' + "salary= " + salaryStaff();
    }

    @Override
    public void timekeeping() {
        System.out.println("Đã chấm công");
    }
}
