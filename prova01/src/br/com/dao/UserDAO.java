package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.UserBean;

public class UserDAO {
	//Atributes
	private static List<UserBean> users = null;
	//Singleton check
	public UserDAO() {
		if(users == null) {
			users = new ArrayList<UserBean>();
			users.add(new UserBean("amandacr", "5683"));
		}
	}
	//Methods
	public boolean addUser(UserBean user) {
		if(users.add(user))
			return true;
		else
			return false;
	}
	public boolean remUser(UserBean user) {
		for (UserBean userBean : users) {
			if(userBean.getUsername().equals(user.getUsername())) {
				users.remove(userBean);
				return true;
			}
		}
		return false;
	}
	public void showUsers() {
		for (UserBean userBean : users) {
			System.out.println("User: "+userBean.getUsername());
		}
	}
	public ArrayList<UserBean> getAll() {
		return new ArrayList<UserBean>(users);
	}
}
