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
 * Servlet implementation class Kadai07
 */
@WebServlet("/Menu")
public class Kadai07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Product> pizzaList = new ArrayList<>();
		pizzaList.add(new Product("Pi001", "マルゲリータ", "ピザ", "margherita.jpg", 1200));
		pizzaList.add(new Product("Pi002", "ペパロニ", "ピザ", "pepperoni.jpg", 1500));
		pizzaList.add(new Product("Pi003", "シーフード", "ピザ", "seafood.jpg", 1500));

		List<Product> pastaList = new ArrayList<>();
		pastaList.add(new Product("Pa001", "ホロネーゼ", "パスタ", "bolognese.jpg", 1200));
		pastaList.add(new Product("Pa002", "アラビアータ", "パスタ", "arabiata.jpg", 900));
		pastaList.add(new Product("Pa003", "カルボナーラ", "パスタ", "carbonara.jpg", 1000));

		request.setAttribute("pizzaList", pizzaList);
		request.setAttribute("pastaList", pastaList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/kadai07.jsp");
		dispatcher.forward(request, response);
	}

}
