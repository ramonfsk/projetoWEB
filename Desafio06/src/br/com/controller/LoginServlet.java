package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.UserBO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		UserBO userBO = new UserBO();
		String result = userBO.login(request.getParameter("txtEmail"), request.getParameter("txtPassword"));
		
		if(result.equals("home.jsp")) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-success\" role=\"alert\">\n" + 
					"  A simple success alert—check it out!\n" + 
					"</div>"
			);
		} else {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
					"  A simple danger alert—check it out!\n" + 
					"</div>"
			);
		}
		
		request.getRequestDispatcher(result).forward(request, response);
	}

}
