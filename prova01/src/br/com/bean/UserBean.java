package br.com.bean;

public class UserBean {
	//Attributes
	private String username;
	private String password;
	//Constructor
	public UserBean(String email, String password) {
		this.username = email;
		this.password = password;
	}
	//Accessors
	public String getUsername() {
		return username;
	}
	public void setUsername(String email) {
		this.username = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
