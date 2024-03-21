package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        setPrice(price);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public Double getPrice() {
        return price;
    }

    public String getPriceFmtd() {
        return String.format("%.2f", price);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + " - $ " + getPriceFmtd();
    }
}
