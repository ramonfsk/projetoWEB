package br.com.imc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/imc")
public class ImcServlet extends HttpServlet {
	//Properties
	private static double minValue = 18.5;
	private static double maxValue = 24.9;
	//Constructors
	//Accessors
	//Methods
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double weightPerson = Double.parseDouble(req.getParameter("txtWeight"));
		double heightPerson = Double.parseDouble(req.getParameter("txtHeight"));
		double imc = calcImc(weightPerson, heightPerson);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>IMC</title>");
			out.print("</head>");
			out.print("<body>");
				if(validateImc(imc))
					out.print("<p>Seu IMC deu "+String.format("%.2f", imc)+" e está dentro dos padrões da OMS.</p>");
				else
					out.print("<p>Seu IMC deu "+String.format("%.2f", imc)+" e está fora dos padrões da OMS, revise sua alimentacão.</p>");
			out.print("</body>");
		out.print("</html>");
		
	}
	
	private double calcImc(double weight, double height) {
		return (weight / (height * 2));
	}
	
	private boolean validateImc(double imc) {
	if(imc >= minValue && imc <= maxValue)
		return true;
	else
		return false;
	}
}
