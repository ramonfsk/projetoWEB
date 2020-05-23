package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CarBO carBO = new CarBO();
		
		switch (request.getParameter("btnSubmit")) {
			case "add":	
				addCar(request, response, carBO);
				break;
				
			case "edit":
				CarBean car = carBO.findCarById(Integer.parseInt(request.getParameter("idCar")));
				request.setAttribute("car", car);
				request.getRequestDispatcher("editCar.jsp").forward(request, response);
				break;
			
			case "updateCar":
				updateCar(request, response, carBO);
				break;
			case "rem":
				remCar(request, response, carBO);
				break;
				
			case "rent":
				rentCar(request, response, carBO);
				break;
				
			case "find":
				findCarByModel(request, response, carBO);
				break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + request.getParameter("btnSubmit"));
		}
		
	}

	private void updateCar(HttpServletRequest request, HttpServletResponse response, CarBO carBO)
			throws ServletException, IOException {
		String resultAdd = carBO.editCar(
				Integer.parseInt(request.getParameter("idCar")),
				request.getParameter("txtBrand"), 
				request.getParameter("txtModel"), 
				request.getParameter("txtModelYear"), 
				request.getParameter("txtChassi"), 
				request.getParameter("txtPlateLicense"), 
				Boolean.parseBoolean(request.getParameter("boolAvailability"))
		);
		
		request.getRequestDispatcher(resultAdd).forward(request, response);
	}

	private void remCar(HttpServletRequest request, HttpServletResponse response, CarBO carBO)
			throws ServletException, IOException {
		String result = carBO.remCar(Integer.parseInt(request.getParameter("id")));
		System.out.println("id: "+result);
		
		if(result.equals("home.jsp")) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-success\" role=\"alert\">\n" + 
						"Carro removido com sucesso!\n" + 
					"</div>"
			);
		} else {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
						"Falha ao remover!\n" + 
					"</div>"
			);
		}
		request.getRequestDispatcher(result).forward(request, response);
	}

	private void findCarByModel(HttpServletRequest request, HttpServletResponse response, CarBO carBO)
			throws ServletException, IOException {
		List<CarBean> cars = new ArrayList<CarBean>();
		cars = carBO.findCarByModel(request.getParameter("txtModelCar"));
		
		if(cars.isEmpty()) {
			request.setAttribute(
					"msg",
					"<div class=\"alert alert-danger\" role=\"alert\">\n" + 
					"  Modelo "+request.getParameter("txtModelCar")+" não encontrado!\n" + 
					"</div>"
			);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} else {
			request.setAttribute(
					"cars",
					cars
			);
			request.getRequestDispatcher("findCar.jsp").forward(request, response);
		}
	}

	private void rentCar(HttpServletRequest request, HttpServletResponse response, CarBO carBO)
			throws ServletException, IOException {
		String resultRent = carBO.rentCar(Integer.parseInt(request.getParameter("id")));
		System.out.println("id: "+resultRent);
		
		if(resultRent.equals("home.jsp")) {
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
		request.getRequestDispatcher(resultRent).forward(request, response);
	}

	private void addCar(HttpServletRequest request, HttpServletResponse response, CarBO carBO)
			throws ServletException, IOException {
		String resultAdd = carBO.addCar(
				request.getParameter("txtBrand"), 
				request.getParameter("txtModel"), 
				request.getParameter("txtModelYear"), 
				request.getParameter("txtChassi"), 
				request.getParameter("txtPlateLicense"), 
				Boolean.parseBoolean(request.getParameter("boolAvailability"))
		);
		request.getRequestDispatcher(resultAdd).forward(request, response);
	}

}
