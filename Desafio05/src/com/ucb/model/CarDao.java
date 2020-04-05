package com.ucb.model;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
	//Properties
	private List<Car> cars = new ArrayList<Car>();
	//Constructor
	//toString
	//Acessors
	//Methods
	public String addCar(Car car) {
		if(this.cars.add(car))
			return "Car "+car.getModel()+" added successfully!";
		else
			return "Error to try add "+car.getModel()+"!";
	}
	public String remCar(Car car) {
		if(this.cars.remove(car))
			return "Car "+car.getModel()+" removed successfully!";
		else
			return "Error to try remove "+car.getModel()+"!";
	}
	public Car getCar(String chassi) {
		for(Car car : this.cars) {
			if(car.getChassi().equals(chassi))
				return car;
		}
		return null;
	}
	public List<Car> getAll() {
		return new ArrayList<Car>(this.cars);
	}
}
