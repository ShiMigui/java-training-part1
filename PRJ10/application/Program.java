package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.*;
import model.services.RentalService;
import model.services.tax.BrazilTaxService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		try (Scanner sc = new Scanner(System.in)) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			double pricePerHour = 0, pricePerDay = 0;
			Vehicle vehicle = new Vehicle();
			LocalDateTime start, finish;
			CarRental rental = null;

			System.out.println("ENTER RENTAL DATA");

			System.out.print("Car model: ");
			vehicle.setModel(sc.nextLine());

			System.out.print("Pickup: (dd/MM/yyyy hh:mm) ");
			start = LocalDateTime.parse(sc.nextLine(), fmt);

			System.out.print("Return: (dd/MM/yyyy hh:mm) ");
			finish = LocalDateTime.parse(sc.nextLine(), fmt);

			// Criação do aluguel CarRental()
			rental = new CarRental(start, finish, vehicle);

			System.out.print("Enter price per hour: $");
			pricePerHour = sc.nextDouble();

			System.out.print("Enter price per day: $");
			pricePerDay = sc.nextDouble();

			RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			service.processInvoice(rental);

			System.out.println("\nINVOICE");
			System.out.println("Basic payment: $" + String.format("%.2f", rental.getInvoice().getBasicPayment()));
			System.out.println("Basic payment: $" + String.format("%.2f", rental.getInvoice().getTax()));
			System.out.println("Basic payment: $" + String.format("%.2f", rental.getInvoice().getTotalPayment()));
		} catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}

	}
}
