package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime finish;
	private LocalDateTime start;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		setFinish(finish);
		setStart(start);
		setVehicle(vehicle);
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}
}
