import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Product[] products;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        products = new Product[sc.nextInt()];

        for (int i = 0; i < products.length; i++) {
            System.out.println("\nProduct #" + (i + 1));
            System.out.print("Common, used or imported? (c/u/i) ");
            char type = sc.next().toLowerCase().charAt(0);

            String name;
            Double price;
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextDouble();

            if (type == 'u') {
                System.out.print("Manufacture date: (DD/MM/YYYY) ");
                products[i] = new UsedProduct(name, price, sc.next());
            } else if (type == 'i') {
                System.out.print("Customs fee: ");
                products[i] = new ImportedProduct(name, price, sc.nextDouble());
            } else {
                products[i] = new Product(name, price);
            }
        }
        sc.close();

        System.out.println("\nPRICE TAGS");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
