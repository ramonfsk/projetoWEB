package br.com.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.UserBean;

public class UserDAO {
	
	private static List<UserBean> users = null;
	
	public UserDAO() {
		if(users == null) {
			users = new ArrayList<UserBean>();
			users.add(new UserBean("admin@mail.com", "123"));
		}
	}
	
	public boolean addUser(UserBean user) {
		if(users.add(user))
			return true;
		else
			return false;
	}
	
	public boolean remUser(UserBean user) {
		for (UserBean userBean : users) {
			if(userBean.getEmail().equals(user.getEmail())) {
				users.remove(userBean);
				return true;
			}
		}
		return false;
	}
	
	public void showUsers() {
		for (UserBean userBean : users) {
			System.out.println("User: "+userBean.getEmail());
		}
	}
	
	public ArrayList<UserBean> getAll() {
		return new ArrayList<UserBean>(users);
	}
}
