package br.com.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShowName")
public class MostraNomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("txtName");
//		req.getSession().setAttribute("name", name);
//		resp.sendRedirect("ShowName.jsp");
		
		RequestDispatcher resDisp = req.getRequestDispatcher("/ShowName.jsp");
		req.setAttribute("name", name);
		resDisp.forward(req, resp);
	}
}
