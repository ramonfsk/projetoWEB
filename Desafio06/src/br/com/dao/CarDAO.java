package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.CarBean;

public class CarDAO {

	private static List<CarBean> cars = null;
	
	public CarDAO() {
		if(cars == null) {
			cars = new ArrayList<CarBean>();
			cars.add(new CarBean("Uno", "Fiat"));
			cars.add(new CarBean("Gol", "Volkswagen"));
			cars.add(new CarBean("X", "Tesla"));
		}
	}
	
	public boolean addCar(CarBean car) {
		if(cars.add(car))
			return true;
		else
			return false;
	}
	
	public boolean remCar(CarBean car) {
		for (CarBean carBean : cars) {
			if(carBean.getModel().equals(car.getModel())) {
				cars.remove(carBean);
				return true;
			}
		}
		return false;
	}
	
	public void showCars() {
		for (CarBean carBean : cars) {
			System.out.println("Model: "+carBean.getModel());
		}
	}
	
	public ArrayList<CarBean> getAll() {
		return new ArrayList<CarBean>(cars);
	}
}
