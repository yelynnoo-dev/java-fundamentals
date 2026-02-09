package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.Cart;

/**
 * Servlet implementation class Kadai06
 */
@WebServlet("/Kadai06")
public class Kadai06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String pname = request.getParameter("pname");
			int pnumber = Integer.parseInt(request.getParameter("number"));

			if (pnumber > 0) {
				List<Cart> cartList = new ArrayList<Cart>();
				cartList.add(new Cart(pname, pnumber));
				session.setAttribute("cartList", cartList);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("kadai06.jsp");
	}

}
