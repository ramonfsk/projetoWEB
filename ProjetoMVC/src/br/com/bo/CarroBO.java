package br.com.bo;

import br.com.bean.CarroBean;
import br.com.dao.CarroDAO;

public class CarroBO {
	//Properties
	//Constrcutor
	//toString
	//Acessors
	//Methods
	public String insereCarro(String modeloCarro, String fabricanteCarro) {
		CarroBean carroBean = new CarroBean(modeloCarro, fabricanteCarro);
		CarroDAO carrDAO = new CarroDAO();
		
		if(carrDAO.insereCarro(carroBean))
			return "Resultado.jsp";
		else
			return "Erro.jsp";
	}
}
