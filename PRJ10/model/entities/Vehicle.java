package model.entities;

public class Vehicle {
	private String model;

	public Vehicle() {
	}

	public Vehicle(String model) {
		setModel(model);
	}

	public void setModel(String model) {
		this.model = model.toUpperCase();
	}

	public String getModel() {
		return model;
	}
}
