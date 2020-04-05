package com.ucb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ucb.model.User;
import com.ucb.model.UserDao;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	//Properties
	private UserDao users = new UserDao();
	//Constructor
	public LoginServlet() {
		this.users.addUser(new User("admin", "$123"));
		this.users.addUser(new User("ramon", "$000"));
	}
	//toString
	//Acessors
	//Methods
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("txtName");
		String passwd = req.getParameter("txtPassword");
		User user = new User(name, passwd);
		System.out.println(user.toString());
		
		if(checkUser(user)) {
			RequestDispatcher resDisp = req.getRequestDispatcher("/ListCars.jsp");
			req.setAttribute("name", name);
			resDisp.forward(req, resp);
		} else {
			PrintWriter out = resp.getWriter();
			out.print("<html>");
				out.print("<head>");
					out.print("<title>Desafio 05</title>");
				out.print("</head>");
				out.print("<body>");
					out.print("<h1>Login inválido!</h1>");
				out.print("</body>");
			out.print("</html>");
		}	
	}
	
	private boolean checkUser(User user) {
		boolean flag;
		for (User usr : this.users.getAll()) {
			if(usr.getName().equals(user.getName()) && usr.getPassword().equals(user.getPassword()))
				return true;
		}
		return false;
	}
}
