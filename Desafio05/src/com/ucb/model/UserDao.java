package com.ucb.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	//Properties
	private List<User> users = new ArrayList<User>();
	//Constructor
	public UserDao() {};
	//toString
	//Acessors
	//Methods
	public String addUser(User user) {
		if(this.users.add(user))
			return "User "+user.getName()+" added successfully!";
		else
			return "Error to try add "+user.getName()+"!";
	}
	public String remUser(User user) {
		if(this.users.remove(user))
			return "User "+user.getName()+" removed successfully!";
		else
			return "Error to try remove "+user.getName()+"!";
	}
	public User getUser(String name) {
		for(User user : this.users) {
			if(user.getName().equals(name))
				return user;
		}
		return null;
	}
	public List<User> getAll() {
		return new ArrayList<User>(this.users);
	}
}
