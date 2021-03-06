package _12_map.bai_tap.linked_list.model;

public class Product implements Comparable<Product> {
    private int id;
    private String nameProduct;
    private double price;
    private int amount;
    private String production;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, int amount, String production) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.production = production;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", production='" + production + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getAmount()>o.getAmount()){
            return 1;
        }else if (this.getAmount()<o.getAmount()){
            return -1;
        }else {
            return 0;
        }
    }
}
