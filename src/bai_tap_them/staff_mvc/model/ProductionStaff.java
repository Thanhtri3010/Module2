package bai_tap_them.staff_mvc.model;

import bai_tap_them.staff_mvc.service.Timekeeping;

public class ProductionStaff extends Staff implements Timekeeping {
    private int productNumber;

    public ProductionStaff() {
    }

    public ProductionStaff(int productNumber) {
        this.productNumber = productNumber;
    }

    public ProductionStaff(String name, int age, String address, int productNumber) {
        super(name, age, address);
        this.productNumber = productNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public double salaryStaff() {
        return this.productNumber * 50000;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString() +
                "productNumber=" + productNumber +
                '}' + "salary= " + salaryStaff();
    }

    @Override
    public void timekeeping() {
        System.out.println("Đã chấm công");
    }
}
