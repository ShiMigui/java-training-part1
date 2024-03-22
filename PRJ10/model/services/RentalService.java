package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;
import model.services.tax.BrazilTaxService;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		setPricePerHour(pricePerHour);
		setPricePerDay(pricePerDay);
		setTaxService(taxService);
	}

	public void processInvoice(CarRental rental) {
		double minutes = Duration.between(rental.getStart(), rental.getFinish()).toMinutes();
	    double hours = minutes / 60;

		double basicPayment;
		if (hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);

		rental.setInvoice(new Invoice(basicPayment, tax));
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

}
