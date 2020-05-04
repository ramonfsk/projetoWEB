package br.com.bo;

import br.com.bean.UserBean;
import br.com.dao.UserDAO;

public class UserBO {
	public String addUser(String username, String password) {
		UserBean user = new UserBean(username, password);
		UserDAO userDAO = new UserDAO();
		
		if(userDAO.addUser(user))
			return "home.jsp";
		else
			return "error.jsp";
	}
	
	public String login(String username, String password) {
		UserBean user = new UserBean(username, password);
		UserDAO userDAO = new UserDAO();
		
		for (UserBean userBean : userDAO.getAll()) {
			if(userBean.getUsername().equals(user.getUsername()) && userBean.getPassword().equals(user.getPassword()))
				return "home.jsp";
		}
		
		return "error.jsp";
	}
}
