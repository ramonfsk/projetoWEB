package com.ucb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ucb.model.Car;
import com.ucb.model.CarDao;

@WebServlet("/ListCars")
public class ListCarsServlet extends HttpServlet {
	//Properties
	private CarDao cars = new CarDao();
	//Constructor
	public ListCarsServlet() {
		this.cars.addCar(new Car("Civic", "Honda", "123ABC"));
		this.cars.addCar(new Car("Gol", "Volkswagen", "321CBA"));
		this.cars.addCar(new Car("Lancer", "Mitsubishi", "000FFF"));
	}
	//toString
	//Acessors
	//Methods
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
			out.print("<head>");
				out.print("<link rel='stylesheet' type='text/css\' href='./css/styles.css\'>");
				out.print("<title>Desafio 05</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("<ul>");
				for (Car car : this.cars.getAll()) {
					out.print("<li>"+car.getModel()+"</li>");
//					out.print("<li>"+car.getManufacturer()+"</li>");
//					out.print("<li>"+car.getChassi()+"</li>");
				}
				out.print("</ul>");
			out.print("</body>");
		out.print("</html>");
	}
}
