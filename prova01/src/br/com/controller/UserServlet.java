package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.UserBO;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch(request.getParameter("btnSubmit")) {
		case "login":
			login(request, response);
			break;
		case "register":
			//Funcionalidade ainda será implementada...
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + request.getParameter("btnSubmit"));
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBO userBO = new UserBO();
		String result = userBO.login(request.getParameter("txtUsername"), request.getParameter("txtPassword"));
		
		if(result.equals("home.jsp")) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-success\" role=\"alert\">\n" + 
						"Usuário "+request.getParameter("txtUsername")+" logado com sucesso!\n" + 
					"</div>"
			);
		} else {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
						"Senha ou login incorretos!\n" + 
					"</div>"
			);
		}
		
		request.getRequestDispatcher(result).forward(request, response);
	}

}
