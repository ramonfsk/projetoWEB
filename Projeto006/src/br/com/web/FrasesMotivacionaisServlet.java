package br.com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FrasesMotivacionais")
public class FrasesMotivacionaisServlet extends HttpServlet {
	
	private String phrases[] = {
			"A persist�ncia � o caminho do �xito. - Charles Chaplin",
			"As pessoas costumam dizer que a motiva��o n�o dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente. - Zig Ziglar",
			"Motiva��o � a arte de fazer as pessoas fazerem o que voc� quer que elas fa�am porque elas o querem fazer. - Dwight Eisenhower",
			"Toda a��o humana, quer se torne positiva ou negativa, precisa depender de motiva��o. - Dalai Lama"
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
