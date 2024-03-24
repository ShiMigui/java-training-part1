package model.services.payment;

import model.interfaces.PaymentService;

public class PaypalPayment implements PaymentService {
	@Override
	public double fee(double amount) {
		return amount * .02;
	}

	@Override
	public double interest(double amount, int month) {
		return amount * .01 * month;
	}
}
