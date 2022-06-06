package bai_tap_them.cong_ty_abc.models;

import bai_tap_them.cong_ty_abc.comma.Comma;

public class ProductionStaff extends Person {
    private int productNumber;
    public int productPrice;

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

    public ProductionStaff(int productNumber, int productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public ProductionStaff(String id, String employeeCode, String name, String age, String address, int productNumber, int productPrice) {
        super(id, employeeCode, name, age, address);
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
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
