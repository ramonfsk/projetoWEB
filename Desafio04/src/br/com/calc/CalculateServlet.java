package br.com.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateServlet() {
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
		final double num1 = Double.parseDouble(request.getParameter("num1"));
		final double num2 = Double.parseDouble(request.getParameter("num2"));
		final String operator = request.getParameter("operator");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>IMC</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("<p>Resultado: "+String.format("%.2f", calc(num1, num2, operator))+"</p>");
			out.print("</body>");
		out.print("</html>");
	}
	
	private double calc(double num1, double num2, String operator) {
		switch (operator) {
			case "+":
				return (num1 + num2);
			case "-":
				return (num1 - num2);
			case "x":
				return (num1 * num2);
			case "/":
				return (num1 / num2);
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
	}
}
