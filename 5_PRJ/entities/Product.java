package entities;

import util.Formatter;

public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        setName(name);
        setPrice(price);
    }

    public final String toString(){
        return priceTag().toString();
    }

    public StringBuilder priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" ").append(Formatter.currency(totalPrice()));
        return sb;
    }

    public Double totalPrice(){
        return price;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name.toUpperCase();
    }

    public final Double getPrice() {
        return price;
    }

    public final void setPrice(Double price) {
        this.price = price;
    }
}
