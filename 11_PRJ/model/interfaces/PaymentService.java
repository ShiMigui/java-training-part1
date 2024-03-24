package model.interfaces;

public interface PaymentService {
	double fee(double amount);
	double interest(double amount, int month);
}
