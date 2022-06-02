package case_study_module2.models.person;

import case_study_module2.comma.Comma;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return super.getId()+ Comma.COMMA+
                super.getName()+ Comma.COMMA+
                super.getAge()+ Comma.COMMA+
                super.getSex()+ Comma.COMMA+
                super.getIdCard()+ Comma.COMMA+
                super.getEmail()+ Comma.COMMA+
                this.getTypeCustomer()+ Comma.COMMA+
                this.getAddress()+ Comma.COMMA+"\n";
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int id, String name, int age, String sex, String idCard, String email, String typeCustomer, String address) {
        super(id, name, age, sex, idCard, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
