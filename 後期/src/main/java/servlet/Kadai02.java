package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kadai02
 */
@WebServlet("/kadai02")
public class Kadai02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>マルゲリータ</h2>\n"
				+ "<div>\n"
				+ "<a href=\"images/margherita_big.jpg\" target=\"_blank\">\n"
				+ "<img src=\"images/margherita.jpg\" alt=\"マルゲリータ\">\n"
				+ "</a>\n"
				+ "<p>定番のマルゲリータピザです。<br>素材は国産にこだわっており、安全にお召し上がりいただけます。</p>\n"
				+ "<span>¥1,200</span>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
