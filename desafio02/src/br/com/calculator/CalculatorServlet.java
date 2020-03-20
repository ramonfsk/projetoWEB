package br.com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	//Properties
	//Constructors
	//Accessors
	//Methods
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double num1;
		double num2;
		String operator;
		
		PrintWriter out = resp.getWriter();
		out.write("<html lang='pt-BR'>");
			out.write("<head>");
				out.write("<title>Desafio 02</title>");
			out.write("</head>");
			out.write("<body>");
				out.write("<h2>Calculadora</h2>");
				out.write("<form method='GET'>");
					out.write("<label for='txtNum1'>Num1: </label>");
					out.write("<input type='number' name='num1' id='txtNum1'>");
					out.write("</br>");
					out.write("<label for='txtNum2'>Num2: </label>");
					out.write("<input type='number' name='num2'id='txtNum2'>");
					out.write("</br>");
					out.write("<select name='operator'>");
						out.write("<option value='+'>+</option>");
						out.write("<option value='-'>-</option>");
						out.write("<option value='x'>x</option>");
						out.write("<option value='/'>/</option>");
					out.write("</select>");
					operator = req.getParameter("operator");
					out.write("</br>");
					out.write("<input type='submit' id='btnCalc' value='Calcular'/>");
				out.write("</form>");
				
				
				num1 = Double.parseDouble(req.getParameter("num1"));
				num2 = Double.parseDouble(req.getParameter("num2"));
				OperatingClass oc = new OperatingClass(num1, num2, operator);
				oc.calc();
				if(oc != null)
					out.write("<p>Resultado: "+String.format("%.2f", oc.getResult())+"</p>");
			out.write("</body>");
		out.write("</html>");
	}
}
