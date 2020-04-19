package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.CarroBean;

public class CarroDAO {
	//Properties
	private static List<CarroBean> lista = null;
	//Constructor
	public CarroDAO() {
		if(lista == null) {
			lista = new ArrayList<CarroBean>();
			CarroBean carro = new CarroBean("Opala", "Chevrolet");
			lista.add(carro);
		}
	}
	//toString
	//Acessors
	//Methods
	public boolean insereCarro(CarroBean carroBean) {
		if(lista.add(carroBean)) {
			mostraCarros();
			return true;
		} else
			return false;
	}
	
	private void mostraCarros() {
		for (CarroBean carroBean : lista) {
			System.out.println("Modelo: "+carroBean.getModeloCarro());
		}
	}
}
