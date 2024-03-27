package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.PaymentService;

public class ContractProcessor {
	private PaymentService service;

	public ContractProcessor(PaymentService service) {
		this.service = service;
	}

	public void process(Contract c, int qtMonths) {
		double basic = c.getTotal() / qtMonths;
		for (int i = 1; i <= qtMonths; i++) {
			LocalDate date = c.getDate().plusMonths(i);
			
			double amount = basic;
			amount += service.interest(amount, i);
			amount += service.fee(amount);

			c.addInstallment(new Installment(date, amount));
		}
	}

	public PaymentService getService() {
		return service;
	}
}
