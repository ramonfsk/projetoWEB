package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculo")
public class CalculoServlet extends HttpServlet {
	//Properties
	//Constructors
	//Accessors
	//Methods
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		String operator = req.getParameter("operator");
		double result = 0;
		
		if(operator.equals("+")) {
			result = (num1 + num2);
		} else if(operator.equals("-")) {
			result = (num1 - num2);
		} else if(operator.equals("x")) {
			result = (num1 * num2);
		} else {
			result = (num1 / num2);
		}
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>Calculadora</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("Resultado: "+result);
			out.print("</body>");
		out.print("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
