package model.services;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.PaymentService;

public class ContractProcessor {
	private PaymentService service;

	public ContractProcessor(PaymentService service) {
		this.service = service;
	}

	public void process(Contract c, int qtMonths) {
		for (int i = 0; i < qtMonths; i++) {
			double amount = c.getTotal() / ((double) qtMonths);
			amount += service.interest(amount, (i + 1));
			amount += service.fee(amount);

			c.addInstallment(new Installment(c.getDate().plusMonths(i + 1), amount));
		}
	}

	public PaymentService getService() {
		return service;
	}
}
