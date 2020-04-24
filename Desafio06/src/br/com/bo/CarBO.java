package br.com.bo;

import br.com.bean.CarBean;
import br.com.dao.CarDAO;

public class CarBO {

	private static CarDAO carDAO = new CarDAO();
	
	public String addCar(String model, String brand) {
		CarBean car = new CarBean(model, brand);
		
		if(carDAO.addCar(car))
			return "home.jsp";
		else
			return "error.jsp";
	}
	
	public CarBean findCar(String model) {
		for (CarBean car : carDAO.getAll()) {
			if(car.getModel().toLowerCase().equals(model.toLowerCase()))
				return car;
		}
		return null;
	}
}
