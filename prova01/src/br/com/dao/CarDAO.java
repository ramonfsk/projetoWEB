package br.com.dao;

import java.util.ArrayList; 
import java.util.List;
import br.com.bean.CarBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class CarDAO {
	//Attributes
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	//Constructor
	public CarDAO() {
		conn = new ConnectionFactory().getConnection();
	}
	//Methods
	public boolean addCar(CarBean carBean) {
		String sql = "INSERT INTO car (brand, model, model_year, chassi, plate_license, availability) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, carBean.getBrand());
			ps.setString(2, carBean.getModel());
			ps.setString(3, carBean.getModelYear());
			ps.setString(4, carBean.getChassi());
			ps.setString(5, carBean.getPlateLicense());
			ps.setBoolean(6, carBean.isAvailability());
			ps.execute();
			ps.close();
			return true;
		} catch (Exception e) {
			throw new RuntimeException("Erro ao inserir carro "+e);
		}
	}
	
	public boolean updateCar(CarBean carBean) {
		String sql = "UPDATE car SET brand = ?, model = ?, model_year =?, chassi = ?, plate_license = ?, availability = ? WHERE id_car = ?";
		
		try {
			ps = conn.prepareStatement(sql);			
			ps.setString(1, carBean.getBrand());
			ps.setString(2, carBean.getModel());
			ps.setString(3, carBean.getModelYear());
			ps.setString(4, carBean.getChassi());
			ps.setString(5, carBean.getPlateLicense());
			ps.setBoolean(6, carBean.isAvailability());
			ps.setInt(7, carBean.getId());
			if(ps.executeUpdate() == 1) {
				ps.close();
				return true;
			} else {
				ps.close();
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar carro "+e);
		}
		return false;
	}
	
	public boolean remCar(CarBean car) {
		String sql = "DELETE FROM car WHERE id_car = "+car.getId();
		
		try {
			st = conn.createStatement();
			if(st.executeUpdate(sql) == 1) {
				st.close();
				return true;
			} else {
				st.close();
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao remover o carro "+e);
		}
		return false;
	}
	
	public CarBean getCarToId(int id) {
		String sql = "SELECT * FROM car WHERE id_car = "+id;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				CarBean car = new CarBean(
						rs.getString("brand"), 
						rs.getString("model"), 
						rs.getString("model_year"),
						rs.getString("chassi"),
						rs.getString("plate_license"),
						rs.getBoolean("availability")
				);
				car.setId(rs.getInt("id_car"));
				return car;
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar carro "+e);
		}
		return null;
	}
	
	public List<CarBean> getCarsToModel(String model) {
		List<CarBean> cars = new ArrayList<CarBean>();
		String sql = "SELECT * FROM car WHERE model = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, model);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				CarBean car = new CarBean(
						rs.getString("brand"), 
						rs.getString("model"), 
						rs.getString("model_year"),
						rs.getString("chassi"),
						rs.getString("plate_license"),
						rs.getBoolean("availability")
				);	
				car.setId(rs.getInt("id_car"));
				cars.add(car);
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar carros "+e);
		}
		return cars;
	}
	
	public List<CarBean> listCars() {
		List<CarBean> cars = new ArrayList<CarBean>();
		
		String sql = "SELECT * FROM car";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				CarBean car = new CarBean(
						rs.getString("brand"), 
						rs.getString("model"), 
						rs.getString("model_year"),
						rs.getString("chassi"),
						rs.getString("plate_license"),
						rs.getBoolean("availability")
				);
				car.setId(rs.getInt("id_car"));
				cars.add(car);
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao listar carros "+e);
		}
		return cars;
	}
	
	/*private static List<CarBean> cars = null;
	
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
	}*/
}
