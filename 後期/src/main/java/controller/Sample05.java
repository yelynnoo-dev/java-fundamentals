package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sample05
 */
@WebServlet("/Sample05")
public class Sample05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fpath = "/WEB-INF/jsp/";
		String pName = request.getParameter("pageName");

		if (pName != null && pName.equals("page1")) {
			fpath += "sample05.jsp";
		} else if (pName != null && pName.equals("page2")) {
			fpath += "sample05_2.jsp";
		} else {

			fpath += "sample05.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(fpath);
		dispatcher.forward(request, response);
	}

}
