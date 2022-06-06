package bai_tap_them.cong_ty_abc.models;

import bai_tap_them.cong_ty_abc.comma.Comma;

public class ProductionStaff extends Person {
    private double productNumber;
    public double productPrice;

    public ProductionStaff() {
    }

    @Override
    public String getInfo() {
        return super.getId() + Comma.COMMA +
                super.getEmployeeCode() + Comma.COMMA +
                super.getName() + Comma.COMMA +
                super.getAge() + Comma.COMMA +
                super.getAddress() + Comma.COMMA +
                this.getProductPrice() + Comma.COMMA +
                this.getProductPrice();
    }

    public ProductionStaff(double productNumber, double productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public ProductionStaff(int id, String employeeCode, String name, String age, String address, double productNumber, double productPrice) {
        super(id, employeeCode, name, age, address);
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public double getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(double productNumber) {
        this.productNumber = productNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString() +
                "productNumber=" + productNumber +
                ", productPrice=" + productPrice +
                '}';
    }
}
