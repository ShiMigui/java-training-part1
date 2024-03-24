package application;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractProcessor;
import model.services.payment.PaypalPayment;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Integer number;
			LocalDate date;
			Double total;
			Contract c;

			System.out.println("ENTER CONTRACT DATA");
			System.out.print("Number: ");
			number = sc.nextInt();
			System.out.print("Date: (dd/MM/yyyy) ");
			date = LocalDate.parse(sc.next(), fmt);
			System.out.print("Total: $");
			total = sc.nextDouble();
			c = new Contract(number, date, total);
			
			ContractProcessor cp = new ContractProcessor(new PaypalPayment());
			
			System.out.print("\nENTER THE NUMBER OF INSTALLMENTS: ");
			cp.process(c, sc.nextInt());

			
			System.out.println("\nCONTRACT: " + c.getNumber() + " - " + fmt.format(c.getDate()) + " - Total: $" + String.format("%.2f", c.getTotal()));
			System.out.println("INSTALLMENTS");
			for (Installment i : c.getInstallments()) {
				System.out.println(fmt.format(i.getDate()) + " - $" + String.format("%.2f", i.getAmount()));
			}
		} catch (Exception e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
	}
}
