package br.com.bo;

import java.util.ArrayList;
import java.util.List;
import br.com.bean.CarBean;
import br.com.dao.CarDAO;

public class CarBO {
	private static CarDAO carDAO = new CarDAO();
	
	public CarBO() {};
	
	public String addCar(String brand, String model, String modelYear, String chassi, String plateLicense, boolean availability) {
		CarBean car = new CarBean(brand, model, modelYear, chassi, plateLicense, availability);
		
		if(carDAO.addCar(car))
			return "home.jsp";
		else
			return "error.jsp";
	}
	
	public String editCar(int idCar, String brand, String model, String modelYear, String chassi, String plateLicense, boolean availability) {
		CarBean car = new CarBean(brand, model, modelYear, chassi, plateLicense, availability);
		car.setId(idCar);
		
		if(carDAO.updateCar(car))
			return "home.jsp";
		else
			return "error.jsp";
	}
	
	public String remCar(int id) {
		for(CarBean car : carDAO.listCars()) {
			if(car.getId() == id) {
				if(carDAO.remCar(car))
					return "home.jsp";
			}
		}
		return "error.jsp";
	}
	
	public List<CarBean> listCars() {
		return carDAO.listCars();
	}
	
	public List<CarBean> listCarsAvailable() {
		List<CarBean> cars = new ArrayList<CarBean>();
		
		for(CarBean carBean : carDAO.listCars()) {
			if(carBean.isAvailability())
				cars.add(carBean);
		}
		return cars;
	}
	
	public String rentCar(int id) {
		for(CarBean car : carDAO.listCars()) {
			if(car.getId() == id) {
				car.setAvailability(false);
				if(carDAO.updateCar(car))
					return "home.jsp";
			}
		}
		return "error.jsp";
	}

	public List<CarBean> findCarByModel(String model) {		
		return carDAO.getCarsToModel(model);
	}
	
	public CarBean findCarById(int id) {
		return carDAO.getCarToId(id);
	}
}
