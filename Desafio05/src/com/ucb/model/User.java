package com.ucb.model;

public class User {
	//Properties
	private String name;
	private String password;
	//Constructor
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	//toString
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	//Acessors
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//Methods
}
