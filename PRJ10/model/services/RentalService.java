package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;
import model.interfaces.TaxService;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		setPricePerHour(pricePerHour);
		setPricePerDay(pricePerDay);
		setTaxService(taxService);
	}

	public void processInvoice(CarRental rental) {
		double hours = Duration.between(rental.getStart(), rental.getFinish()).toMinutes() / 60.0;

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

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

}
