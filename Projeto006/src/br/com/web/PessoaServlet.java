package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pessoa")
public class PessoaServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p = resp.getWriter();
		p.write("<html lang='pt-BR'>");
		p.write("<head>");
			p.write("<title>Projeto006</title>");
		p.write("</head>");
		p.write("<body>");
			p.write("Meu nome é Ramon!");
		p.write("</body>");
		p.write("</html>");
	}
}
