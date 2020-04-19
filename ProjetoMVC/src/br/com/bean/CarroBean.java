package br.com.bean;

public class CarroBean {
	//Properties
	private String fabricanteCarro;
	private String modeloCarro;
	//Constructor
	public CarroBean(String fabricanteCarro, String modeloCarro) {
		this.fabricanteCarro = fabricanteCarro;
		this.modeloCarro = modeloCarro;
	}
	//toString
	//Acessors
	public String getFabricanteCarro() {
		return fabricanteCarro;
	}
	public void setFabricanteCarro(String fabricanteCarro) {
		this.fabricanteCarro = fabricanteCarro;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	//Methods
}
