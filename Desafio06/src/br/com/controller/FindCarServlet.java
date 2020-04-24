package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.CarBean;
import br.com.bo.CarBO;

/**
 * Servlet implementation class FindCarServlet
 */
@WebServlet("/FindCarServlet")
public class FindCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCarServlet() {
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
		CarBO carBO = new CarBO();
		CarBean car = carBO.findCar(request.getParameter("txtModelCar"));
		
		if(car == null) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
					"  Modelo "+request.getParameter("txtModelCar")+" não encontrado!\n" + 
					"</div>"
			);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} else {
			request.setAttribute(
					"table",
					"<table class=\"table table-bordered\">"+
						"<thead>" +
							"<tr>" +
								"<th scope=\"col\">Modelo</th>" +
								"<th scope=\"col\">Marca</th>" +
							"</tr>" +
						"</thead>" +
						"<tbody>" +
							"<td>"+car.getModel()+"</td>" +
							"<td>"+car.getBrand()+"</td>" +
						"</tbody>" +
					"</table>"
			);
			request.getRequestDispatcher("findCar.jsp").forward(request, response);
		}	
	}

}
