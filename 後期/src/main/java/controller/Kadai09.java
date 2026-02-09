package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Product;

/**
 * Servlet implementation class Kadai09
 */
@WebServlet("/ECCPizza")
public class Kadai09 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Product> menuList = new ArrayList<>();
		menuList.add(new Product("Pi001", "マルゲリータ", "ピザ", "margherita.jpg", 1200));
		menuList.add(new Product("Pi002", "ペパロニ", "ピザ", "pepperoni.jpg", 1500));
		menuList.add(new Product("Pa001", "ホロネーゼ", "パスタ", "bolognese.jpg", 1200));
		menuList.add(new Product("Pa003", "カルボナーラ", "パスタ", "carbonara.jpg", 1000));

		request.setAttribute("menuList", menuList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/kadai09.jsp");
		dispatcher.forward(request, response);
	}

}
