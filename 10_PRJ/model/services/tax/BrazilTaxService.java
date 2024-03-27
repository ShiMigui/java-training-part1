package model.services.tax;

import model.interfaces.TaxService;

public class BrazilTaxService implements TaxService {
	public double tax(double amount) {
		return amount * ((amount > 100) ? .15 : .2);
	}
}
