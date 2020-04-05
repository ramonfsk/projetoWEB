package com.ucb.model;

public class Car {
	//Properties
	private String model;
	private String manufacturer;
	private String chassi;
	//Constructor
	public Car(String model, String manufacturer, String chassi) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.chassi = chassi;
	}
	//toString
	@Override
	public String toString() {
		return "Car [model=" + model + ", manufacturer=" + manufacturer + ", chassi=" + chassi + "]";
	}
	//Acessors
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	//Methods
}
