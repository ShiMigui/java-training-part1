package entities;

import enums.OrderStatus;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

public class Order {
    private Instant moment;

    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;
    private Client client;

    private StringBuilder sb = new StringBuilder();

    public Order(Instant moment, OrderStatus status, Client client) {
        setMoment(moment);
        setClient(client);
        setStatus(status);
    }

    public String toString() {
        sb.append("Moment: " + getMomentFmtd() + "\n");
        sb.append("Status: " + getStatus() + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Items: " + "\n");
        listItems();
        sb.append("Total: $ " + totalFmtd() + "\n");
        return sb.toString();
    }

    public void listItems() {
        for (OrderItem item : items) {
            sb.append(item.toString() + "\n");
        }
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void addItem(String name, Double price, Integer quantity) {
        addItem(new OrderItem(quantity, name, price));
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public String totalFmtd() {
        return String.format("%.2f", total());
    }

    public Double total() {
        Double ttal = 0.0;
        for (OrderItem item : items) {
            ttal += item.subTotal();
        }
        return ttal;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getMomentFmtd() {
        LocalDateTime date = LocalDateTime.ofInstant(getMoment(), ZoneId.systemDefault());
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
