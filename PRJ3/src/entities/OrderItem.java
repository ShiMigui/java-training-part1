package entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        setQuantity(quantity);
        setProduct(product);
    }

    public OrderItem(Integer quantity, String name, Double price) {
        setQuantity(quantity);
        setProduct(name, price);
    }

    public String toString() {
        return product.toString() + " - Quantity: " + getQuantity() + " - Subtotal: " + subTotal();
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProduct(String name, Double price) {
        setProduct(new Product(name, price));
    }
}
