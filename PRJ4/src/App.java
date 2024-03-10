import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Employee[] empregrados;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        empregrados = new Employee[sc.nextInt()];

        for (int i = 0; i < empregrados.length; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("Outsourced: (y/n) ");
            Boolean outsourced = sc.next().toLowerCase().charAt(0) == 'y';

            String name;
            Integer hours;
            Double valuePerHour;

            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();

            if (!outsourced) {
                empregrados[i] = new Employee(name, hours, valuePerHour);
            } else {
                System.out.print("Additional charge: ");
                empregrados[i] = new OutsourceEmployee(name, hours, valuePerHour, sc.nextDouble());
            }
        }
        sc.close();

        System.out.println("\nPAYMENTS");
        for (Employee e : empregrados) {
            System.out.println(e);
        }
    }
}
