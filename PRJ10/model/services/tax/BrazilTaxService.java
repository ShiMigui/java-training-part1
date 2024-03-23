package model.services.tax;

import model.interfaces.TaxService;

public class BrazilTaxService implements TaxService {
	public double tax(double amount) {
		return (amount > 100) ? amount * .15 : amount * .2;
	}
}
