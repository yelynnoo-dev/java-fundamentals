package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class kadai05
 */
@WebServlet("/Shop")
public class Kadai05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fpath = "WEB-INF/jsp/";
		String shop = request.getParameter("shop");

		if (shop != null && shop.equals("shinsaibashi")) {
			fpath += "kadai05_2.jsp";
		}else if (shop != null && shop.equals("morinomiya")) {
			fpath += "kadai05_3.jsp";
		} else {

			fpath += "kadai05.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(fpath);
		dispatcher.forward(request, response);
	}

}
