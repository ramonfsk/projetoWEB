package br.com.bean;

public class CarBean {
	
	private int id;
	private String brand;
	private String model;
	private String modelYear;
	private String chassi;
	private String plateLicense;
	private boolean availability;
	
	public CarBean(String brand, String model, String modelYear, String chassi, String plateLicense, boolean availability) {
		this.brand = brand;
		this.model = model;
		this.modelYear = modelYear;
		this.chassi = chassi;
		this.plateLicense = plateLicense;
		this.availability = availability;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlateLicense() {
		return plateLicense;
	}
	public void setPlateLicense(String plateLicense) {
		this.plateLicense = plateLicense;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}
