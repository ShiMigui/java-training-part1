package model.services.tax;

public class BrazilTaxService {
	public double tax(double amount) {
		return (amount>100)? amount * .15: amount * .2;
	}
}
