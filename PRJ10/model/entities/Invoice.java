package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;

	public Invoice(Double basicPayment, Double tax) {
		setBasicPayment(basicPayment);
		setTax(tax);
	}

	public Double getTotalPayment() {
		return basicPayment + tax;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public Double getTax() {
		return tax;
	}

}
