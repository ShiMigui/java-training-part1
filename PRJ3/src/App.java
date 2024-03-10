import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Client client = new Client();
        System.out.println("Client");
        System.out.print("Name: ");
        client.setName(sc.nextLine());
        System.out.print("Email: ");
        client.setMail(sc.nextLine());
        System.out.print("Birth date: (DD/MM/YYYY) ");
        client.setBirthDate(LocalDate.parse(sc.next(), fmt));

        System.out.println("\nOrder");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
        System.out.print("How many products? ");
        int quantityProduct = sc.nextInt();

        Order order = new Order(Instant.now(), status, client);

        for (int i = 0; i < quantityProduct; i++) {
            sc.nextLine();

            String name;
            Double price;
            Integer quantity;

            System.out.println("\nProduct #" + (i + 1));
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();

            order.addItem(name, price, quantity);
        }

        System.out.println("\n" + order);

        sc.close();
    }
}
