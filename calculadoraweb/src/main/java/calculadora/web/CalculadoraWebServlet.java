package calculadora.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculadora.controller.CalculadoraController;

@WebServlet(urlPatterns = "/resultado")
public class CalculadoraWebServlet extends HttpServlet {

	/**
	 * serial
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Método do post, recebe os valores via parametro post e retorna o resultado
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/**
		 * Recebendo os parametros e efetuando o parse de alguns
		 */
		String operacao = req.getParameter("operacao");
		float valorUm = Float.parseFloat(req.getParameter("primeiro"));
		float valorDois = Float.parseFloat(req.getParameter("segundo"));
		
		/**
		 * Efetuando o calculo e recebendo a resposta
		 */
		String resultado = new CalculadoraController().calcula(valorUm, valorDois, operacao);
		
		/**
		 * Criando o escritor de tela?
		 */
		PrintWriter out = resp.getWriter();
		
		/**
		 * Enviando a resposta ao cliente
		 */
		out.println("<http><body>"+resultado+"</body></http>");
	}
}
