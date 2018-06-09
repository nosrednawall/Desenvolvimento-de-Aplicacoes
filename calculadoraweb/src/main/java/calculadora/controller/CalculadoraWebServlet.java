package calculadora.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraWebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<form>");
		out.println("<div>");
		out.println(" <label for=\"primeiro\">Primeiro valor</label>");
		out.println("<input type=\"text\" name=\"primeiro\" required />");
		out.println("</div>");
		out.println("<div>");
		out.println(" <label for=\"segundo\">Segundo valor</label>");
		out.println("<input type=\"text\" name=\"segundo\" required />");
		out.println("</div>");
		out.println("<div>");
		out.println(" <label for=\"primeiro\">Primeiro valor</label>");
		out.println("<input type=\"text\" name=\"primeiro\" required />");
		out.println("</div>");
		out.println("<div>");
		out.println(" <label for=\"primeiro\">Primeiro valor</label>");
		out.println("<input type=\"text\" name=\"primeiro\" required />");
		out.println("</div>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

}
