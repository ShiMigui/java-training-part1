package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double total;
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double total) {
		this.number = number;
		this.date = date;
		this.total = total;
	}
	
	public void addInstallment(Installment i) {
		installments.add(i);
	}
	
	public void removeInstallment(Installment i) {
		installments.remove(i);
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotal() {
		return total;
	}
	
	public List<Installment> getInstallments() {
		return installments;
	}
	
	@Override
	public String toString() {
		return number + " - " + date.format(fmt) + " - $" + String.format("%.2f", total);
	}

}
