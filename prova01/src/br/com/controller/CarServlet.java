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
 * Servlet implementation class CarServlet
 */
@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarBO carBO = new CarBO();
		String result = carBO.rentCar(Integer.parseInt(request.getParameter("id")));
		
		if(result.equals("home.jsp")) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-success\" role=\"alert\">\n" + 
						"Carro alugado com sucesso!\n" + 
					"</div>"
			);
		} else {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
						"Falha ao alugar!\n" + 
					"</div>"
			);
		}
		
		request.getRequestDispatcher(result).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarBO carBO = new CarBO();
		CarBean car = null;
		
		switch (request.getParameter("btnSubmit")) {
		case "add":
			
			String result = carBO.addCar(
					request.getParameter("txtBrand"), 
					request.getParameter("txtModel"), 
					request.getParameter("txtModelYear"), 
					request.getParameter("txtChassi"), 
					request.getParameter("txtPlateLicense"), 
					Boolean.parseBoolean(request.getParameter("boolAvailability"))
			);
			request.getRequestDispatcher(result).forward(request, response);
			break;
		case "find":
			carBO.findCar(request.getParameter("txtModelCar"));
			
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
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + request.getParameter("btnSubmit"));
		}
		
	}

}
