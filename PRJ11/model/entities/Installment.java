package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	private LocalDate date;
	private Double amount;

	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	public String fmtdDate(DateTimeFormatter fmt) {
		return fmt.format(date);
	}
	
	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}
}
