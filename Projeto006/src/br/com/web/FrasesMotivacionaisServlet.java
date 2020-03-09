package br.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrasesMotivacionais")
public class FrasesMotivacionaisServlet extends HttpServlet {
	
	private String phrases[] = {
			"A persistência é o caminho do êxito. - Charles Chaplin",
			"As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente. - Zig Ziglar",
			"Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer. - Dwight Eisenhower",
			"Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação. - Dalai Lama"
	};
	
	private String randomPhrase(String phrases[]) {
		Random random = new Random();
		int index = random.nextInt(phrases.length);
		return phrases[index];
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p = resp.getWriter();
		p.write("<html lang='pt-BR'>");
		p.write("<head>");
			p.write("<title>Projeto006</title>");
		p.write("</head>");
		p.write("<body>");
			p.write("<p>"+randomPhrase(phrases)+"</p>");
		p.write("</body>");
		p.write("</html>");
		
	}
}
